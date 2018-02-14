package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_ISCORE_CONS_CF database table.
 * 
 */
@Embeddable
public class CbrIscoreConsCfPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date busdate;

	@Column(name="DATA_PROVIDER_BRANCH_ID")
	private String dataProviderBranchId;

	@Column(name="CREDIT_FACILITY_ACC_NUMBER")
	private String creditFacilityAccNumber;

	public CbrIscoreConsCfPK() {
	}
	public java.util.Date getBusdate() {
		return this.busdate;
	}
	public void setBusdate(java.util.Date busdate) {
		this.busdate = busdate;
	}
	public String getDataProviderBranchId() {
		return this.dataProviderBranchId;
	}
	public void setDataProviderBranchId(String dataProviderBranchId) {
		this.dataProviderBranchId = dataProviderBranchId;
	}
	public String getCreditFacilityAccNumber() {
		return this.creditFacilityAccNumber;
	}
	public void setCreditFacilityAccNumber(String creditFacilityAccNumber) {
		this.creditFacilityAccNumber = creditFacilityAccNumber;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrIscoreConsCfPK)) {
			return false;
		}
		CbrIscoreConsCfPK castOther = (CbrIscoreConsCfPK)other;
		return 
			this.busdate.equals(castOther.busdate)
			&& this.dataProviderBranchId.equals(castOther.dataProviderBranchId)
			&& this.creditFacilityAccNumber.equals(castOther.creditFacilityAccNumber);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.busdate.hashCode();
		hash = hash * prime + this.dataProviderBranchId.hashCode();
		hash = hash * prime + this.creditFacilityAccNumber.hashCode();
		
		return hash;
	}
}