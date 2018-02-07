package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_REPORTS_ADJUST database table.
 * 
 */
@Embeddable
public class CbrReportsAdjustPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="REPORT_ID")
	private long reportId;

	@Column(name="ROW_ID")
	private long rowId;

	@Column(name="COLUMN_ID")
	private String columnId;

	@Temporal(TemporalType.DATE)
	private java.util.Date busdate;

	public CbrReportsAdjustPK() {
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
	public String getColumnId() {
		return this.columnId;
	}
	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}
	public java.util.Date getBusdate() {
		return this.busdate;
	}
	public void setBusdate(java.util.Date busdate) {
		this.busdate = busdate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrReportsAdjustPK)) {
			return false;
		}
		CbrReportsAdjustPK castOther = (CbrReportsAdjustPK)other;
		return 
			(this.reportId == castOther.reportId)
			&& (this.rowId == castOther.rowId)
			&& this.columnId.equals(castOther.columnId)
			&& this.busdate.equals(castOther.busdate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.reportId ^ (this.reportId >>> 32)));
		hash = hash * prime + ((int) (this.rowId ^ (this.rowId >>> 32)));
		hash = hash * prime + this.columnId.hashCode();
		hash = hash * prime + this.busdate.hashCode();
		
		return hash;
	}
}