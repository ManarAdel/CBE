package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CBR_GL_MAPPING_2905 database table.
 * 
 */
@Entity
@Table(name="CBR_GL_MAPPING_2905")
@NamedQuery(name="CbrGlMapping2905.findAll", query="SELECT c FROM CbrGlMapping2905 c")
public class CbrGlMapping2905 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ARABIC_DESCR")
	private String arabicDescr;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="CCY_CODE")
	private String ccyCode;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Column(name="CUST_NO")
	private String custNo;

	@Column(name="GL_CODE")
	private BigDecimal glCode;

	@Column(name="GL_TYPE")
	private String glType;

	@Column(name="GROUP_CODE")
	private BigDecimal groupCode;

	@Column(name="ORIGINAL_NATURE")
	private String originalNature;

	@Column(name="SUB_ACCT")
	private String subAcct;

	public CbrGlMapping2905() {
	}

	public String getArabicDescr() {
		return this.arabicDescr;
	}

	public void setArabicDescr(String arabicDescr) {
		this.arabicDescr = arabicDescr;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getCcyCode() {
		return this.ccyCode;
	}

	public void setCcyCode(String ccyCode) {
		this.ccyCode = ccyCode;
	}

	public String getCenterCode() {
		return this.centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public String getCustNo() {
		return this.custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public BigDecimal getGlCode() {
		return this.glCode;
	}

	public void setGlCode(BigDecimal glCode) {
		this.glCode = glCode;
	}

	public String getGlType() {
		return this.glType;
	}

	public void setGlType(String glType) {
		this.glType = glType;
	}

	public BigDecimal getGroupCode() {
		return this.groupCode;
	}

	public void setGroupCode(BigDecimal groupCode) {
		this.groupCode = groupCode;
	}

	public String getOriginalNature() {
		return this.originalNature;
	}

	public void setOriginalNature(String originalNature) {
		this.originalNature = originalNature;
	}

	public String getSubAcct() {
		return this.subAcct;
	}

	public void setSubAcct(String subAcct) {
		this.subAcct = subAcct;
	}

}