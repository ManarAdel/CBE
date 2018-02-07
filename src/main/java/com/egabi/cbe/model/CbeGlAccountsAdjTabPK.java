package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBE_GL_ACCOUNTS_ADJ_TAB database table.
 * 
 */
@Embeddable
public class CbeGlAccountsAdjTabPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date busdate;

	@Column(name="GL_CODE")
	private long glCode;

	@Column(name="CUSTOMER_CODE")
	private long customerCode;

	@Column(name="SUB_ACCOUNT_NO")
	private long subAccountNo;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="BRANCH_CODE")
	private long branchCode;

	@Column(name="CENTER_CODE")
	private long centerCode;

	public CbeGlAccountsAdjTabPK() {
	}
	public java.util.Date getBusdate() {
		return this.busdate;
	}
	public void setBusdate(java.util.Date busdate) {
		this.busdate = busdate;
	}
	public long getGlCode() {
		return this.glCode;
	}
	public void setGlCode(long glCode) {
		this.glCode = glCode;
	}
	public long getCustomerCode() {
		return this.customerCode;
	}
	public void setCustomerCode(long customerCode) {
		this.customerCode = customerCode;
	}
	public long getSubAccountNo() {
		return this.subAccountNo;
	}
	public void setSubAccountNo(long subAccountNo) {
		this.subAccountNo = subAccountNo;
	}
	public String getCurrencyCode() {
		return this.currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public long getBranchCode() {
		return this.branchCode;
	}
	public void setBranchCode(long branchCode) {
		this.branchCode = branchCode;
	}
	public long getCenterCode() {
		return this.centerCode;
	}
	public void setCenterCode(long centerCode) {
		this.centerCode = centerCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbeGlAccountsAdjTabPK)) {
			return false;
		}
		CbeGlAccountsAdjTabPK castOther = (CbeGlAccountsAdjTabPK)other;
		return 
			this.busdate.equals(castOther.busdate)
			&& (this.glCode == castOther.glCode)
			&& (this.customerCode == castOther.customerCode)
			&& (this.subAccountNo == castOther.subAccountNo)
			&& this.currencyCode.equals(castOther.currencyCode)
			&& (this.branchCode == castOther.branchCode)
			&& (this.centerCode == castOther.centerCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.busdate.hashCode();
		hash = hash * prime + ((int) (this.glCode ^ (this.glCode >>> 32)));
		hash = hash * prime + ((int) (this.customerCode ^ (this.customerCode >>> 32)));
		hash = hash * prime + ((int) (this.subAccountNo ^ (this.subAccountNo >>> 32)));
		hash = hash * prime + this.currencyCode.hashCode();
		hash = hash * prime + ((int) (this.branchCode ^ (this.branchCode >>> 32)));
		hash = hash * prime + ((int) (this.centerCode ^ (this.centerCode >>> 32)));
		
		return hash;
	}
}