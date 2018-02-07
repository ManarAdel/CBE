package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CBR_FILE_UPLOAD database table.
 * 
 */
@Entity
@Table(name="CBR_FILE_UPLOAD")
@NamedQuery(name="CbrFileUpload.findAll", query="SELECT c FROM CbrFileUpload c")
public class CbrFileUpload implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	@Column(name="CSV_FILE")
	private byte[] csvFile;

	@Column(name="FILE_ID")
	private BigDecimal fileId;

	public CbrFileUpload() {
	}

	public byte[] getCsvFile() {
		return this.csvFile;
	}

	public void setCsvFile(byte[] csvFile) {
		this.csvFile = csvFile;
	}

	public BigDecimal getFileId() {
		return this.fileId;
	}

	public void setFileId(BigDecimal fileId) {
		this.fileId = fileId;
	}

}