package com.icicibank.apimgmt.model;

import org.springframework.stereotype.Component;

@Component
public class PaytmRequestModel {
	
		
		private FundAmount fundAmount;
		private String fundType;
		private String accountNo;
		private String extendInfo;

	    public PaytmRequestModel() {
			
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

		@Override
		public String toString() {
			return "PaytmRequestModel [fundAmount=" + fundAmount + ", fundType=" + fundType + ", accountNo=" + accountNo
					+ ", extendInfo=" + extendInfo + "]";
		}
}
