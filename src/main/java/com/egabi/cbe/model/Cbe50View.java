package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBE_50_VIEW database table.
 * 
 */
@Entity
@Table(name="CBE_50_VIEW")
@NamedQuery(name="Cbe50View.findAll", query="SELECT c FROM Cbe50View c")
public class Cbe50View implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_BALANCE")
	private BigDecimal accountBalance;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private String class1;

	private String class2;

	@Column(name="CLASSIFICATION_TYPE")
	private String classificationType;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="INT_BALANCE")
	private BigDecimal intBalance;

	@Column(name="LN_TERM")
	private String lnTerm;

	@Column(name="TD_TERM")
	private String tdTerm;

	public Cbe50View() {
	}

	public BigDecimal getAccountBalance() {
		return this.accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
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

	public String getClassificationType() {
		return this.classificationType;
	}

	public void setClassificationType(String classificationType) {
		this.classificationType = classificationType;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public BigDecimal getIntBalance() {
		return this.intBalance;
	}

	public void setIntBalance(BigDecimal intBalance) {
		this.intBalance = intBalance;
	}

	public String getLnTerm() {
		return this.lnTerm;
	}

	public void setLnTerm(String lnTerm) {
		this.lnTerm = lnTerm;
	}

	public String getTdTerm() {
		return this.tdTerm;
	}

	public void setTdTerm(String tdTerm) {
		this.tdTerm = tdTerm;
	}

}