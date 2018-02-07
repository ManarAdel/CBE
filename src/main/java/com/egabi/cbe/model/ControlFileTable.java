package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CONTROL_FILE_TABLE database table.
 * 
 */
@Entity
@Table(name="CONTROL_FILE_TABLE")
@NamedQuery(name="ControlFileTable.findAll", query="SELECT c FROM ControlFileTable c")
public class ControlFileTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="DATE_DESCR")
	private String dateDescr;

	public ControlFileTable() {
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public String getDateDescr() {
		return this.dateDescr;
	}

	public void setDateDescr(String dateDescr) {
		this.dateDescr = dateDescr;
	}

}