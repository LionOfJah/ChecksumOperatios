package com.icicibank.apimgmt.model;

import org.springframework.stereotype.Component;

@Component
public class VerifyRequestModel {

	private String checkSumValue;
	private ConsultRequest request;

	public VerifyRequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCheckSumValue() {
		return checkSumValue;
	}

	public void setCheckSumValue(String checkSum) {
		this.checkSumValue = checkSum;
	}

	public ConsultRequest getRequest() {
		return request;
	}

	public void setRequest(ConsultRequest request) {
		this.request = request;
	}

	
}
