package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the CBR_LOOKUP_TYPES database table.
 * 
 */
@Entity
@Table(name="CBR_LOOKUP_TYPES")
@NamedQuery(name="CbrLookupType.findAll", query="SELECT c FROM CbrLookupType c")
public class CbrLookupType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LOOKUP_TYPE")
	private long lookupType;

	@Column(name="LOOKUP_ANAME")
	private String lookupAname;

	@Column(name="LOOKUP_ENAME")
	private String lookupEname;

	//bi-directional many-to-one association to GenericLookup
	@OneToMany(mappedBy="cbrLookupType")
	private List<GenericLookup> genericLookups;

	public CbrLookupType() {
	}

	public long getLookupType() {
		return this.lookupType;
	}

	public void setLookupType(long lookupType) {
		this.lookupType = lookupType;
	}

	public String getLookupAname() {
		return this.lookupAname;
	}

	public void setLookupAname(String lookupAname) {
		this.lookupAname = lookupAname;
	}

	public String getLookupEname() {
		return this.lookupEname;
	}

	public void setLookupEname(String lookupEname) {
		this.lookupEname = lookupEname;
	}

	public List<GenericLookup> getGenericLookups() {
		return this.genericLookups;
	}

	public void setGenericLookups(List<GenericLookup> genericLookups) {
		this.genericLookups = genericLookups;
	}

	public GenericLookup addGenericLookup(GenericLookup genericLookup) {
		getGenericLookups().add(genericLookup);
		genericLookup.setCbrLookupType(this);

		return genericLookup;
	}

	public GenericLookup removeGenericLookup(GenericLookup genericLookup) {
		getGenericLookups().remove(genericLookup);
		genericLookup.setCbrLookupType(null);

		return genericLookup;
	}

}