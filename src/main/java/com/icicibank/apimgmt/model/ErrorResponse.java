package com.icicibank.apimgmt.model;

import org.springframework.stereotype.Component;

@Component
public class ErrorResponse {

	private String status;
	private String errorCode;
	private String errorMessage;
	public ErrorResponse() {
		
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}

