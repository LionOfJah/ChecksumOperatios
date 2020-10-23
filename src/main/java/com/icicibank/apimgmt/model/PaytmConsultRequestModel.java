package com.icicibank.apimgmt.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class PaytmConsultRequestModel {
	
		@JsonProperty("request")
		private ConsultRequest request;
		

	    public PaytmConsultRequestModel() {
			
		}


		public ConsultRequest getRequest() {
			return request;
		}


		public void setRequest(ConsultRequest request) {
			this.request = request;
		}


		@Override
		public String toString() {
			return "PaytmRequestModel [request=" + request + "]";
		}

	
}
