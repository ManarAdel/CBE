package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CBR_GL_MAPPING database table.
 * 
 */
@Entity
@Table(name="CBR_GL_MAPPING")
@NamedQuery(name="CbrGlMapping.findAll", query="SELECT c FROM CbrGlMapping c")
public class CbrGlMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrGlMappingPK id;

	@Column(name="ARABIC_DESCR")
	private String arabicDescr;

	@Column(name="GL_TYPE")
	private String glType;

	@Column(name="ORIGINAL_NATURE")
	private String originalNature;

	//bi-directional many-to-one association to CbrGlMappingGroup
	@ManyToOne
	@JoinColumn(name="GROUP_CODE" , insertable = false , updatable = false)
	private CbrGlMappingGroup cbrGlMappingGroup;

	public CbrGlMapping() {
	}

	public CbrGlMappingPK getId() {
		return this.id;
	}

	public void setId(CbrGlMappingPK id) {
		this.id = id;
	}

	public String getArabicDescr() {
		return this.arabicDescr;
	}

	public void setArabicDescr(String arabicDescr) {
		this.arabicDescr = arabicDescr;
	}

	public String getGlType() {
		return this.glType;
	}

	public void setGlType(String glType) {
		this.glType = glType;
	}

	public String getOriginalNature() {
		return this.originalNature;
	}

	public void setOriginalNature(String originalNature) {
		this.originalNature = originalNature;
	}

	public CbrGlMappingGroup getCbrGlMappingGroup() {
		return this.cbrGlMappingGroup;
	}

	public void setCbrGlMappingGroup(CbrGlMappingGroup cbrGlMappingGroup) {
		this.cbrGlMappingGroup = cbrGlMappingGroup;
	}

}