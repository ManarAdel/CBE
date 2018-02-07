package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the GENERAL_LEDGER_BAL database table.
 * 
 */
@Entity
@Table(name="GENERAL_LEDGER_BAL")
@NamedQuery(name="GeneralLedgerBal.findAll", query="SELECT g FROM GeneralLedgerBal g")
public class GeneralLedgerBal implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GeneralLedgerBalPK id;

	@Column(name="ACCOUNT_BALANCE")
	private BigDecimal accountBalance;

	@Column(name="ACCOUNT_BALANCE_EQU")
	private BigDecimal accountBalanceEqu;

	@Column(name="DR_CR")
	private String drCr;

	public GeneralLedgerBal() {
	}

	public GeneralLedgerBalPK getId() {
		return this.id;
	}

	public void setId(GeneralLedgerBalPK id) {
		this.id = id;
	}

	public BigDecimal getAccountBalance() {
		return this.accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public BigDecimal getAccountBalanceEqu() {
		return this.accountBalanceEqu;
	}

	public void setAccountBalanceEqu(BigDecimal accountBalanceEqu) {
		this.accountBalanceEqu = accountBalanceEqu;
	}

	public String getDrCr() {
		return this.drCr;
	}

	public void setDrCr(String drCr) {
		this.drCr = drCr;
	}

}