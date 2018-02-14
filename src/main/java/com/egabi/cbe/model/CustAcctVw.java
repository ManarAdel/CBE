package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CUST_ACCT_VW database table.
 * 
 */
@Entity
@Table(name="CUST_ACCT_VW")
@NamedQuery(name="CustAcctVw.findAll", query="SELECT c FROM CustAcctVw c")
public class CustAcctVw implements Serializable {
	private static final long serialVersionUID = 1L;
	
		//This Table Doesn't have A PK 
		//Generated Id 
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;

	@Column(name="ACCOUNT_BALANCE")
	private BigDecimal accountBalance;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="CUSTOMER_NAME_E")
	private String customerNameE;

	@Column(name="DEAL_NUMBER")
	private String dealNumber;

	@Column(name="LOOKUP_TYPE")
	private BigDecimal lookupType;

	@Column(name="PRODUCT_CODE")
	private String productCode;

	public CustAcctVw() {
	}

	public BigDecimal getAccountBalance() {
		return this.accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
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

	public String getCustomerNameE() {
		return this.customerNameE;
	}

	public void setCustomerNameE(String customerNameE) {
		this.customerNameE = customerNameE;
	}

	public String getDealNumber() {
		return this.dealNumber;
	}

	public void setDealNumber(String dealNumber) {
		this.dealNumber = dealNumber;
	}

	public BigDecimal getLookupType() {
		return this.lookupType;
	}

	public void setLookupType(BigDecimal lookupType) {
		this.lookupType = lookupType;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}