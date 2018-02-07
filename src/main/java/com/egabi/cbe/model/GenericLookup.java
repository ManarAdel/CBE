package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the GENERIC_LOOKUP database table.
 * 
 */
@Entity
@Table(name="GENERIC_LOOKUP")
@NamedQuery(name="GenericLookup.findAll", query="SELECT g FROM GenericLookup g")
public class GenericLookup implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GenericLookupPK id;

	private String adescr;

	private String edescr;

	@Column(name="LOOKUP_DESCR")
	private String lookupDescr;

	//bi-directional many-to-one association to CbrLookupType
	@ManyToOne
	@JoinColumn(name="LOOKUP_TYPE")
	private CbrLookupType cbrLookupType;

	public GenericLookup() {
	}

	public GenericLookupPK getId() {
		return this.id;
	}

	public void setId(GenericLookupPK id) {
		this.id = id;
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

	public CbrLookupType getCbrLookupType() {
		return this.cbrLookupType;
	}

	public void setCbrLookupType(CbrLookupType cbrLookupType) {
		this.cbrLookupType = cbrLookupType;
	}

}