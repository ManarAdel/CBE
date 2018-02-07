package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FPARAM database table.
 * 
 */
@Embeddable
public class FparamPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long usrno;

	private String progname;

	private long serial;

	public FparamPK() {
	}
	public long getUsrno() {
		return this.usrno;
	}
	public void setUsrno(long usrno) {
		this.usrno = usrno;
	}
	public String getProgname() {
		return this.progname;
	}
	public void setProgname(String progname) {
		this.progname = progname;
	}
	public long getSerial() {
		return this.serial;
	}
	public void setSerial(long serial) {
		this.serial = serial;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FparamPK)) {
			return false;
		}
		FparamPK castOther = (FparamPK)other;
		return 
			(this.usrno == castOther.usrno)
			&& this.progname.equals(castOther.progname)
			&& (this.serial == castOther.serial);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.usrno ^ (this.usrno >>> 32)));
		hash = hash * prime + this.progname.hashCode();
		hash = hash * prime + ((int) (this.serial ^ (this.serial >>> 32)));
		
		return hash;
	}
}