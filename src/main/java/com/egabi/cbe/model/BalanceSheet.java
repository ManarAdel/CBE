package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the BALANCE_SHEET database table.
 * 
 */
@Entity
@Table(name="BALANCE_SHEET")
@NamedQuery(name="BalanceSheet.findAll", query="SELECT b FROM BalanceSheet b")
public class BalanceSheet implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	


	@Column(name="ACCOUNT_BALANCE")
	private String accountBalance;

	@Column(name="ACCOUNT_BALANCE_EQU")
	private String accountBalanceEqu;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	private String busdate;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="DR_CR")
	private String drCr;

	@Column(name="GL_CODE")
	private String glCode;

	@Column(name="SUB_ACCOUNT_NO")
	private String subAccountNo;

	public BalanceSheet() {
	}

	public String getAccountBalance() {
		return this.accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountBalanceEqu() {
		return this.accountBalanceEqu;
	}

	public void setAccountBalanceEqu(String accountBalanceEqu) {
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

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
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