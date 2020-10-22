package com.icicibank.apimgmt.model;

import org.springframework.stereotype.Component;

@Component
public class FundAmount {

	private String value;
	private String currency;
	public FundAmount() {
		
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Override
	public String toString() {
		return "FundAmount [value=" + value + ", currency=" + currency + "]";
	}
	
	
}
