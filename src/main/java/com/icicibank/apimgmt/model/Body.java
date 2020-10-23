package com.icicibank.apimgmt.model;

import org.springframework.stereotype.Component;

@Component
public class Body {

	private FundAmount fundAmount;
	private String fundType;
	private String accountNo;
	private String extendInfo;
	public Body() {
		super();
		// TODO Auto-generated constructor stub
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
