package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_PROC_BREAKDOWN database table.
 * 
 */
@Embeddable
public class CbrProcBreakdownPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date busdate;

	@Column(name="REPORT_ID")
	private long reportId;

	@Column(name="COLUMN_ID")
	private String columnId;

	@Column(name="ROW_ID")
	private long rowId;

	@Column(name="QUERY_ID")
	private long queryId;

	public CbrProcBreakdownPK() {
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
	public String getColumnId() {
		return this.columnId;
	}
	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}
	public long getRowId() {
		return this.rowId;
	}
	public void setRowId(long rowId) {
		this.rowId = rowId;
	}
	public long getQueryId() {
		return this.queryId;
	}
	public void setQueryId(long queryId) {
		this.queryId = queryId;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrProcBreakdownPK)) {
			return false;
		}
		CbrProcBreakdownPK castOther = (CbrProcBreakdownPK)other;
		return 
			this.busdate.equals(castOther.busdate)
			&& (this.reportId == castOther.reportId)
			&& this.columnId.equals(castOther.columnId)
			&& (this.rowId == castOther.rowId)
			&& (this.queryId == castOther.queryId);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.busdate.hashCode();
		hash = hash * prime + ((int) (this.reportId ^ (this.reportId >>> 32)));
		hash = hash * prime + this.columnId.hashCode();
		hash = hash * prime + ((int) (this.rowId ^ (this.rowId >>> 32)));
		hash = hash * prime + ((int) (this.queryId ^ (this.queryId >>> 32)));
		
		return hash;
	}
}