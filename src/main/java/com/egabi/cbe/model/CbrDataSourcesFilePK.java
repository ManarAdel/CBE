package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CBR_DATA_SOURCES_FILE database table.
 * 
 */
@Embeddable
public class CbrDataSourcesFilePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SOURCE_NAME")
	private String sourceName;

	@Column(name="COLUMN_NAME")
	private String columnName;

	public CbrDataSourcesFilePK() {
	}
	public String getSourceName() {
		return this.sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}
	public String getColumnName() {
		return this.columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CbrDataSourcesFilePK)) {
			return false;
		}
		CbrDataSourcesFilePK castOther = (CbrDataSourcesFilePK)other;
		return 
			this.sourceName.equals(castOther.sourceName)
			&& this.columnName.equals(castOther.columnName);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.sourceName.hashCode();
		hash = hash * prime + this.columnName.hashCode();
		
		return hash;
	}
}