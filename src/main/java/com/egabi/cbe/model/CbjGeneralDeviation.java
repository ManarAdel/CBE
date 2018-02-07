package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CBJ_GENERAL_DEVIATION database table.
 * 
 */
@Entity
@Table(name="CBJ_GENERAL_DEVIATION")
@NamedQuery(name="CbjGeneralDeviation.findAll", query="SELECT c FROM CbjGeneralDeviation c")
public class CbjGeneralDeviation implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbjGeneralDeviationPK id;

	@Column(name="DEV_TEXT")
	private String devText;

	@Column(name="EXCEL_COLUMNS")
	private String excelColumns;

	@Column(name="EXCEL_VALUES")
	private String excelValues;

	public CbjGeneralDeviation() {
	}

	public CbjGeneralDeviationPK getId() {
		return this.id;
	}

	public void setId(CbjGeneralDeviationPK id) {
		this.id = id;
	}

	public String getDevText() {
		return this.devText;
	}

	public void setDevText(String devText) {
		this.devText = devText;
	}

	public String getExcelColumns() {
		return this.excelColumns;
	}

	public void setExcelColumns(String excelColumns) {
		this.excelColumns = excelColumns;
	}

	public String getExcelValues() {
		return this.excelValues;
	}

	public void setExcelValues(String excelValues) {
		this.excelValues = excelValues;
	}

}