package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_CREDIT_PARAM database table.
 * 
 */
@Embeddable
public class CbrCreditParamPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="POT_ACT_FLAG")
	private long potActFlag;

	@Column(name="CBR_TYPE")
	private String cbrType;

	public CbrCreditParamPK() {
	}
	public long getPotActFlag() {
		return this.potActFlag;
	}
	public void setPotActFlag(long potActFlag) {
		this.potActFlag = potActFlag;
	}
	public String getCbrType() {
		return this.cbrType;
	}
	public void setCbrType(String cbrType) {
		this.cbrType = cbrType;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrCreditParamPK)) {
			return false;
		}
		CbrCreditParamPK castOther = (CbrCreditParamPK)other;
		return 
			(this.potActFlag == castOther.potActFlag)
			&& this.cbrType.equals(castOther.cbrType);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.potActFlag ^ (this.potActFlag >>> 32)));
		hash = hash * prime + this.cbrType.hashCode();
		
		return hash;
	}
}