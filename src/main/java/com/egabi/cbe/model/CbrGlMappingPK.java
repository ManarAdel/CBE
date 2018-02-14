package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_GL_MAPPING database table.
 * 
 */
@Embeddable
public class CbrGlMappingPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="GROUP_CODE", insertable=false, updatable=false)
	private long groupCode;

	@Column(name="GL_CODE")
	private long glCode;

	@Column(name="CUST_NO")
	private String custNo;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="SUB_ACCT")
	private String subAcct;

	@Column(name="CCY_CODE")
	private String ccyCode;

	@Column(name="CENTER_CODE")
	private String centerCode;

	public CbrGlMappingPK() {
	}
	public long getGroupCode() {
		return this.groupCode;
	}
	public void setGroupCode(long groupCode) {
		this.groupCode = groupCode;
	}
	public long getGlCode() {
		return this.glCode;
	}
	public void setGlCode(long glCode) {
		this.glCode = glCode;
	}
	public String getCustNo() {
		return this.custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
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
		if (!(other instanceof CbrGlMappingPK)) {
			return false;
		}
		CbrGlMappingPK castOther = (CbrGlMappingPK)other;
		return 
			(this.groupCode == castOther.groupCode)
			&& (this.glCode == castOther.glCode)
			&& this.custNo.equals(castOther.custNo)
			&& this.branchCode.equals(castOther.branchCode)
			&& this.subAcct.equals(castOther.subAcct)
			&& this.ccyCode.equals(castOther.ccyCode)
			&& this.centerCode.equals(castOther.centerCode);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.groupCode ^ (this.groupCode >>> 32)));
		hash = hash * prime + ((int) (this.glCode ^ (this.glCode >>> 32)));
		hash = hash * prime + this.custNo.hashCode();
		hash = hash * prime + this.branchCode.hashCode();
		hash = hash * prime + this.subAcct.hashCode();
		hash = hash * prime + this.ccyCode.hashCode();
		hash = hash * prime + this.centerCode.hashCode();
		
		return hash;
	}
}