package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBR_AUTO_LOADING_FILE_NAME database table.
 * 
 */
@Entity
@Table(name="CBR_AUTO_LOADING_FILE_NAME")
@NamedQuery(name="CbrAutoLoadingFileName.findAll", query="SELECT c FROM CbrAutoLoadingFileName c")
public class CbrAutoLoadingFileName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CSV_FILE_NAME")
	private String csvFileName;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPL_DATE")
	private Date lastUplDate;

	@Column(name="NO_OF_RECORDS_LOADED")
	private BigDecimal noOfRecordsLoaded;

	@Column(name="NO_OF_RECORDS_REJ")
	private BigDecimal noOfRecordsRej;

	private BigDecimal ser;

	@Column(name="SOURCE_FILE_NAME")
	private String sourceFileName;

	public CbrAutoLoadingFileName() {
	}

	public String getCsvFileName() {
		return this.csvFileName;
	}

	public void setCsvFileName(String csvFileName) {
		this.csvFileName = csvFileName;
	}

	public Date getLastUplDate() {
		return this.lastUplDate;
	}

	public void setLastUplDate(Date lastUplDate) {
		this.lastUplDate = lastUplDate;
	}

	public BigDecimal getNoOfRecordsLoaded() {
		return this.noOfRecordsLoaded;
	}

	public void setNoOfRecordsLoaded(BigDecimal noOfRecordsLoaded) {
		this.noOfRecordsLoaded = noOfRecordsLoaded;
	}

	public BigDecimal getNoOfRecordsRej() {
		return this.noOfRecordsRej;
	}

	public void setNoOfRecordsRej(BigDecimal noOfRecordsRej) {
		this.noOfRecordsRej = noOfRecordsRej;
	}

	public BigDecimal getSer() {
		return this.ser;
	}

	public void setSer(BigDecimal ser) {
		this.ser = ser;
	}

	public String getSourceFileName() {
		return this.sourceFileName;
	}

	public void setSourceFileName(String sourceFileName) {
		this.sourceFileName = sourceFileName;
	}

}