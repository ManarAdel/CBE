package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_ISCORE_CONS_CS database table.
 * 
 */
@Embeddable
public class CbrIscoreConsCPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date busdate;

	@Column(name="DATA_PROVIDER_BRANCH_ID")
	private String dataProviderBranchId;

	@Column(name="CREDIT_FACILITY_ACCOUNT_NUMBER")
	private String creditFacilityAccountNumber;

	@Column(name="DATA_PROVIDER_IDEN_CODE")
	private String dataProviderIdenCode;

	public CbrIscoreConsCPK() {
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
	public String getCreditFacilityAccountNumber() {
		return this.creditFacilityAccountNumber;
	}
	public void setCreditFacilityAccountNumber(String creditFacilityAccountNumber) {
		this.creditFacilityAccountNumber = creditFacilityAccountNumber;
	}
	public String getDataProviderIdenCode() {
		return this.dataProviderIdenCode;
	}
	public void setDataProviderIdenCode(String dataProviderIdenCode) {
		this.dataProviderIdenCode = dataProviderIdenCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrIscoreConsCPK)) {
			return false;
		}
		CbrIscoreConsCPK castOther = (CbrIscoreConsCPK)other;
		return 
			this.busdate.equals(castOther.busdate)
			&& this.dataProviderBranchId.equals(castOther.dataProviderBranchId)
			&& this.creditFacilityAccountNumber.equals(castOther.creditFacilityAccountNumber)
			&& this.dataProviderIdenCode.equals(castOther.dataProviderIdenCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.busdate.hashCode();
		hash = hash * prime + this.dataProviderBranchId.hashCode();
		hash = hash * prime + this.creditFacilityAccountNumber.hashCode();
		hash = hash * prime + this.dataProviderIdenCode.hashCode();
		
		return hash;
	}
}