package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_PRODUCT_GROUP database table.
 * 
 */
@Embeddable
public class CbrProductGroupPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PROD_CODE")
	private long prodCode;

	@Column(name="BAL_SIGN")
	private String balSign;

	@Column(name="SUB_ACCT")
	private String subAcct;

	public CbrProductGroupPK() {
	}
	public long getProdCode() {
		return this.prodCode;
	}
	public void setProdCode(long prodCode) {
		this.prodCode = prodCode;
	}
	public String getBalSign() {
		return this.balSign;
	}
	public void setBalSign(String balSign) {
		this.balSign = balSign;
	}
	public String getSubAcct() {
		return this.subAcct;
	}
	public void setSubAcct(String subAcct) {
		this.subAcct = subAcct;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrProductGroupPK)) {
			return false;
		}
		CbrProductGroupPK castOther = (CbrProductGroupPK)other;
		return 
			(this.prodCode == castOther.prodCode)
			&& this.balSign.equals(castOther.balSign)
			&& this.subAcct.equals(castOther.subAcct);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.prodCode ^ (this.prodCode >>> 32)));
		hash = hash * prime + this.balSign.hashCode();
		hash = hash * prime + this.subAcct.hashCode();
		
		return hash;
	}
}