package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FUSR_CONF_LEVELS database table.
 * 
 */
@Embeddable
public class FusrConfLevelPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long usrno;

	@Column(name="USR_LEVEL")
	private long usrLevel;

	@Column(name="CONF_USRNO")
	private long confUsrno;

	public FusrConfLevelPK() {
	}
	public long getUsrno() {
		return this.usrno;
	}
	public void setUsrno(long usrno) {
		this.usrno = usrno;
	}
	public long getUsrLevel() {
		return this.usrLevel;
	}
	public void setUsrLevel(long usrLevel) {
		this.usrLevel = usrLevel;
	}
	public long getConfUsrno() {
		return this.confUsrno;
	}
	public void setConfUsrno(long confUsrno) {
		this.confUsrno = confUsrno;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FusrConfLevelPK)) {
			return false;
		}
		FusrConfLevelPK castOther = (FusrConfLevelPK)other;
		return 
			(this.usrno == castOther.usrno)
			&& (this.usrLevel == castOther.usrLevel)
			&& (this.confUsrno == castOther.confUsrno);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.usrno ^ (this.usrno >>> 32)));
		hash = hash * prime + ((int) (this.usrLevel ^ (this.usrLevel >>> 32)));
		hash = hash * prime + ((int) (this.confUsrno ^ (this.confUsrno >>> 32)));
		
		return hash;
	}
}