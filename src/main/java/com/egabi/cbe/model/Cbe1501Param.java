package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBE_1501_PARAM database table.
 * 
 */
@Entity
@Table(name="CBE_1501_PARAM")
@NamedQuery(name="Cbe1501Param.findAll", query="SELECT c FROM Cbe1501Param c")
public class Cbe1501Param implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	

	private String adescr;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private String edescr;

	@Column(name="LOOKUP_DESCR")
	private String lookupDescr;

	@Column(name="LOOKUP_TYPE")
	private BigDecimal lookupType;

	@Column(name="LOOKUP_VALUE")
	private String lookupValue;

	public Cbe1501Param() {
	}

	public String getAdescr() {
		return this.adescr;
	}

	public void setAdescr(String adescr) {
		this.adescr = adescr;
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public String getEdescr() {
		return this.edescr;
	}

	public void setEdescr(String edescr) {
		this.edescr = edescr;
	}

	public String getLookupDescr() {
		return this.lookupDescr;
	}

	public void setLookupDescr(String lookupDescr) {
		this.lookupDescr = lookupDescr;
	}

	public BigDecimal getLookupType() {
		return this.lookupType;
	}

	public void setLookupType(BigDecimal lookupType) {
		this.lookupType = lookupType;
	}

	public String getLookupValue() {
		return this.lookupValue;
	}

	public void setLookupValue(String lookupValue) {
		this.lookupValue = lookupValue;
	}

}