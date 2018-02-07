package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the BANK_CLASS database table.
 * 
 */
@Embeddable
public class BankClassPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date busdate;

	private String custno;

	public BankClassPK() {
	}
	public java.util.Date getBusdate() {
		return this.busdate;
	}
	public void setBusdate(java.util.Date busdate) {
		this.busdate = busdate;
	}
	public String getCustno() {
		return this.custno;
	}
	public void setCustno(String custno) {
		this.custno = custno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BankClassPK)) {
			return false;
		}
		BankClassPK castOther = (BankClassPK)other;
		return 
			this.busdate.equals(castOther.busdate)
			&& this.custno.equals(castOther.custno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.busdate.hashCode();
		hash = hash * prime + this.custno.hashCode();
		
		return hash;
	}
}