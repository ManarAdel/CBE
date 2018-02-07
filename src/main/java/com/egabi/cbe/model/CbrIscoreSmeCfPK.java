package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_ISCORE_SME_CF database table.
 * 
 */
@Embeddable
public class CbrIscoreSmeCfPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date busdate;

	@Column(name="DATA_BRN_ID")
	private String dataBrnId;

	@Column(name="CRD_FAC")
	private String crdFac;

	public CbrIscoreSmeCfPK() {
	}
	public java.util.Date getBusdate() {
		return this.busdate;
	}
	public void setBusdate(java.util.Date busdate) {
		this.busdate = busdate;
	}
	public String getDataBrnId() {
		return this.dataBrnId;
	}
	public void setDataBrnId(String dataBrnId) {
		this.dataBrnId = dataBrnId;
	}
	public String getCrdFac() {
		return this.crdFac;
	}
	public void setCrdFac(String crdFac) {
		this.crdFac = crdFac;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrIscoreSmeCfPK)) {
			return false;
		}
		CbrIscoreSmeCfPK castOther = (CbrIscoreSmeCfPK)other;
		return 
			this.busdate.equals(castOther.busdate)
			&& this.dataBrnId.equals(castOther.dataBrnId)
			&& this.crdFac.equals(castOther.crdFac);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.busdate.hashCode();
		hash = hash * prime + this.dataBrnId.hashCode();
		hash = hash * prime + this.crdFac.hashCode();
		
		return hash;
	}
}