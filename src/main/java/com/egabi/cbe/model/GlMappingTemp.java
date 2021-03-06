package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the GL_MAPPING_TEMP database table.
 * 
 */
@Entity
@Table(name="GL_MAPPING_TEMP")
@NamedQuery(name="GlMappingTemp.findAll", query="SELECT g FROM GlMappingTemp g")
public class GlMappingTemp implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	

	private String br;

	private String busdate;

	private String cc;

	private String cur;

	private String cust;

	private String gl;

	@Column(name="GL_DESC")
	private String glDesc;

	@Column(name="GROUP_CODE")
	private String groupCode;

	@Column(name="ORG_NAT")
	private String orgNat;

	private String sub;

	@Column(name="\"TYPE\"")
	private String type;

	public GlMappingTemp() {
	}

	public String getBr() {
		return this.br;
	}

	public void setBr(String br) {
		this.br = br;
	}

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
		this.busdate = busdate;
	}

	public String getCc() {
		return this.cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getCur() {
		return this.cur;
	}

	public void setCur(String cur) {
		this.cur = cur;
	}

	public String getCust() {
		return this.cust;
	}

	public void setCust(String cust) {
		this.cust = cust;
	}

	public String getGl() {
		return this.gl;
	}

	public void setGl(String gl) {
		this.gl = gl;
	}

	public String getGlDesc() {
		return this.glDesc;
	}

	public void setGlDesc(String glDesc) {
		this.glDesc = glDesc;
	}

	public String getGroupCode() {
		return this.groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	public String getOrgNat() {
		return this.orgNat;
	}

	public void setOrgNat(String orgNat) {
		this.orgNat = orgNat;
	}

	public String getSub() {
		return this.sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}