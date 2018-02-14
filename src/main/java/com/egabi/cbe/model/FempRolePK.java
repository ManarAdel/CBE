package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FEMP_ROLES database table.
 * 
 */
@Embeddable
public class FempRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="EMP_NO")
	private long empNo;

	@Column(name="ROLE_ID")
	private long roleId;

	public FempRolePK() {
	}
	public long getEmpNo() {
		return this.empNo;
	}
	public void setEmpNo(long empNo) {
		this.empNo = empNo;
	}
	public long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FempRolePK)) {
			return false;
		}
		FempRolePK castOther = (FempRolePK)other;
		return 
			(this.empNo == castOther.empNo)
			&& (this.roleId == castOther.roleId);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.empNo ^ (this.empNo >>> 32)));
		hash = hash * prime + ((int) (this.roleId ^ (this.roleId >>> 32)));
		
		return hash;
	}
}