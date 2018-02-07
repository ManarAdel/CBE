package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FAUDIT_DETAILS database table.
 * 
 */
@Embeddable
public class FauditDetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long usrno;

	private long oprno;

	@Column(name="ITEM_NAME")
	private String itemName;

	@Column(name="REC_NO")
	private long recNo;

	public FauditDetailPK() {
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
	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public long getRecNo() {
		return this.recNo;
	}
	public void setRecNo(long recNo) {
		this.recNo = recNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FauditDetailPK)) {
			return false;
		}
		FauditDetailPK castOther = (FauditDetailPK)other;
		return 
			(this.usrno == castOther.usrno)
			&& (this.oprno == castOther.oprno)
			&& this.itemName.equals(castOther.itemName)
			&& (this.recNo == castOther.recNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.usrno ^ (this.usrno >>> 32)));
		hash = hash * prime + ((int) (this.oprno ^ (this.oprno >>> 32)));
		hash = hash * prime + this.itemName.hashCode();
		hash = hash * prime + ((int) (this.recNo ^ (this.recNo >>> 32)));
		
		return hash;
	}
}