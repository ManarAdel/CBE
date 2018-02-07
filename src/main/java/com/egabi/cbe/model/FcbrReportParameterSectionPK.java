package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FCBR_REPORT_PARAMETER_SECTION database table.
 * 
 */
@Embeddable
public class FcbrReportParameterSectionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="REPORT_ID")
	private long reportId;

	@Column(name="SECTION_SERIAL")
	private long sectionSerial;

	public FcbrReportParameterSectionPK() {
	}
	public long getReportId() {
		return this.reportId;
	}
	public void setReportId(long reportId) {
		this.reportId = reportId;
	}
	public long getSectionSerial() {
		return this.sectionSerial;
	}
	public void setSectionSerial(long sectionSerial) {
		this.sectionSerial = sectionSerial;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FcbrReportParameterSectionPK)) {
			return false;
		}
		FcbrReportParameterSectionPK castOther = (FcbrReportParameterSectionPK)other;
		return 
			(this.reportId == castOther.reportId)
			&& (this.sectionSerial == castOther.sectionSerial);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.reportId ^ (this.reportId >>> 32)));
		hash = hash * prime + ((int) (this.sectionSerial ^ (this.sectionSerial >>> 32)));
		
		return hash;
	}
}