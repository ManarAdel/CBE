package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PROD_MAPPING database table.
 * 
 */
@Entity
@Table(name="PROD_MAPPING")
@NamedQuery(name="ProdMapping.findAll", query="SELECT p FROM ProdMapping p")
public class ProdMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BAL_SIGN")
	private String balSign;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private String class1;

	private String class2;

	private String class3;

	private String class4;

	private String class5;

	@Column(name="FROM_TERM")
	private BigDecimal fromTerm;

	@Column(name="PROD_CODE")
	private BigDecimal prodCode;

	@Column(name="PROD_DESCR")
	private String prodDescr;

	@Column(name="SUB_ACCT")
	private String subAcct;

	@Column(name="TERM_REMAINING")
	private BigDecimal termRemaining;

	@Column(name="TO_TERM")
	private BigDecimal toTerm;

	public ProdMapping() {
	}

	public String getBalSign() {
		return this.balSign;
	}

	public void setBalSign(String balSign) {
		this.balSign = balSign;
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public String getClass1() {
		return this.class1;
	}

	public void setClass1(String class1) {
		this.class1 = class1;
	}

	public String getClass2() {
		return this.class2;
	}

	public void setClass2(String class2) {
		this.class2 = class2;
	}

	public String getClass3() {
		return this.class3;
	}

	public void setClass3(String class3) {
		this.class3 = class3;
	}

	public String getClass4() {
		return this.class4;
	}

	public void setClass4(String class4) {
		this.class4 = class4;
	}

	public String getClass5() {
		return this.class5;
	}

	public void setClass5(String class5) {
		this.class5 = class5;
	}

	public BigDecimal getFromTerm() {
		return this.fromTerm;
	}

	public void setFromTerm(BigDecimal fromTerm) {
		this.fromTerm = fromTerm;
	}

	public BigDecimal getProdCode() {
		return this.prodCode;
	}

	public void setProdCode(BigDecimal prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdDescr() {
		return this.prodDescr;
	}

	public void setProdDescr(String prodDescr) {
		this.prodDescr = prodDescr;
	}

	public String getSubAcct() {
		return this.subAcct;
	}

	public void setSubAcct(String subAcct) {
		this.subAcct = subAcct;
	}

	public BigDecimal getTermRemaining() {
		return this.termRemaining;
	}

	public void setTermRemaining(BigDecimal termRemaining) {
		this.termRemaining = termRemaining;
	}

	public BigDecimal getToTerm() {
		return this.toTerm;
	}

	public void setToTerm(BigDecimal toTerm) {
		this.toTerm = toTerm;
	}

}