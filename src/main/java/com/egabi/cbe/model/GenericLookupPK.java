package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the GENERIC_LOOKUP database table.
 * 
 */
@Embeddable
public class GenericLookupPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="LOOKUP_TYPE", insertable=false, updatable=false)
	private long lookupType;

	@Column(name="LOOKUP_VALUE")
	private String lookupValue;

	public GenericLookupPK() {
	}
	public long getLookupType() {
		return this.lookupType;
	}
	public void setLookupType(long lookupType) {
		this.lookupType = lookupType;
	}
	public String getLookupValue() {
		return this.lookupValue;
	}
	public void setLookupValue(String lookupValue) {
		this.lookupValue = lookupValue;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof GenericLookupPK)) {
			return false;
		}
		GenericLookupPK castOther = (GenericLookupPK)other;
		return 
			(this.lookupType == castOther.lookupType)
			&& this.lookupValue.equals(castOther.lookupValue);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.lookupType ^ (this.lookupType >>> 32)));
		hash = hash * prime + this.lookupValue.hashCode();
		
		return hash;
	}
}