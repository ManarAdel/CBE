package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CBR_DATA_DICT database table.
 * 
 */
@Entity
@Table(name="CBR_DATA_DICT")
@NamedQuery(name="CbrDataDict.findAll", query="SELECT c FROM CbrDataDict c")
public class CbrDataDict implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrDataDictPK id;

	private String aname;

	private String ename;

	//bi-directional many-to-one association to CbrDataSource
	@ManyToOne
	@JoinColumn(name="SOURCE_NAME")
	private CbrDataSource cbrDataSource;

	public CbrDataDict() {
	}

	public CbrDataDictPK getId() {
		return this.id;
	}

	public void setId(CbrDataDictPK id) {
		this.id = id;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public CbrDataSource getCbrDataSource() {
		return this.cbrDataSource;
	}

	public void setCbrDataSource(CbrDataSource cbrDataSource) {
		this.cbrDataSource = cbrDataSource;
	}

}