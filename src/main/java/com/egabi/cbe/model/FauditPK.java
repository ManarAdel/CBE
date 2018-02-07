package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FAUDIT database table.
 * 
 */
@Embeddable
public class FauditPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long usrno;

	private long oprno;

	public FauditPK() {
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

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FauditPK)) {
			return false;
		}
		FauditPK castOther = (FauditPK)other;
		return 
			(this.usrno == castOther.usrno)
			&& (this.oprno == castOther.oprno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.usrno ^ (this.usrno >>> 32)));
		hash = hash * prime + ((int) (this.oprno ^ (this.oprno >>> 32)));
		
		return hash;
	}
}