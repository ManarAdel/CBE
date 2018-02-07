package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the FCONTREC database table.
 * 
 */
@Entity
@NamedQuery(name="Fcontrec.findAll", query="SELECT f FROM Fcontrec f")
public class Fcontrec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String filename;

	@Temporal(TemporalType.DATE)
	private Date filedate;

	@Temporal(TemporalType.DATE)
	private Date updatedate;

	public Fcontrec() {
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Date getFiledate() {
		return this.filedate;
	}

	public void setFiledate(Date filedate) {
		this.filedate = filedate;
	}

	public Date getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

}