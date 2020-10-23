package com.icicibank.apimgmt.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class PaytmCreateRequestModel {

	@JsonProperty("request")
	private CreateRequest request;

	public PaytmCreateRequestModel() {
	
	}

	public CreateRequest getRequest() {
		return request;
	}

	public void setRequest(CreateRequest request) {
		this.request = request;
	}
	
	
}
