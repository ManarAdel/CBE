package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FERR_LOG database table.
 * 
 */
@Embeddable
public class FerrLogPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long usrno;

	private long progid;

	@Temporal(TemporalType.DATE)
	@Column(name="ERR_TIME")
	private java.util.Date errTime;

	public FerrLogPK() {
	}
	public long getUsrno() {
		return this.usrno;
	}
	public void setUsrno(long usrno) {
		this.usrno = usrno;
	}
	public long getProgid() {
		return this.progid;
	}
	public void setProgid(long progid) {
		this.progid = progid;
	}
	public java.util.Date getErrTime() {
		return this.errTime;
	}
	public void setErrTime(java.util.Date errTime) {
		this.errTime = errTime;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FerrLogPK)) {
			return false;
		}
		FerrLogPK castOther = (FerrLogPK)other;
		return 
			(this.usrno == castOther.usrno)
			&& (this.progid == castOther.progid)
			&& this.errTime.equals(castOther.errTime);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.usrno ^ (this.usrno >>> 32)));
		hash = hash * prime + ((int) (this.progid ^ (this.progid >>> 32)));
		hash = hash * prime + this.errTime.hashCode();
		
		return hash;
	}
}