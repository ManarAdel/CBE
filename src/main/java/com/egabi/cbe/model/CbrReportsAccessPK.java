package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_REPORTS_ACCESS database table.
 * 
 */
@Embeddable
public class CbrReportsAccessPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="REPORT_ID", insertable=false, updatable=false)
	private long reportId;

	@Column(name="ROLE_ID", insertable=false, updatable=false)
	private long roleId;

	public CbrReportsAccessPK() {
	}
	public long getReportId() {
		return this.reportId;
	}
	public void setReportId(long reportId) {
		this.reportId = reportId;
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
		if (!(other instanceof CbrReportsAccessPK)) {
			return false;
		}
		CbrReportsAccessPK castOther = (CbrReportsAccessPK)other;
		return 
			(this.reportId == castOther.reportId)
			&& (this.roleId == castOther.roleId);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.reportId ^ (this.reportId >>> 32)));
		hash = hash * prime + ((int) (this.roleId ^ (this.roleId >>> 32)));
		
		return hash;
	}
}