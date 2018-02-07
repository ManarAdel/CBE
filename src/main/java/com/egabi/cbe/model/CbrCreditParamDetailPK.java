package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_CREDIT_PARAM_DETAIL database table.
 * 
 */
@Embeddable
public class CbrCreditParamDetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="POT_ACT_FLAG", insertable=false, updatable=false)
	private long potActFlag;

	@Column(name="CBR_TYPE", insertable=false, updatable=false)
	private String cbrType;

	@Column(name="MAIN_CODE")
	private long mainCode;

	@Column(name="SUB_CODE")
	private long subCode;

	public CbrCreditParamDetailPK() {
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
	public long getMainCode() {
		return this.mainCode;
	}
	public void setMainCode(long mainCode) {
		this.mainCode = mainCode;
	}
	public long getSubCode() {
		return this.subCode;
	}
	public void setSubCode(long subCode) {
		this.subCode = subCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrCreditParamDetailPK)) {
			return false;
		}
		CbrCreditParamDetailPK castOther = (CbrCreditParamDetailPK)other;
		return 
			(this.potActFlag == castOther.potActFlag)
			&& this.cbrType.equals(castOther.cbrType)
			&& (this.mainCode == castOther.mainCode)
			&& (this.subCode == castOther.subCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.potActFlag ^ (this.potActFlag >>> 32)));
		hash = hash * prime + this.cbrType.hashCode();
		hash = hash * prime + ((int) (this.mainCode ^ (this.mainCode >>> 32)));
		hash = hash * prime + ((int) (this.subCode ^ (this.subCode >>> 32)));
		
		return hash;
	}
}