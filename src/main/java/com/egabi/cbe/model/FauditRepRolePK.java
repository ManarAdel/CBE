package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FAUDIT_REP_ROLE database table.
 * 
 */
@Embeddable
public class FauditRepRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long ser;

	@Column(name="ROLE_ID")
	private long roleId;

	public FauditRepRolePK() {
	}
	public long getSer() {
		return this.ser;
	}
	public void setSer(long ser) {
		this.ser = ser;
	}
	public long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FauditRepRolePK)) {
			return false;
		}
		FauditRepRolePK castOther = (FauditRepRolePK)other;
		return 
			(this.ser == castOther.ser)
			&& (this.roleId == castOther.roleId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.ser ^ (this.ser >>> 32)));
		hash = hash * prime + ((int) (this.roleId ^ (this.roleId >>> 32)));
		
		return hash;
	}
}