package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_REPORT_RESOURCES database table.
 * 
 */
@Embeddable
public class CbrReportResourcePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="REPORT_ID", insertable=false, updatable=false)
	private long reportId;

	@Column(name="SOURCE_NAME")
	private String sourceName;

	public CbrReportResourcePK() {
	}
	public long getReportId() {
		return this.reportId;
	}
	public void setReportId(long reportId) {
		this.reportId = reportId;
	}
	public String getSourceName() {
		return this.sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrReportResourcePK)) {
			return false;
		}
		CbrReportResourcePK castOther = (CbrReportResourcePK)other;
		return 
			(this.reportId == castOther.reportId)
			&& this.sourceName.equals(castOther.sourceName);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.reportId ^ (this.reportId >>> 32)));
		hash = hash * prime + this.sourceName.hashCode();
		
		return hash;
	}
}