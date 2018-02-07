package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TREASURY_BILLS database table.
 * 
 */
@Entity
@Table(name="TREASURY_BILLS")
@NamedQuery(name="TreasuryBill.findAll", query="SELECT t FROM TreasuryBill t")
public class TreasuryBill implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="DISC_")
	private BigDecimal disc;

	@Column(name="EARNED_INTEREST")
	private BigDecimal earnedInterest;

	private BigDecimal fv;

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

	public TreasuryBill() {
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
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