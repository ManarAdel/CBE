package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CUST_ACCT_V_MERGE database table.
 * 
 */
@Entity
@Table(name="CUST_ACCT_V_MERGE")
@NamedQuery(name="CustAcctVMerge.findAll", query="SELECT c FROM CustAcctVMerge c")
public class CustAcctVMerge implements Serializable {
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

	@Column(name="BRANCH_GOVERNERATE")
	private String branchGovernerate;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private String class1;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="INDUSTRY_CODE")
	private String industryCode;

	public CustAcctVMerge() {
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

	public String getBranchGovernerate() {
		return this.branchGovernerate;
	}

	public void setBranchGovernerate(String branchGovernerate) {
		this.branchGovernerate = branchGovernerate;
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

	public String getIndustryCode() {
		return this.industryCode;
	}

	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

}