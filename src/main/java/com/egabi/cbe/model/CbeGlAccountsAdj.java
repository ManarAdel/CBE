package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBE_GL_ACCOUNTS_ADJ database table.
 * 
 */
@Entity
@Table(name="CBE_GL_ACCOUNTS_ADJ")
@NamedQuery(name="CbeGlAccountsAdj.findAll", query="SELECT c FROM CbeGlAccountsAdj c")
public class CbeGlAccountsAdj implements Serializable {
	private static final long serialVersionUID = 1L;

		//This Table Doesn't have A PK 
		//Generated Id 
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;
		
	@Column(name="ACCOUNT_BALANCE")
	private BigDecimal accountBalance;

	@Column(name="ACCOUNT_BALANCE_EQU")
	private BigDecimal accountBalanceEqu;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="DR_CR")
	private String drCr;

	@Column(name="ENTRY_DESCRIPTION")
	private String entryDescription;

	@Column(name="GL_CODE")
	private String glCode;

	@Column(name="SUB_ACCOUNT_NO")
	private String subAccountNo;

	public CbeGlAccountsAdj() {
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

	public String getCenterCode() {
		return this.centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getDrCr() {
		return this.drCr;
	}

	public void setDrCr(String drCr) {
		this.drCr = drCr;
	}

	public String getEntryDescription() {
		return this.entryDescription;
	}

	public void setEntryDescription(String entryDescription) {
		this.entryDescription = entryDescription;
	}

	public String getGlCode() {
		return this.glCode;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public String getSubAccountNo() {
		return this.subAccountNo;
	}

	public void setSubAccountNo(String subAccountNo) {
		this.subAccountNo = subAccountNo;
	}

}