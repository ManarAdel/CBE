package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CBR_CREDIT_TXTFILE_DISPLAY database table.
 * 
 */
@Entity
@Table(name="CBR_CREDIT_TXTFILE_DISPLAY")
@NamedQuery(name="CbrCreditTxtfileDisplay.findAll", query="SELECT c FROM CbrCreditTxtfileDisplay c")
public class CbrCreditTxtfileDisplay implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrCreditTxtfileDisplayPK id;

	@Column(name="COLUMN_NAME")
	private String columnName;

	public CbrCreditTxtfileDisplay() {
	}

	public CbrCreditTxtfileDisplayPK getId() {
		return this.id;
	}

	public void setId(CbrCreditTxtfileDisplayPK id) {
		this.id = id;
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

}