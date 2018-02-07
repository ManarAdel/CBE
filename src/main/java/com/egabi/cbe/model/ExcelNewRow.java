package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the EXCEL_NEW_ROW database table.
 * 
 */
@Entity
@Table(name="EXCEL_NEW_ROW")
@NamedQuery(name="ExcelNewRow.findAll", query="SELECT e FROM ExcelNewRow e")
public class ExcelNewRow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="NEW_ROW_UV")
	private String newRowUv;

	@Column(name="OLD_ROW_UV")
	private String oldRowUv;

	@Column(name="ROW_ID")
	private BigDecimal rowId;

	public ExcelNewRow() {
	}

	public String getNewRowUv() {
		return this.newRowUv;
	}

	public void setNewRowUv(String newRowUv) {
		this.newRowUv = newRowUv;
	}

	public String getOldRowUv() {
		return this.oldRowUv;
	}

	public void setOldRowUv(String oldRowUv) {
		this.oldRowUv = oldRowUv;
	}

	public BigDecimal getRowId() {
		return this.rowId;
	}

	public void setRowId(BigDecimal rowId) {
		this.rowId = rowId;
	}

}