package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_NEGATIVE_LIST database table.
 * 
 */
@Embeddable
public class CbrNegativeListPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date busdate;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="LOAN_TYPE")
	private long loanType;

	public CbrNegativeListPK() {
	}
	public java.util.Date getBusdate() {
		return this.busdate;
	}
	public void setBusdate(java.util.Date busdate) {
		this.busdate = busdate;
	}
	public String getBranchCode() {
		return this.branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getCustomerCode() {
		return this.customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public long getLoanType() {
		return this.loanType;
	}
	public void setLoanType(long loanType) {
		this.loanType = loanType;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrNegativeListPK)) {
			return false;
		}
		CbrNegativeListPK castOther = (CbrNegativeListPK)other;
		return 
			this.busdate.equals(castOther.busdate)
			&& this.branchCode.equals(castOther.branchCode)
			&& this.customerCode.equals(castOther.customerCode)
			&& (this.loanType == castOther.loanType);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.busdate.hashCode();
		hash = hash * prime + this.branchCode.hashCode();
		hash = hash * prime + this.customerCode.hashCode();
		hash = hash * prime + ((int) (this.loanType ^ (this.loanType >>> 32)));
		
		return hash;
	}
}