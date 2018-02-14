package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_CREDIT_TXTFILE_DISPLAY database table.
 * 
 */
@Embeddable
public class CbrCreditTxtfileDisplayPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CBR_TYPE")
	private String cbrType;

	@Column(name="COLUMN_ORDER")
	private long columnOrder;

	@Column(name="REP_FORMAT")
	private String repFormat;

	public CbrCreditTxtfileDisplayPK() {
	}
	public String getCbrType() {
		return this.cbrType;
	}
	public void setCbrType(String cbrType) {
		this.cbrType = cbrType;
	}
	public long getColumnOrder() {
		return this.columnOrder;
	}
	public void setColumnOrder(long columnOrder) {
		this.columnOrder = columnOrder;
	}
	public String getRepFormat() {
		return this.repFormat;
	}
	public void setRepFormat(String repFormat) {
		this.repFormat = repFormat;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrCreditTxtfileDisplayPK)) {
			return false;
		}
		CbrCreditTxtfileDisplayPK castOther = (CbrCreditTxtfileDisplayPK)other;
		return 
			this.cbrType.equals(castOther.cbrType)
			&& (this.columnOrder == castOther.columnOrder)
			&& this.repFormat.equals(castOther.repFormat);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.cbrType.hashCode();
		hash = hash * prime + ((int) (this.columnOrder ^ (this.columnOrder >>> 32)));
		hash = hash * prime + this.repFormat.hashCode();
		
		return hash;
	}
}