package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the WWW_TEMP database table.
 * 
 */
@Entity
@Table(name="WWW_TEMP")
@NamedQuery(name="WwwTemp.findAll", query="SELECT w FROM WwwTemp w")
public class WwwTemp implements Serializable {
	private static final long serialVersionUID = 1L;
	
		//This Table Doesn't have A PK 
		//Generated Id 
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;

	private String amt;

	private String busdate;

	public WwwTemp() {
	}

	public String getAmt() {
		return this.amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
		this.busdate = busdate;
	}

}