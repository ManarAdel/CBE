package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FCBR_REPORT_DATA database table.
 * 
 */
@Entity
@Table(name="FCBR_REPORT_DATA")
@NamedQuery(name="FcbrReportData.findAll", query="SELECT f FROM FcbrReportData f")
public class FcbrReportData implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FcbrReportDataPK id;

	@Column(name="CELL_FORMULA")
	private String cellFormula;

	@Column(name="CELL_VALUE")
	private String cellValue;

	@Column(name="COLUMN_NUMBER")
	private BigDecimal columnNumber;

	@Column(name="EXCEPTION_FLAG")
	private BigDecimal exceptionFlag;

	public FcbrReportData() {
	}

	public FcbrReportDataPK getId() {
		return this.id;
	}

	public void setId(FcbrReportDataPK id) {
		this.id = id;
	}

	public String getCellFormula() {
		return this.cellFormula;
	}

	public void setCellFormula(String cellFormula) {
		this.cellFormula = cellFormula;
	}

	public String getCellValue() {
		return this.cellValue;
	}

	public void setCellValue(String cellValue) {
		this.cellValue = cellValue;
	}

	public BigDecimal getColumnNumber() {
		return this.columnNumber;
	}

	public void setColumnNumber(BigDecimal columnNumber) {
		this.columnNumber = columnNumber;
	}

	public BigDecimal getExceptionFlag() {
		return this.exceptionFlag;
	}

	public void setExceptionFlag(BigDecimal exceptionFlag) {
		this.exceptionFlag = exceptionFlag;
	}

}