package com.icicibank.apimgmt.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.icicibank.apimgmt.model.FundAmount;
import com.icicibank.apimgmt.model.PaytmRequestModel;
import com.icicibank.apimgmt.model.ResponseModel;
import com.icicibank.apimgmt.model.VerifyRequestModel;
import com.icicibank.apimgmt.model.VerifyResponseModel;
import com.icicibank.apimgmt.service.ChecksumOperationsService;

@RestController
@RequestMapping
public class ChecksumController {

	Logger logger=LoggerFactory.getLogger(ChecksumController.class);
	
	@Autowired()
	ObjectMapper mapper;
	
	@Autowired
	ChecksumOperationsService service;
	
	@Value("${app.authentication.keys}")
	String keys;
	
	@Autowired
	PaytmRequestModel payRequestModel;
	
	@Autowired
	FundAmount fundAmount;
	
	@PostMapping(value="${app.post.generate.url}",consumes="application/json",produces = "application/json")
	public ResponseEntity<ResponseModel> generateChecksum(@RequestBody PaytmRequestModel paytmRequestModel) throws Exception{
		
		 String requestParams =mapper.writeValueAsString(paytmRequestModel); 
		 logger.info("requestString "+requestParams);
		 
		 ResponseModel responseModel=service.generateChecksum(requestParams,keys);
		 
		return ResponseEntity.ok().body(responseModel);
		
	}
	
	@PostMapping(value="${app.post.verify.url}",consumes="application/json",produces = "application/json")
	public ResponseEntity<VerifyResponseModel> verifyChecksum(@RequestBody VerifyRequestModel verifyRequestModel) throws Exception{
		
		String checkSumVal=verifyRequestModel.getCheckSumValue();
		fundAmount.setCurrency(verifyRequestModel.getFundAmount().getCurrency());
		fundAmount.setValue(verifyRequestModel.getFundAmount().getValue());
		payRequestModel.setFundAmount(fundAmount);
		payRequestModel.setAccountNo(verifyRequestModel.getAccountNo());
		payRequestModel.setFundType(verifyRequestModel.getFundType());
		payRequestModel.setExtendInfo(verifyRequestModel.getExtendInfo());
		 String requestParams =mapper.writeValueAsString(payRequestModel); 
		 logger.info("requestString "+payRequestModel);
		 logger.info("checkSumVal "+checkSumVal);
		 
		 
		 VerifyResponseModel responseModel=service.verifyChecksum(requestParams,keys,checkSumVal);
		 
		return ResponseEntity.ok().body(responseModel);
		
	}
}
