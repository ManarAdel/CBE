package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBE_ACCOUNT_DATA database table.
 * 
 */
@Embeddable
public class CbeAccountDataPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date busdate;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	public CbeAccountDataPK() {
	}
	public java.util.Date getBusdate() {
		return this.busdate;
	}
	public void setBusdate(java.util.Date busdate) {
		this.busdate = busdate;
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

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbeAccountDataPK)) {
			return false;
		}
		CbeAccountDataPK castOther = (CbeAccountDataPK)other;
		return 
			this.busdate.equals(castOther.busdate)
			&& this.accountNumber.equals(castOther.accountNumber)
			&& this.customerCode.equals(castOther.customerCode);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.busdate.hashCode();
		hash = hash * prime + this.accountNumber.hashCode();
		hash = hash * prime + this.customerCode.hashCode();
		
		return hash;
	}
}