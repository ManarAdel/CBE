package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FROLE_FUNC database table.
 * 
 */
@Embeddable
public class FroleFuncPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ROLE_ID")
	private long roleId;

	private long progid;

	public FroleFuncPK() {
	}
	public long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}
	public long getProgid() {
		return this.progid;
	}
	public void setProgid(long progid) {
		this.progid = progid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FroleFuncPK)) {
			return false;
		}
		FroleFuncPK castOther = (FroleFuncPK)other;
		return 
			(this.roleId == castOther.roleId)
			&& (this.progid == castOther.progid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.roleId ^ (this.roleId >>> 32)));
		hash = hash * prime + ((int) (this.progid ^ (this.progid >>> 32)));
		
		return hash;
	}
}