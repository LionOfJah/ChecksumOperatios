package com.icicibank.apimgmt.service;

import org.springframework.stereotype.Service;

import com.icicibank.apimgmt.model.ResponseModel;
import com.icicibank.apimgmt.model.VerifyResponseModel;

@Service
public interface ChecksumOperationsService {

	public ResponseModel generateChecksum(String params,String key) throws Exception;
	
	public VerifyResponseModel verifyChecksum(String params,String key,String checkSum) throws Exception;
}
