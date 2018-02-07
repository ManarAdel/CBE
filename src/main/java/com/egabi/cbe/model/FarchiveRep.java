package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FARCHIVE_REP database table.
 * 
 */
@Entity
@Table(name="FARCHIVE_REP")
@NamedQuery(name="FarchiveRep.findAll", query="SELECT f FROM FarchiveRep f")
public class FarchiveRep implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String progname;

	public FarchiveRep() {
	}

	public String getProgname() {
		return this.progname;
	}

	public void setProgname(String progname) {
		this.progname = progname;
	}

}