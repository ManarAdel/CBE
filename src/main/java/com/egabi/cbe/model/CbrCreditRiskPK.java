package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_CREDIT_RISK database table.
 * 
 */
@Embeddable
public class CbrCreditRiskPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date busdate;

	@Column(name="BRANCH_CODE")
	private long branchCode;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="RECORD_TYPE")
	private String recordType;

	public CbrCreditRiskPK() {
	}
	public java.util.Date getBusdate() {
		return this.busdate;
	}
	public void setBusdate(java.util.Date busdate) {
		this.busdate = busdate;
	}
	public long getBranchCode() {
		return this.branchCode;
	}
	public void setBranchCode(long branchCode) {
		this.branchCode = branchCode;
	}
	public String getCustomerCode() {
		return this.customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public String getRecordType() {
		return this.recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrCreditRiskPK)) {
			return false;
		}
		CbrCreditRiskPK castOther = (CbrCreditRiskPK)other;
		return 
			this.busdate.equals(castOther.busdate)
			&& (this.branchCode == castOther.branchCode)
			&& this.customerCode.equals(castOther.customerCode)
			&& this.recordType.equals(castOther.recordType);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.busdate.hashCode();
		hash = hash * prime + ((int) (this.branchCode ^ (this.branchCode >>> 32)));
		hash = hash * prime + this.customerCode.hashCode();
		hash = hash * prime + this.recordType.hashCode();
		
		return hash;
	}
}