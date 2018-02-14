package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FAUDIT_REP_ORDER database table.
 * 
 */
@Embeddable
public class FauditRepOrderPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long ser;

	@Column(name="ITEM_NAME")
	private String itemName;

	public FauditRepOrderPK() {
	}
	public long getSer() {
		return this.ser;
	}
	public void setSer(long ser) {
		this.ser = ser;
	}
	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FauditRepOrderPK)) {
			return false;
		}
		FauditRepOrderPK castOther = (FauditRepOrderPK)other;
		return 
			(this.ser == castOther.ser)
			&& this.itemName.equals(castOther.itemName);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.ser ^ (this.ser >>> 32)));
		hash = hash * prime + this.itemName.hashCode();
		
		return hash;
	}
}