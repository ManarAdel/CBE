package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FWCUST_ACCT_V1 database table.
 * 
 */
@Entity
@Table(name="FWCUST_ACCT_V1")
@NamedQuery(name="FwcustAcctV1.findAll", query="SELECT f FROM FwcustAcctV1 f")
public class FwcustAcctV1 implements Serializable {
	private static final long serialVersionUID = 1L;
	
			//This Table Doesn't have A PK 
			//Generated Id 
			@Id
		    @GeneratedValue(strategy=GenerationType.IDENTITY)
		    private Long id;

	@Column(name="ACCOUNT_BALANCE_EQU")
	private BigDecimal accountBalanceEqu;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private String class1;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="CUSTOMER_NAME_A")
	private String customerNameA;

	@Column(name="CUSTOMER_NAME_E")
	private String customerNameE;

	@Column(name="INDUSTRY_CODE")
	private String industryCode;

	public FwcustAcctV1() {
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

	public String getCustomerNameA() {
		return this.customerNameA;
	}

	public void setCustomerNameA(String customerNameA) {
		this.customerNameA = customerNameA;
	}

	public String getCustomerNameE() {
		return this.customerNameE;
	}

	public void setCustomerNameE(String customerNameE) {
		this.customerNameE = customerNameE;
	}

	public String getIndustryCode() {
		return this.industryCode;
	}

	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}

}