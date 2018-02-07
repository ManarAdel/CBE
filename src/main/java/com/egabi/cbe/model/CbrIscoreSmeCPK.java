package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_ISCORE_SME_CS database table.
 * 
 */
@Embeddable
public class CbrIscoreSmeCPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date busdate;

	@Column(name="PROVIDER_BRANCH_ID")
	private String providerBranchId;

	@Column(name="CREDIT_FACILITY_ACC_NO")
	private String creditFacilityAccNo;

	@Column(name="SUBJECT_CODE")
	private String subjectCode;

	public CbrIscoreSmeCPK() {
	}
	public java.util.Date getBusdate() {
		return this.busdate;
	}
	public void setBusdate(java.util.Date busdate) {
		this.busdate = busdate;
	}
	public String getProviderBranchId() {
		return this.providerBranchId;
	}
	public void setProviderBranchId(String providerBranchId) {
		this.providerBranchId = providerBranchId;
	}
	public String getCreditFacilityAccNo() {
		return this.creditFacilityAccNo;
	}
	public void setCreditFacilityAccNo(String creditFacilityAccNo) {
		this.creditFacilityAccNo = creditFacilityAccNo;
	}
	public String getSubjectCode() {
		return this.subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrIscoreSmeCPK)) {
			return false;
		}
		CbrIscoreSmeCPK castOther = (CbrIscoreSmeCPK)other;
		return 
			this.busdate.equals(castOther.busdate)
			&& this.providerBranchId.equals(castOther.providerBranchId)
			&& this.creditFacilityAccNo.equals(castOther.creditFacilityAccNo)
			&& this.subjectCode.equals(castOther.subjectCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.busdate.hashCode();
		hash = hash * prime + this.providerBranchId.hashCode();
		hash = hash * prime + this.creditFacilityAccNo.hashCode();
		hash = hash * prime + this.subjectCode.hashCode();
		
		return hash;
	}
}