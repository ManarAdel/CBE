package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FAUDIT_REP_PARAM database table.
 * 
 */
@Embeddable
public class FauditRepParamPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long ser;

	@Column(name="HIS_FLAG")
	private long hisFlag;

	public FauditRepParamPK() {
	}
	public long getSer() {
		return this.ser;
	}
	public void setSer(long ser) {
		this.ser = ser;
	}
	public long getHisFlag() {
		return this.hisFlag;
	}
	public void setHisFlag(long hisFlag) {
		this.hisFlag = hisFlag;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FauditRepParamPK)) {
			return false;
		}
		FauditRepParamPK castOther = (FauditRepParamPK)other;
		return 
			(this.ser == castOther.ser)
			&& (this.hisFlag == castOther.hisFlag);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.ser ^ (this.ser >>> 32)));
		hash = hash * prime + ((int) (this.hisFlag ^ (this.hisFlag >>> 32)));
		
		return hash;
	}
}