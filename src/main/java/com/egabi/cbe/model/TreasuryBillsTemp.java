package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TREASURY_BILLS_TEMP database table.
 * 
 */
@Entity
@Table(name="TREASURY_BILLS_TEMP")
@NamedQuery(name="TreasuryBillsTemp.findAll", query="SELECT t FROM TreasuryBillsTemp t")
public class TreasuryBillsTemp implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


	private String busdate;

	@Column(name="DISC_")
	private String disc;

	@Column(name="EARNED_INTEREST")
	private String earnedInterest;

	private String fv;

	@Column(name="MAT_DATE")
	private String matDate;

	@Column(name="NET_AMOUNT")
	private String netAmount;

	@Column(name="SET_DATE")
	private String setDate;

	private String tax;

	@Column(name="UNEARNED_INTEREST")
	private String unearnedInterest;

	private String ytm;

	public TreasuryBillsTemp() {
	}

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
		this.busdate = busdate;
	}

	public String getDisc() {
		return this.disc;
	}

	public void setDisc(String disc) {
		this.disc = disc;
	}

	public String getEarnedInterest() {
		return this.earnedInterest;
	}

	public void setEarnedInterest(String earnedInterest) {
		this.earnedInterest = earnedInterest;
	}

	public String getFv() {
		return this.fv;
	}

	public void setFv(String fv) {
		this.fv = fv;
	}

	public String getMatDate() {
		return this.matDate;
	}

	public void setMatDate(String matDate) {
		this.matDate = matDate;
	}

	public String getNetAmount() {
		return this.netAmount;
	}

	public void setNetAmount(String netAmount) {
		this.netAmount = netAmount;
	}

	public String getSetDate() {
		return this.setDate;
	}

	public void setSetDate(String setDate) {
		this.setDate = setDate;
	}

	public String getTax() {
		return this.tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getUnearnedInterest() {
		return this.unearnedInterest;
	}

	public void setUnearnedInterest(String unearnedInterest) {
		this.unearnedInterest = unearnedInterest;
	}

	public String getYtm() {
		return this.ytm;
	}

	public void setYtm(String ytm) {
		this.ytm = ytm;
	}

}