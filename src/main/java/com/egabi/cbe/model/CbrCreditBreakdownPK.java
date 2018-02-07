package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_CREDIT_BREAKDOWN database table.
 * 
 */
@Embeddable
public class CbrCreditBreakdownPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date busdate;

	@Column(name="GL_CODE")
	private String glCode;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="PRODUCT_TYPE")
	private String productType;

	@Column(name="SUB_ACCOUNT_NO")
	private String subAccountNo;

	@Column(name="RECORD_TYPE")
	private String recordType;

	public CbrCreditBreakdownPK() {
	}
	public java.util.Date getBusdate() {
		return this.busdate;
	}
	public void setBusdate(java.util.Date busdate) {
		this.busdate = busdate;
	}
	public String getGlCode() {
		return this.glCode;
	}
	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}
	public String getBranchCode() {
		return this.branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getCustomerCode() {
		return this.customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getSubAccountNo() {
		return this.subAccountNo;
	}
	public void setSubAccountNo(String subAccountNo) {
		this.subAccountNo = subAccountNo;
	}
	public String getRecordType() {
		return this.recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrCreditBreakdownPK)) {
			return false;
		}
		CbrCreditBreakdownPK castOther = (CbrCreditBreakdownPK)other;
		return 
			this.busdate.equals(castOther.busdate)
			&& this.glCode.equals(castOther.glCode)
			&& this.branchCode.equals(castOther.branchCode)
			&& this.accountNumber.equals(castOther.accountNumber)
			&& this.currencyCode.equals(castOther.currencyCode)
			&& this.customerCode.equals(castOther.customerCode)
			&& this.productType.equals(castOther.productType)
			&& this.subAccountNo.equals(castOther.subAccountNo)
			&& this.recordType.equals(castOther.recordType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.busdate.hashCode();
		hash = hash * prime + this.glCode.hashCode();
		hash = hash * prime + this.branchCode.hashCode();
		hash = hash * prime + this.accountNumber.hashCode();
		hash = hash * prime + this.currencyCode.hashCode();
		hash = hash * prime + this.customerCode.hashCode();
		hash = hash * prime + this.productType.hashCode();
		hash = hash * prime + this.subAccountNo.hashCode();
		hash = hash * prime + this.recordType.hashCode();
		
		return hash;
	}
}