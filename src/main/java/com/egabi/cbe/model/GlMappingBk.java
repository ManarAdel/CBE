package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the GL_MAPPING_BK database table.
 * 
 */
@Entity
@Table(name="GL_MAPPING_BK")
@NamedQuery(name="GlMappingBk.findAll", query="SELECT g FROM GlMappingBk g")
public class GlMappingBk implements Serializable {
	private static final long serialVersionUID = 1L;

	private String br;

	@Temporal(TemporalType.DATE)
	private Date busdate;

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

	public GlMappingBk() {
	}

	public String getBr() {
		return this.br;
	}

	public void setBr(String br) {
		this.br = br;
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
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