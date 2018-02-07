package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_REP_BASELINE database table.
 * 
 */
@Embeddable
public class CbrRepBaselinePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="AS_OF_DATE")
	private java.util.Date asOfDate;

	@Column(name="REPORT_ID")
	private long reportId;

	@Column(name="ROW_NUMBER")
	private long rowNumber;

	@Column(name="COL_ID")
	private String colId;

	@Column(name="VERSION_NO")
	private long versionNo;

	public CbrRepBaselinePK() {
	}
	public java.util.Date getAsOfDate() {
		return this.asOfDate;
	}
	public void setAsOfDate(java.util.Date asOfDate) {
		this.asOfDate = asOfDate;
	}
	public long getReportId() {
		return this.reportId;
	}
	public void setReportId(long reportId) {
		this.reportId = reportId;
	}
	public long getRowNumber() {
		return this.rowNumber;
	}
	public void setRowNumber(long rowNumber) {
		this.rowNumber = rowNumber;
	}
	public String getColId() {
		return this.colId;
	}
	public void setColId(String colId) {
		this.colId = colId;
	}
	public long getVersionNo() {
		return this.versionNo;
	}
	public void setVersionNo(long versionNo) {
		this.versionNo = versionNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrRepBaselinePK)) {
			return false;
		}
		CbrRepBaselinePK castOther = (CbrRepBaselinePK)other;
		return 
			this.asOfDate.equals(castOther.asOfDate)
			&& (this.reportId == castOther.reportId)
			&& (this.rowNumber == castOther.rowNumber)
			&& this.colId.equals(castOther.colId)
			&& (this.versionNo == castOther.versionNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.asOfDate.hashCode();
		hash = hash * prime + ((int) (this.reportId ^ (this.reportId >>> 32)));
		hash = hash * prime + ((int) (this.rowNumber ^ (this.rowNumber >>> 32)));
		hash = hash * prime + this.colId.hashCode();
		hash = hash * prime + ((int) (this.versionNo ^ (this.versionNo >>> 32)));
		
		return hash;
	}
}