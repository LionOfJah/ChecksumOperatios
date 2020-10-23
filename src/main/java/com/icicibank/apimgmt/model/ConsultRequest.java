package com.icicibank.apimgmt.model;

import org.springframework.stereotype.Component;

@Component
public class ConsultRequest {

	private Body body;

	public ConsultRequest() {
		
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}
}
