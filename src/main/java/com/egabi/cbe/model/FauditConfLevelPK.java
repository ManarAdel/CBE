package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FAUDIT_CONF_LEVELS database table.
 * 
 */
@Embeddable
public class FauditConfLevelPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long usrno;

	private long oprno;

	@Column(name="CONF_LEVEL")
	private long confLevel;

	@Column(name="CONF_USRNO")
	private long confUsrno;

	public FauditConfLevelPK() {
	}
	public long getUsrno() {
		return this.usrno;
	}
	public void setUsrno(long usrno) {
		this.usrno = usrno;
	}
	public long getOprno() {
		return this.oprno;
	}
	public void setOprno(long oprno) {
		this.oprno = oprno;
	}
	public long getConfLevel() {
		return this.confLevel;
	}
	public void setConfLevel(long confLevel) {
		this.confLevel = confLevel;
	}
	public long getConfUsrno() {
		return this.confUsrno;
	}
	public void setConfUsrno(long confUsrno) {
		this.confUsrno = confUsrno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FauditConfLevelPK)) {
			return false;
		}
		FauditConfLevelPK castOther = (FauditConfLevelPK)other;
		return 
			(this.usrno == castOther.usrno)
			&& (this.oprno == castOther.oprno)
			&& (this.confLevel == castOther.confLevel)
			&& (this.confUsrno == castOther.confUsrno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.usrno ^ (this.usrno >>> 32)));
		hash = hash * prime + ((int) (this.oprno ^ (this.oprno >>> 32)));
		hash = hash * prime + ((int) (this.confLevel ^ (this.confLevel >>> 32)));
		hash = hash * prime + ((int) (this.confUsrno ^ (this.confUsrno >>> 32)));
		
		return hash;
	}
}