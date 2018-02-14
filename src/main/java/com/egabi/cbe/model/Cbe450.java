package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBE_450 database table.
 * 
 */
@Entity
@Table(name="CBE_450")
@NamedQuery(name="Cbe450.findAll", query="SELECT c FROM Cbe450 c")
public class Cbe450 implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

	private BigDecimal balance;

	@Column(name="BALANCE_EQU")
	private BigDecimal balanceEqu;

	@Column(name="BANK_LOCATION")
	private String bankLocation;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private String class1;

	private String class2;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	public Cbe450() {
	}

	public BigDecimal getBalance() {
		return this.balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getBalanceEqu() {
		return this.balanceEqu;
	}

	public void setBalanceEqu(BigDecimal balanceEqu) {
		this.balanceEqu = balanceEqu;
	}

	public String getBankLocation() {
		return this.bankLocation;
	}

	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
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

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

}