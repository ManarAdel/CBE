package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CBR_GL_MAPPING_HIS database table.
 * 
 */
@Entity
@Table(name="CBR_GL_MAPPING_HIS")
@NamedQuery(name="CbrGlMappingHi.findAll", query="SELECT c FROM CbrGlMappingHi c")
public class CbrGlMappingHi implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrGlMappingHiPK id;

	@Column(name="ARABIC_DESCR")
	private String arabicDescr;

	@Column(name="GL_TYPE")
	private String glType;

	@Column(name="ORIGINAL_NATURE")
	private String originalNature;

	public CbrGlMappingHi() {
	}

	public CbrGlMappingHiPK getId() {
		return this.id;
	}

	public void setId(CbrGlMappingHiPK id) {
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

}