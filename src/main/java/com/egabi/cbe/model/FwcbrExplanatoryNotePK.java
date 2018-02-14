package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FWCBR_EXPLANATORY_NOTE database table.
 * 
 */
@Embeddable
public class FwcbrExplanatoryNotePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date busdate;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	private String class1;

	public FwcbrExplanatoryNotePK() {
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
	public String getClass1() {
		return this.class1;
	}
	public void setClass1(String class1) {
		this.class1 = class1;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FwcbrExplanatoryNotePK)) {
			return false;
		}
		FwcbrExplanatoryNotePK castOther = (FwcbrExplanatoryNotePK)other;
		return 
			this.busdate.equals(castOther.busdate)
			&& this.accountNumber.equals(castOther.accountNumber)
			&& this.class1.equals(castOther.class1);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.busdate.hashCode();
		hash = hash * prime + this.accountNumber.hashCode();
		hash = hash * prime + this.class1.hashCode();
		
		return hash;
	}
}