package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CBR_GL_MAPPING_TEMP database table.
 * 
 */
@Entity
@Table(name="CBR_GL_MAPPING_TEMP")
@NamedQuery(name="CbrGlMappingTemp.findAll", query="SELECT c FROM CbrGlMappingTemp c")
public class CbrGlMappingTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="BRANCH_CODE_LST")
	private String branchCodeLst;

	@Column(name="CCY_CODE")
	private String ccyCode;

	@Column(name="CCY_CODE_LST")
	private String ccyCodeLst;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Column(name="CENTER_CODE_LST")
	private String centerCodeLst;

	@Column(name="CURR_REC")
	private BigDecimal currRec;

	@Column(name="CUST_NO")
	private String custNo;

	@Column(name="CUST_NO_LST")
	private String custNoLst;

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

	@Column(name="SUB_ACCT_LST")
	private String subAcctLst;

	public CbrGlMappingTemp() {
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchCodeLst() {
		return this.branchCodeLst;
	}

	public void setBranchCodeLst(String branchCodeLst) {
		this.branchCodeLst = branchCodeLst;
	}

	public String getCcyCode() {
		return this.ccyCode;
	}

	public void setCcyCode(String ccyCode) {
		this.ccyCode = ccyCode;
	}

	public String getCcyCodeLst() {
		return this.ccyCodeLst;
	}

	public void setCcyCodeLst(String ccyCodeLst) {
		this.ccyCodeLst = ccyCodeLst;
	}

	public String getCenterCode() {
		return this.centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public String getCenterCodeLst() {
		return this.centerCodeLst;
	}

	public void setCenterCodeLst(String centerCodeLst) {
		this.centerCodeLst = centerCodeLst;
	}

	public BigDecimal getCurrRec() {
		return this.currRec;
	}

	public void setCurrRec(BigDecimal currRec) {
		this.currRec = currRec;
	}

	public String getCustNo() {
		return this.custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustNoLst() {
		return this.custNoLst;
	}

	public void setCustNoLst(String custNoLst) {
		this.custNoLst = custNoLst;
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

	public String getSubAcctLst() {
		return this.subAcctLst;
	}

	public void setSubAcctLst(String subAcctLst) {
		this.subAcctLst = subAcctLst;
	}

}