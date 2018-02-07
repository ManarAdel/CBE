package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the GL_ADJUSTMENT database table.
 * 
 */
@Entity
@Table(name="GL_ADJUSTMENT")
@NamedQuery(name="GlAdjustment.findAll", query="SELECT g FROM GlAdjustment g")
public class GlAdjustment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCT_DESCRIPTION_ARB")
	private String acctDescriptionArb;

	@Column(name="ACCT_DESCRIPTION_ENG")
	private String acctDescriptionEng;

	private BigDecimal bal;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CCY_CODE")
	private String ccyCode;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Column(name="CUST_NO_BANK_NO")
	private String custNoBankNo;

	@Column(name="DR_CR")
	private String drCr;

	private BigDecimal equivalent;

	@Column(name="GL_CODE")
	private String glCode;

	@Column(name="SUB_ACCT")
	private String subAcct;

	public GlAdjustment() {
	}

	public String getAcctDescriptionArb() {
		return this.acctDescriptionArb;
	}

	public void setAcctDescriptionArb(String acctDescriptionArb) {
		this.acctDescriptionArb = acctDescriptionArb;
	}

	public String getAcctDescriptionEng() {
		return this.acctDescriptionEng;
	}

	public void setAcctDescriptionEng(String acctDescriptionEng) {
		this.acctDescriptionEng = acctDescriptionEng;
	}

	public BigDecimal getBal() {
		return this.bal;
	}

	public void setBal(BigDecimal bal) {
		this.bal = bal;
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

	public String getCustNoBankNo() {
		return this.custNoBankNo;
	}

	public void setCustNoBankNo(String custNoBankNo) {
		this.custNoBankNo = custNoBankNo;
	}

	public String getDrCr() {
		return this.drCr;
	}

	public void setDrCr(String drCr) {
		this.drCr = drCr;
	}

	public BigDecimal getEquivalent() {
		return this.equivalent;
	}

	public void setEquivalent(BigDecimal equivalent) {
		this.equivalent = equivalent;
	}

	public String getGlCode() {
		return this.glCode;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public String getSubAcct() {
		return this.subAcct;
	}

	public void setSubAcct(String subAcct) {
		this.subAcct = subAcct;
	}

}