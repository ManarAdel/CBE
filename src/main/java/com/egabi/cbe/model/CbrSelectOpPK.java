package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_SELECT_OP database table.
 * 
 */
@Embeddable
public class CbrSelectOpPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long usrno;

	@Column(name="ROW_NUMBER")
	private long rowNumber;

	public CbrSelectOpPK() {
	}
	public long getUsrno() {
		return this.usrno;
	}
	public void setUsrno(long usrno) {
		this.usrno = usrno;
	}
	public long getRowNumber() {
		return this.rowNumber;
	}
	public void setRowNumber(long rowNumber) {
		this.rowNumber = rowNumber;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrSelectOpPK)) {
			return false;
		}
		CbrSelectOpPK castOther = (CbrSelectOpPK)other;
		return 
			(this.usrno == castOther.usrno)
			&& (this.rowNumber == castOther.rowNumber);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.usrno ^ (this.usrno >>> 32)));
		hash = hash * prime + ((int) (this.rowNumber ^ (this.rowNumber >>> 32)));
		
		return hash;
	}
}