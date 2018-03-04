package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the CBR_DATA_SOURCES database table.
 * 
 */
@Entity
@Table(name="CBR_DATA_SOURCES")
@NamedQuery(name="CbrDataSource.findAll", query="SELECT c FROM CbrDataSource c")
public class CbrDataSource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SOURCE_NAME")
	private String sourceName;

	private String aname;

	@Column(name="DATE_FORMAT")
	private String dateFormat;

	private String delimiter;

	private String ename;

	@Column(name="IDEN_TYPE")
	private String idenType;

	private String owner;

	@Column(name="\"PATH\"")
	private String path;

	@Column(name="SHEET_NAME")
	private String sheetName;

	@Column(name="SOURCE_TYPE")
	private String sourceType;

	@Column(name="STARTING_LINE")
	private BigDecimal startingLine;

	@Column(name="TABLE_NAME")
	private String tableName;

	//bi-directional many-to-one association to CbrDataDict
	@OneToMany(mappedBy="cbrDataSource")
	private List<CbrDataDict> cbrDataDicts;

	

	
	
	public CbrDataSource() {
	}

	public String getSourceName() {
		return this.sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getDateFormat() {
		return this.dateFormat;
	}

	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public String getDelimiter() {
		return this.delimiter;
	}

	public void setDelimiter(String delimiter) {
		this.delimiter = delimiter;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getIdenType() {
		return this.idenType;
	}

	public void setIdenType(String idenType) {
		this.idenType = idenType;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getSheetName() {
		return this.sheetName;
	}

	public void setSheetName(String sheetName) {
		this.sheetName = sheetName;
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public BigDecimal getStartingLine() {
		return this.startingLine;
	}

	public void setStartingLine(BigDecimal startingLine) {
		this.startingLine = startingLine;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<CbrDataDict> getCbrDataDicts() {
		return this.cbrDataDicts;
	}

	public void setCbrDataDicts(List<CbrDataDict> cbrDataDicts) {
		this.cbrDataDicts = cbrDataDicts;
	}

	public CbrDataDict addCbrDataDict(CbrDataDict cbrDataDict) {
		getCbrDataDicts().add(cbrDataDict);
		cbrDataDict.setCbrDataSource(this);

		return cbrDataDict;
	}

	public CbrDataDict removeCbrDataDict(CbrDataDict cbrDataDict) {
		getCbrDataDicts().remove(cbrDataDict);
		cbrDataDict.setCbrDataSource(null);

		return cbrDataDict;
	}

}