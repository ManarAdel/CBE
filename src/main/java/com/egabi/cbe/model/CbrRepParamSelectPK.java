package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_REP_PARAM_SELECT database table.
 * 
 */
@Embeddable
public class CbrRepParamSelectPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="REPORT_ID", insertable=false, updatable=false)
	private long reportId;

	@Column(name="ROW_ID")
	private long rowId;

	@Column(name="COLUMN_ID")
	private String columnId;

	@Column(name="QUERY_ID")
	private long queryId;

	public CbrRepParamSelectPK() {
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
		if (!(other instanceof CbrRepParamSelectPK)) {
			return false;
		}
		CbrRepParamSelectPK castOther = (CbrRepParamSelectPK)other;
		return 
			(this.reportId == castOther.reportId)
			&& (this.rowId == castOther.rowId)
			&& this.columnId.equals(castOther.columnId)
			&& (this.queryId == castOther.queryId);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.reportId ^ (this.reportId >>> 32)));
		hash = hash * prime + ((int) (this.rowId ^ (this.rowId >>> 32)));
		hash = hash * prime + this.columnId.hashCode();
		hash = hash * prime + ((int) (this.queryId ^ (this.queryId >>> 32)));
		
		return hash;
	}
}