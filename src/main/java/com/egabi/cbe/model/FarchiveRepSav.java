package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the FARCHIVE_REP_SAV database table.
 * 
 */
@Entity
@Table(name="FARCHIVE_REP_SAV")
@NamedQuery(name="FarchiveRepSav.findAll", query="SELECT f FROM FarchiveRepSav f")
public class FarchiveRepSav implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

	private String descr;

	private String filename;

	private String progname;

	@Temporal(TemporalType.DATE)
	private Date savdate;

	private String savtime;

	public FarchiveRepSav() {
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getProgname() {
		return this.progname;
	}

	public void setProgname(String progname) {
		this.progname = progname;
	}

	public Date getSavdate() {
		return this.savdate;
	}

	public void setSavdate(Date savdate) {
		this.savdate = savdate;
	}

	public String getSavtime() {
		return this.savtime;
	}

	public void setSavtime(String savtime) {
		this.savtime = savtime;
	}

}