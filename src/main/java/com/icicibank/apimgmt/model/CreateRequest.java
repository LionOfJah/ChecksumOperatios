package com.icicibank.apimgmt.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class CreateRequest {

	@JsonProperty("body")
	private CreateRequestBody body;

	public CreateRequest() {
		
	}

	public CreateRequestBody getBody() {
		return body;
	}

	public void setBody(CreateRequestBody body) {
		this.body = body;
	}
	
	
}
