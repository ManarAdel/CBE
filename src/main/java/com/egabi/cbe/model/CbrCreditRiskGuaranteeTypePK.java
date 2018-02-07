package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_CREDIT_RISK_GUARANTEE_TYPE database table.
 * 
 */
@Embeddable
public class CbrCreditRiskGuaranteeTypePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="COL_NUMBER")
	private long colNumber;

	@Column(name="GUARANTEE_TYPE")
	private String guaranteeType;

	public CbrCreditRiskGuaranteeTypePK() {
	}
	public long getColNumber() {
		return this.colNumber;
	}
	public void setColNumber(long colNumber) {
		this.colNumber = colNumber;
	}
	public String getGuaranteeType() {
		return this.guaranteeType;
	}
	public void setGuaranteeType(String guaranteeType) {
		this.guaranteeType = guaranteeType;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrCreditRiskGuaranteeTypePK)) {
			return false;
		}
		CbrCreditRiskGuaranteeTypePK castOther = (CbrCreditRiskGuaranteeTypePK)other;
		return 
			(this.colNumber == castOther.colNumber)
			&& this.guaranteeType.equals(castOther.guaranteeType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.colNumber ^ (this.colNumber >>> 32)));
		hash = hash * prime + this.guaranteeType.hashCode();
		
		return hash;
	}
}