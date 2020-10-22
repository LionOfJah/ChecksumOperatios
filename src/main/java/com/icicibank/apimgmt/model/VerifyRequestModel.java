package com.icicibank.apimgmt.model;

import org.springframework.stereotype.Component;

@Component
public class VerifyRequestModel {

	private String checkSumValue;
	public FundAmount fundAmount;
	public String fundType;
	public String accountNo;
	public String extendInfo;

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

	public FundAmount getFundAmount() {
		return fundAmount;
	}

	public void setFundAmount(FundAmount fundAmount) {
		this.fundAmount = fundAmount;
	}

	public String getFundType() {
		return fundType;
	}

	public void setFundType(String fundType) {
		this.fundType = fundType;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getExtendInfo() {
		return extendInfo;
	}

	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

}
