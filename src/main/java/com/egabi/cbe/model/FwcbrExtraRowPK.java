package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FWCBR_EXTRA_ROWS database table.
 * 
 */
@Embeddable
public class FwcbrExtraRowPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date busdate;

	@Column(name="REPORT_ID")
	private long reportId;

	@Column(name="ROW_ID")
	private long rowId;

	public FwcbrExtraRowPK() {
	}
	public java.util.Date getBusdate() {
		return this.busdate;
	}
	public void setBusdate(java.util.Date busdate) {
		this.busdate = busdate;
	}
	public long getReportId() {
		return this.reportId;
	}
	public void setReportId(long reportId) {
		this.reportId = reportId;
	}
	public long getRowId() {
		return this.rowId;
	}
	public void setRowId(long rowId) {
		this.rowId = rowId;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FwcbrExtraRowPK)) {
			return false;
		}
		FwcbrExtraRowPK castOther = (FwcbrExtraRowPK)other;
		return 
			this.busdate.equals(castOther.busdate)
			&& (this.reportId == castOther.reportId)
			&& (this.rowId == castOther.rowId);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.busdate.hashCode();
		hash = hash * prime + ((int) (this.reportId ^ (this.reportId >>> 32)));
		hash = hash * prime + ((int) (this.rowId ^ (this.rowId >>> 32)));
		
		return hash;
	}
}