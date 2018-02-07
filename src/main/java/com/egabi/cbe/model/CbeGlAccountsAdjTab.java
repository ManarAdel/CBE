package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CBE_GL_ACCOUNTS_ADJ_TAB database table.
 * 
 */
@Entity
@Table(name="CBE_GL_ACCOUNTS_ADJ_TAB")
@NamedQuery(name="CbeGlAccountsAdjTab.findAll", query="SELECT c FROM CbeGlAccountsAdjTab c")
public class CbeGlAccountsAdjTab implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbeGlAccountsAdjTabPK id;

	@Column(name="ACCOUNT_BALANCE")
	private BigDecimal accountBalance;

	@Column(name="ACCOUNT_BALANCE_EQU")
	private BigDecimal accountBalanceEqu;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="DR_CR")
	private String drCr;

	public CbeGlAccountsAdjTab() {
	}

	public CbeGlAccountsAdjTabPK getId() {
		return this.id;
	}

	public void setId(CbeGlAccountsAdjTabPK id) {
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

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getDrCr() {
		return this.drCr;
	}

	public void setDrCr(String drCr) {
		this.drCr = drCr;
	}

}