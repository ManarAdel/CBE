package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CONTROL_FILE database table.
 * 
 */
@Entity
@Table(name="CONTROL_FILE")
@NamedQuery(name="ControlFile.findAll", query="SELECT c FROM ControlFile c")
public class ControlFile implements Serializable {
	private static final long serialVersionUID = 1L;
	
		//This Table Doesn't have A PK 
		//Generated Id 
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="DATE_DESCR")
	private String dateDescr;

	public ControlFile() {
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