package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the GENERAL_LEDGER_BAL database table.
 * 
 */
@Embeddable
public class GeneralLedgerBalPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date busdate;

	@Column(name="GL_CODE")
	private String glCode;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="SUB_ACCOUNT_NO")
	private String subAccountNo;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="CENTER_CODE")
	private String centerCode;

	public GeneralLedgerBalPK() {
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
	public String getAccountNumber() {
		return this.accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerCode() {
		return this.customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getBranchCode() {
		return this.branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getSubAccountNo() {
		return this.subAccountNo;
	}
	public void setSubAccountNo(String subAccountNo) {
		this.subAccountNo = subAccountNo;
	}
	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getCenterCode() {
		return this.centerCode;
	}
	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof GeneralLedgerBalPK)) {
			return false;
		}
		GeneralLedgerBalPK castOther = (GeneralLedgerBalPK)other;
		return 
			this.busdate.equals(castOther.busdate)
			&& this.glCode.equals(castOther.glCode)
			&& this.accountNumber.equals(castOther.accountNumber)
			&& this.customerCode.equals(castOther.customerCode)
			&& this.branchCode.equals(castOther.branchCode)
			&& this.subAccountNo.equals(castOther.subAccountNo)
			&& this.currencyCode.equals(castOther.currencyCode)
			&& this.centerCode.equals(castOther.centerCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.busdate.hashCode();
		hash = hash * prime + this.glCode.hashCode();
		hash = hash * prime + this.accountNumber.hashCode();
		hash = hash * prime + this.customerCode.hashCode();
		hash = hash * prime + this.branchCode.hashCode();
		hash = hash * prime + this.subAccountNo.hashCode();
		hash = hash * prime + this.currencyCode.hashCode();
		hash = hash * prime + this.centerCode.hashCode();
		
		return hash;
	}
}