package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FW3501 database table.
 * 
 */
@Entity
@NamedQuery(name="Fw3501.findAll", query="SELECT f FROM Fw3501 f")
public class Fw3501 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="BALANCE_EQU")
	private BigDecimal balanceEqu;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="CUSTOMER_TYPE")
	private String customerType;

	private String descr;

	@Column(name="OPEN_BALANCE")
	private BigDecimal openBalance;

	private BigDecimal period;

	@Column(name="PRODUCT_CODE")
	private String productCode;

	private BigDecimal rates;

	private String trancode;

	public Fw3501() {
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getBalanceEqu() {
		return this.balanceEqu;
	}

	public void setBalanceEqu(BigDecimal balanceEqu) {
		this.balanceEqu = balanceEqu;
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

	public String getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public BigDecimal getOpenBalance() {
		return this.openBalance;
	}

	public void setOpenBalance(BigDecimal openBalance) {
		this.openBalance = openBalance;
	}

	public BigDecimal getPeriod() {
		return this.period;
	}

	public void setPeriod(BigDecimal period) {
		this.period = period;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public BigDecimal getRates() {
		return this.rates;
	}

	public void setRates(BigDecimal rates) {
		this.rates = rates;
	}

	public String getTrancode() {
		return this.trancode;
	}

	public void setTrancode(String trancode) {
		this.trancode = trancode;
	}

}