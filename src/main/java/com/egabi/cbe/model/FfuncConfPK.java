package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FFUNC_CONF database table.
 * 
 */
@Embeddable
public class FfuncConfPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PROG_ID")
	private long progId;

	@Column(name="AUD_CODE")
	private long audCode;

	public FfuncConfPK() {
	}
	public long getProgId() {
		return this.progId;
	}
	public void setProgId(long progId) {
		this.progId = progId;
	}
	public long getAudCode() {
		return this.audCode;
	}
	public void setAudCode(long audCode) {
		this.audCode = audCode;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FfuncConfPK)) {
			return false;
		}
		FfuncConfPK castOther = (FfuncConfPK)other;
		return 
			(this.progId == castOther.progId)
			&& (this.audCode == castOther.audCode);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.progId ^ (this.progId >>> 32)));
		hash = hash * prime + ((int) (this.audCode ^ (this.audCode >>> 32)));
		
		return hash;
	}
}