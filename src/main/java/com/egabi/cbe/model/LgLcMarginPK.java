package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the LG_LC_MARGIN database table.
 * 
 */
@Embeddable
public class LgLcMarginPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	public LgLcMarginPK() {
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
	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LgLcMarginPK)) {
			return false;
		}
		LgLcMarginPK castOther = (LgLcMarginPK)other;
		return 
			this.accountNumber.equals(castOther.accountNumber)
			&& this.customerCode.equals(castOther.customerCode)
			&& this.currencyCode.equals(castOther.currencyCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.accountNumber.hashCode();
		hash = hash * prime + this.customerCode.hashCode();
		hash = hash * prime + this.currencyCode.hashCode();
		
		return hash;
	}
}