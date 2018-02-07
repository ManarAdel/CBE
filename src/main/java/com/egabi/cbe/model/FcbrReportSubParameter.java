package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FCBR_REPORT_SUB_PARAMETER database table.
 * 
 */
@Entity
@Table(name="FCBR_REPORT_SUB_PARAMETER")
@NamedQuery(name="FcbrReportSubParameter.findAll", query="SELECT f FROM FcbrReportSubParameter f")
public class FcbrReportSubParameter implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FcbrReportSubParameterPK id;

	@Column(name="CELL_KIND")
	private BigDecimal cellKind;

	@Column(name="COPY_COLUMN_ID")
	private String copyColumnId;

	@Column(name="COPY_NEW_FLAG")
	private BigDecimal copyNewFlag;

	@Column(name="COPY_ROW_ID")
	private BigDecimal copyRowId;

	@Column(name="FIXED_VALUE")
	private String fixedValue;

	@Column(name="FUNCTION_NAME")
	private String functionName;

	@Column(name="WHERE_CONDITION")
	private String whereCondition;

	public FcbrReportSubParameter() {
	}

	public FcbrReportSubParameterPK getId() {
		return this.id;
	}

	public void setId(FcbrReportSubParameterPK id) {
		this.id = id;
	}

	public BigDecimal getCellKind() {
		return this.cellKind;
	}

	public void setCellKind(BigDecimal cellKind) {
		this.cellKind = cellKind;
	}

	public String getCopyColumnId() {
		return this.copyColumnId;
	}

	public void setCopyColumnId(String copyColumnId) {
		this.copyColumnId = copyColumnId;
	}

	public BigDecimal getCopyNewFlag() {
		return this.copyNewFlag;
	}

	public void setCopyNewFlag(BigDecimal copyNewFlag) {
		this.copyNewFlag = copyNewFlag;
	}

	public BigDecimal getCopyRowId() {
		return this.copyRowId;
	}

	public void setCopyRowId(BigDecimal copyRowId) {
		this.copyRowId = copyRowId;
	}

	public String getFixedValue() {
		return this.fixedValue;
	}

	public void setFixedValue(String fixedValue) {
		this.fixedValue = fixedValue;
	}

	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getWhereCondition() {
		return this.whereCondition;
	}

	public void setWhereCondition(String whereCondition) {
		this.whereCondition = whereCondition;
	}

}