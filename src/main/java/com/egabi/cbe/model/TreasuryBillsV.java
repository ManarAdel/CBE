package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TREASURY_BILLS_V database table.
 * 
 */
@Entity
@Table(name="TREASURY_BILLS_V")
@NamedQuery(name="TreasuryBillsV.findAll", query="SELECT t FROM TreasuryBillsV t")
public class TreasuryBillsV implements Serializable {
	private static final long serialVersionUID = 1L;
	
			//This Table Doesn't have A PK 
			//Generated Id 
			@Id
		    @GeneratedValue(strategy=GenerationType.IDENTITY)
		    private Long id;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="\"DAYS\"")
	private BigDecimal days;

	@Column(name="DISC_")
	private BigDecimal disc;

	@Column(name="EARNED_INTEREST")
	private BigDecimal earnedInterest;

	private BigDecimal fv;

	private BigDecimal mat;

	@Temporal(TemporalType.DATE)
	@Column(name="MAT_DATE")
	private Date matDate;

	@Column(name="NET_AMOUNT")
	private BigDecimal netAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="SET_DATE")
	private Date setDate;

	private BigDecimal tax;

	@Column(name="UNEARNED_INTEREST")
	private BigDecimal unearnedInterest;

	private BigDecimal ytm;

	public TreasuryBillsV() {
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public BigDecimal getDays() {
		return this.days;
	}

	public void setDays(BigDecimal days) {
		this.days = days;
	}

	public BigDecimal getDisc() {
		return this.disc;
	}

	public void setDisc(BigDecimal disc) {
		this.disc = disc;
	}

	public BigDecimal getEarnedInterest() {
		return this.earnedInterest;
	}

	public void setEarnedInterest(BigDecimal earnedInterest) {
		this.earnedInterest = earnedInterest;
	}

	public BigDecimal getFv() {
		return this.fv;
	}

	public void setFv(BigDecimal fv) {
		this.fv = fv;
	}

	public BigDecimal getMat() {
		return this.mat;
	}

	public void setMat(BigDecimal mat) {
		this.mat = mat;
	}

	public Date getMatDate() {
		return this.matDate;
	}

	public void setMatDate(Date matDate) {
		this.matDate = matDate;
	}

	public BigDecimal getNetAmount() {
		return this.netAmount;
	}

	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
	}

	public Date getSetDate() {
		return this.setDate;
	}

	public void setSetDate(Date setDate) {
		this.setDate = setDate;
	}

	public BigDecimal getTax() {
		return this.tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	public BigDecimal getUnearnedInterest() {
		return this.unearnedInterest;
	}

	public void setUnearnedInterest(BigDecimal unearnedInterest) {
		this.unearnedInterest = unearnedInterest;
	}

	public BigDecimal getYtm() {
		return this.ytm;
	}

	public void setYtm(BigDecimal ytm) {
		this.ytm = ytm;
	}

}