package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the GL_ACCT database table.
 * 
 */
@Embeddable
public class GlAcctPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date busdate;

	@Column(name="GL_CODE")
	private String glCode;

	@Column(name="CUST_NO_BANK_NO")
	private String custNoBankNo;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="SUB_ACCT")
	private String subAcct;

	@Column(name="CCY_CODE")
	private String ccyCode;

	@Column(name="CENTER_CODE")
	private String centerCode;

	public GlAcctPK() {
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
	public String getCustNoBankNo() {
		return this.custNoBankNo;
	}
	public void setCustNoBankNo(String custNoBankNo) {
		this.custNoBankNo = custNoBankNo;
	}
	public String getBranchCode() {
		return this.branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getSubAcct() {
		return this.subAcct;
	}
	public void setSubAcct(String subAcct) {
		this.subAcct = subAcct;
	}
	public String getCcyCode() {
		return this.ccyCode;
	}
	public void setCcyCode(String ccyCode) {
		this.ccyCode = ccyCode;
	}
	public String getCenterCode() {
		return this.centerCode;
	}
	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof GlAcctPK)) {
			return false;
		}
		GlAcctPK castOther = (GlAcctPK)other;
		return 
			this.busdate.equals(castOther.busdate)
			&& this.glCode.equals(castOther.glCode)
			&& this.custNoBankNo.equals(castOther.custNoBankNo)
			&& this.branchCode.equals(castOther.branchCode)
			&& this.subAcct.equals(castOther.subAcct)
			&& this.ccyCode.equals(castOther.ccyCode)
			&& this.centerCode.equals(castOther.centerCode);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.busdate.hashCode();
		hash = hash * prime + this.glCode.hashCode();
		hash = hash * prime + this.custNoBankNo.hashCode();
		hash = hash * prime + this.branchCode.hashCode();
		hash = hash * prime + this.subAcct.hashCode();
		hash = hash * prime + this.ccyCode.hashCode();
		hash = hash * prime + this.centerCode.hashCode();
		
		return hash;
	}
}