package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CBR_REP_PARAM_SELECT_OLD database table.
 * 
 */
@Entity
@Table(name="CBR_REP_PARAM_SELECT_OLD")
@NamedQuery(name="CbrRepParamSelectOld.findAll", query="SELECT c FROM CbrRepParamSelectOld c")
public class CbrRepParamSelectOld implements Serializable {
	private static final long serialVersionUID = 1L;

	private String aname;

	@Column(name="CALCULATION_FLAG")
	private BigDecimal calculationFlag;

	@Column(name="CELL_FORMULA")
	private String cellFormula;

	@Column(name="COL_NUMBER_VALUE")
	private BigDecimal colNumberValue;

	@Column(name="COL_OPERATOR")
	private String colOperator;

	@Column(name="COLUMN_ID")
	private String columnId;

	@Column(name="COLUMN_NAME")
	private String columnName;

	private String condition;

	@Column(name="COPY_COLUMN_ID")
	private String copyColumnId;

	@Column(name="COPY_REPORT_ID")
	private BigDecimal copyReportId;

	@Column(name="COPY_ROW_ID")
	private BigDecimal copyRowId;

	private String ename;

	@Column(name="FUNCTION_NAME")
	private String functionName;

	@Column(name="QUERY_ANAME")
	private String queryAname;

	@Column(name="QUERY_ENAME")
	private String queryEname;

	@Column(name="QUERY_ID")
	private BigDecimal queryId;

	@Column(name="QUERY_SIGN")
	private String querySign;

	@Column(name="REPORT_ID")
	private BigDecimal reportId;

	@Column(name="ROW_ID")
	private BigDecimal rowId;

	@Column(name="SOURCE_NAME")
	private String sourceName;

	@Column(name="\"VALUE\"")
	private String value;

	@Column(name="ZERO_FLAG")
	private BigDecimal zeroFlag;

	public CbrRepParamSelectOld() {
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public BigDecimal getCalculationFlag() {
		return this.calculationFlag;
	}

	public void setCalculationFlag(BigDecimal calculationFlag) {
		this.calculationFlag = calculationFlag;
	}

	public String getCellFormula() {
		return this.cellFormula;
	}

	public void setCellFormula(String cellFormula) {
		this.cellFormula = cellFormula;
	}

	public BigDecimal getColNumberValue() {
		return this.colNumberValue;
	}

	public void setColNumberValue(BigDecimal colNumberValue) {
		this.colNumberValue = colNumberValue;
	}

	public String getColOperator() {
		return this.colOperator;
	}

	public void setColOperator(String colOperator) {
		this.colOperator = colOperator;
	}

	public String getColumnId() {
		return this.columnId;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}

	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getCopyColumnId() {
		return this.copyColumnId;
	}

	public void setCopyColumnId(String copyColumnId) {
		this.copyColumnId = copyColumnId;
	}

	public BigDecimal getCopyReportId() {
		return this.copyReportId;
	}

	public void setCopyReportId(BigDecimal copyReportId) {
		this.copyReportId = copyReportId;
	}

	public BigDecimal getCopyRowId() {
		return this.copyRowId;
	}

	public void setCopyRowId(BigDecimal copyRowId) {
		this.copyRowId = copyRowId;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public String getQueryAname() {
		return this.queryAname;
	}

	public void setQueryAname(String queryAname) {
		this.queryAname = queryAname;
	}

	public String getQueryEname() {
		return this.queryEname;
	}

	public void setQueryEname(String queryEname) {
		this.queryEname = queryEname;
	}

	public BigDecimal getQueryId() {
		return this.queryId;
	}

	public void setQueryId(BigDecimal queryId) {
		this.queryId = queryId;
	}

	public String getQuerySign() {
		return this.querySign;
	}

	public void setQuerySign(String querySign) {
		this.querySign = querySign;
	}

	public BigDecimal getReportId() {
		return this.reportId;
	}

	public void setReportId(BigDecimal reportId) {
		this.reportId = reportId;
	}

	public BigDecimal getRowId() {
		return this.rowId;
	}

	public void setRowId(BigDecimal rowId) {
		this.rowId = rowId;
	}

	public String getSourceName() {
		return this.sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public BigDecimal getZeroFlag() {
		return this.zeroFlag;
	}

	public void setZeroFlag(BigDecimal zeroFlag) {
		this.zeroFlag = zeroFlag;
	}

}