package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the GENERIC_LOOKUP_V database table.
 * 
 */
@Entity
@Table(name="GENERIC_LOOKUP_V")
@NamedQuery(name="GenericLookupV.findAll", query="SELECT g FROM GenericLookupV g")
public class GenericLookupV implements Serializable {
	private static final long serialVersionUID = 1L;
	
			//This Table Doesn't have A PK 
			//Generated Id 
			@Id
		    @GeneratedValue(strategy=GenerationType.IDENTITY)
		    private Long id;

	private String adescr;

	private String edescr;

	@Column(name="LOOKUP_DESCR")
	private String lookupDescr;

	@Column(name="LOOKUP_TYPE")
	private BigDecimal lookupType;

	@Column(name="LOOKUP_VALUE")
	private String lookupValue;

	public GenericLookupV() {
	}

	public String getAdescr() {
		return this.adescr;
	}

	public void setAdescr(String adescr) {
		this.adescr = adescr;
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