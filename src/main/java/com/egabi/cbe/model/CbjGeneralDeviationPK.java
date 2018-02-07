package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBJ_GENERAL_DEVIATION database table.
 * 
 */
@Embeddable
public class CbjGeneralDeviationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="FILE_ID")
	private long fileId;

	@Column(name="ROW_NUM")
	private long rowNum;

	@Column(name="TABLE_NAME")
	private String tableName;

	public CbjGeneralDeviationPK() {
	}
	public long getFileId() {
		return this.fileId;
	}
	public void setFileId(long fileId) {
		this.fileId = fileId;
	}
	public long getRowNum() {
		return this.rowNum;
	}
	public void setRowNum(long rowNum) {
		this.rowNum = rowNum;
	}
	public String getTableName() {
		return this.tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbjGeneralDeviationPK)) {
			return false;
		}
		CbjGeneralDeviationPK castOther = (CbjGeneralDeviationPK)other;
		return 
			(this.fileId == castOther.fileId)
			&& (this.rowNum == castOther.rowNum)
			&& this.tableName.equals(castOther.tableName);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.fileId ^ (this.fileId >>> 32)));
		hash = hash * prime + ((int) (this.rowNum ^ (this.rowNum >>> 32)));
		hash = hash * prime + this.tableName.hashCode();
		
		return hash;
	}
}