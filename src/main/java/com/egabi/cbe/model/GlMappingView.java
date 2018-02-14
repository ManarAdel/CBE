package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the GL_MAPPING_VIEW database table.
 * 
 */
@Entity
@Table(name="GL_MAPPING_VIEW")
@NamedQuery(name="GlMappingView.findAll", query="SELECT g FROM GlMappingView g")
public class GlMappingView implements Serializable {
	private static final long serialVersionUID = 1L;
	
		//This Table Doesn't have A PK 
		//Generated Id 
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;

	@Column(name="ARABIC_DESCR")
	private String arabicDescr;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Temporal(TemporalType.DATE)
	private Date busdate;

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

	public GlMappingView() {
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

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
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