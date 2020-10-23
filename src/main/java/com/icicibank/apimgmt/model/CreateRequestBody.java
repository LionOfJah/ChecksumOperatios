package com.icicibank.apimgmt.model;

import org.springframework.stereotype.Component;

@Component
public class CreateRequestBody {

	
    private String fundType;
    private String notificationUrl;
    private String senderName;
    private String utrNo;
    private FundAmount fundAmount;
    private String requestId;
    private String accountNo;
    private String invokerId;
    private String extendInfo;
    private String ifscCode;
    private String txnDate;
    private String paymentMode;
    private String senderAccountNo;
    private String remitterBankIfscCode;
    private String remitterBankName;
	public CreateRequestBody() {
		
		
	}
	public String getFundType() {
		return fundType;
	}
	public void setFundType(String fundType) {
		this.fundType = fundType;
	}
	public String getNotificationUrl() {
		return notificationUrl;
	}
	public void setNotificationUrl(String notificationUrl) {
		this.notificationUrl = notificationUrl;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getUtrNo() {
		return utrNo;
	}
	public void setUtrNo(String utrNo) {
		this.utrNo = utrNo;
	}
	public FundAmount getFundAmount() {
		return fundAmount;
	}
	public void setFundAmount(FundAmount fundAmount) {
		this.fundAmount = fundAmount;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getInvokerId() {
		return invokerId;
	}
	public void setInvokerId(String invokerId) {
		this.invokerId = invokerId;
	}
	public String getExtendInfo() {
		return extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getTxnDate() {
		return txnDate;
	}
	public void setTxnDate(String txnDate) {
		this.txnDate = txnDate;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getSenderAccountNo() {
		return senderAccountNo;
	}
	public void setSenderAccountNo(String senderAccountNo) {
		this.senderAccountNo = senderAccountNo;
	}
	public String getRemitterBankIfscCode() {
		return remitterBankIfscCode;
	}
	public void setRemitterBankIfscCode(String remitterBankIfscCode) {
		this.remitterBankIfscCode = remitterBankIfscCode;
	}
	public String getRemitterBankName() {
		return remitterBankName;
	}
	public void setRemitterBankName(String remitterBankName) {
		this.remitterBankName = remitterBankName;
	}
	@Override
	public String toString() {
		return "CreateRequestBody [fundType=" + fundType + ", notificationUrl=" + notificationUrl + ", senderName="
				+ senderName + ", utrNo=" + utrNo + ", fundAmount=" + fundAmount + ", requestId=" + requestId
				+ ", accountNo=" + accountNo + ", invokerId=" + invokerId + ", extendInfo=" + extendInfo + ", ifscCode="
				+ ifscCode + ", txnDate=" + txnDate + ", paymentMode=" + paymentMode + ", senderAccountNo="
				+ senderAccountNo + ", remitterBankIfscCode=" + remitterBankIfscCode + ", remitterBankName="
				+ remitterBankName + "]";
	}
	
	
}
