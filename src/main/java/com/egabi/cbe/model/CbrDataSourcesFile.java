package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CBR_DATA_SOURCES_FILE database table.
 * 
 */
@Entity
@Table(name="CBR_DATA_SOURCES_FILE")
@NamedQuery(name="CbrDataSourcesFile.findAll", query="SELECT c FROM CbrDataSourcesFile c")
public class CbrDataSourcesFile implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrDataSourcesFilePK id;

	private String aname;

	@Column(name="COL_ID")
	private String colId;

	@Column(name="COL_ORDER")
	private BigDecimal colOrder;

	@Column(name="DATA_TYPE")
	private String dataType;

	private String ename;

	@Column(name="FROM_DIGIT")
	private BigDecimal fromDigit;

	private BigDecimal mandatory;

	@Column(name="\"PRECISION\"")
	private BigDecimal precision;

	@Column(name="PRIMARY_KEY")
	private BigDecimal primaryKey;

	@Column(name="TO_DIGIT")
	private BigDecimal toDigit;

	public CbrDataSourcesFile() {
	}

	public CbrDataSourcesFilePK getId() {
		return this.id;
	}

	public void setId(CbrDataSourcesFilePK id) {
		this.id = id;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getColId() {
		return this.colId;
	}

	public void setColId(String colId) {
		this.colId = colId;
	}

	public BigDecimal getColOrder() {
		return this.colOrder;
	}

	public void setColOrder(BigDecimal colOrder) {
		this.colOrder = colOrder;
	}

	public String getDataType() {
		return this.dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public BigDecimal getFromDigit() {
		return this.fromDigit;
	}

	public void setFromDigit(BigDecimal fromDigit) {
		this.fromDigit = fromDigit;
	}

	public BigDecimal getMandatory() {
		return this.mandatory;
	}

	public void setMandatory(BigDecimal mandatory) {
		this.mandatory = mandatory;
	}

	public BigDecimal getPrecision() {
		return this.precision;
	}

	public void setPrecision(BigDecimal precision) {
		this.precision = precision;
	}

	public BigDecimal getPrimaryKey() {
		return this.primaryKey;
	}

	public void setPrimaryKey(BigDecimal primaryKey) {
		this.primaryKey = primaryKey;
	}

	public BigDecimal getToDigit() {
		return this.toDigit;
	}

	public void setToDigit(BigDecimal toDigit) {
		this.toDigit = toDigit;
	}

}