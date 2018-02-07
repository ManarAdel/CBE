package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FKILL_SESSION_LINK database table.
 * 
 */
@Embeddable
public class FkillSessionLinkPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="BANK_ID")
	private long bankId;

	@Column(name="INST_ID")
	private long instId;

	public FkillSessionLinkPK() {
	}
	public long getBankId() {
		return this.bankId;
	}
	public void setBankId(long bankId) {
		this.bankId = bankId;
	}
	public long getInstId() {
		return this.instId;
	}
	public void setInstId(long instId) {
		this.instId = instId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FkillSessionLinkPK)) {
			return false;
		}
		FkillSessionLinkPK castOther = (FkillSessionLinkPK)other;
		return 
			(this.bankId == castOther.bankId)
			&& (this.instId == castOther.instId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.bankId ^ (this.bankId >>> 32)));
		hash = hash * prime + ((int) (this.instId ^ (this.instId >>> 32)));
		
		return hash;
	}
}