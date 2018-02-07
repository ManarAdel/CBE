package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FPASS_WRONGS database table.
 * 
 */
@Embeddable
public class FpassWrongPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long brcode;

	private long usrno;

	public FpassWrongPK() {
	}
	public long getBrcode() {
		return this.brcode;
	}
	public void setBrcode(long brcode) {
		this.brcode = brcode;
	}
	public long getUsrno() {
		return this.usrno;
	}
	public void setUsrno(long usrno) {
		this.usrno = usrno;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FpassWrongPK)) {
			return false;
		}
		FpassWrongPK castOther = (FpassWrongPK)other;
		return 
			(this.brcode == castOther.brcode)
			&& (this.usrno == castOther.usrno);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.brcode ^ (this.brcode >>> 32)));
		hash = hash * prime + ((int) (this.usrno ^ (this.usrno >>> 32)));
		
		return hash;
	}
}