package com.icicibank.apimgmt.model;

import org.springframework.stereotype.Component;

@Component
public class VerifyResponseModel {

	private String verifyStatus;

	public VerifyResponseModel() {
		
	}

	public String getVerifyStatus() {
		return verifyStatus;
	}

	public void setVerifyStatus(String verifyStatus) {
		this.verifyStatus = verifyStatus;
	}
}
