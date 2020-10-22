package com.icicibank.apimgmt.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ResponseModel {

	private String checkSumValue;

	public ResponseModel() {
		
	}

	public String getCheckSumValue() {
		return checkSumValue;
	}

	public void setCheckSumValue(String checkSumValue) {
		this.checkSumValue = checkSumValue;
	}
	
}
