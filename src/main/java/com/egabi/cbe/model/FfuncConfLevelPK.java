package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FFUNC_CONF_LEVEL database table.
 * 
 */
@Embeddable
public class FfuncConfLevelPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PROG_ID")
	private long progId;

	@Column(name="PROG_LEVEL")
	private long progLevel;

	@Column(name="AUD_CODE")
	private long audCode;

	public FfuncConfLevelPK() {
	}
	public long getProgId() {
		return this.progId;
	}
	public void setProgId(long progId) {
		this.progId = progId;
	}
	public long getProgLevel() {
		return this.progLevel;
	}
	public void setProgLevel(long progLevel) {
		this.progLevel = progLevel;
	}
	public long getAudCode() {
		return this.audCode;
	}
	public void setAudCode(long audCode) {
		this.audCode = audCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FfuncConfLevelPK)) {
			return false;
		}
		FfuncConfLevelPK castOther = (FfuncConfLevelPK)other;
		return 
			(this.progId == castOther.progId)
			&& (this.progLevel == castOther.progLevel)
			&& (this.audCode == castOther.audCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.progId ^ (this.progId >>> 32)));
		hash = hash * prime + ((int) (this.progLevel ^ (this.progLevel >>> 32)));
		hash = hash * prime + ((int) (this.audCode ^ (this.audCode >>> 32)));
		
		return hash;
	}
}