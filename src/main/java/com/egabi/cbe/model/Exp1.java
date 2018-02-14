package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the EXP1 database table.
 * 
 */
@Entity
@NamedQuery(name="Exp1.findAll", query="SELECT e FROM Exp1 e")
public class Exp1 implements Serializable {
	private static final long serialVersionUID = 1L;
	
			//This Table Doesn't have A PK 
			//Generated Id 
			@Id
		    @GeneratedValue(strategy=GenerationType.IDENTITY)
		    private Long id;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private String class1;

	@Column(name="CURR_F_BALANCE_EQU")
	private BigDecimal currFBalanceEqu;

	@Column(name="CURR_L_BALANCE_EQU")
	private BigDecimal currLBalanceEqu;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="CUSTOMER_NAME_A")
	private String customerNameA;

	@Column(name="F_DIFF")
	private BigDecimal fDiff;

	@Column(name="INDUSTRY_CODE_MAIN")
	private String industryCodeMain;

	@Column(name="INDUSTRY_CODE_MAIN_DESCR")
	private String industryCodeMainDescr;

	@Column(name="INDUSTRY_CODE_SUB")
	private String industryCodeSub;

	@Column(name="INDUSTRY_CODE_SUB_DESCR")
	private String industryCodeSubDescr;

	@Column(name="L_DIFF")
	private BigDecimal lDiff;

	@Column(name="PERV_F_BALANCE_EQU")
	private BigDecimal pervFBalanceEqu;

	@Column(name="PERV_L_BALANCE_EQU")
	private BigDecimal pervLBalanceEqu;

	@Column(name="PRODUCT_DESCR")
	private String productDescr;

	public Exp1() {
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

	public BigDecimal getCurrFBalanceEqu() {
		return this.currFBalanceEqu;
	}

	public void setCurrFBalanceEqu(BigDecimal currFBalanceEqu) {
		this.currFBalanceEqu = currFBalanceEqu;
	}

	public BigDecimal getCurrLBalanceEqu() {
		return this.currLBalanceEqu;
	}

	public void setCurrLBalanceEqu(BigDecimal currLBalanceEqu) {
		this.currLBalanceEqu = currLBalanceEqu;
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

	public BigDecimal getFDiff() {
		return this.fDiff;
	}

	public void setFDiff(BigDecimal fDiff) {
		this.fDiff = fDiff;
	}

	public String getIndustryCodeMain() {
		return this.industryCodeMain;
	}

	public void setIndustryCodeMain(String industryCodeMain) {
		this.industryCodeMain = industryCodeMain;
	}

	public String getIndustryCodeMainDescr() {
		return this.industryCodeMainDescr;
	}

	public void setIndustryCodeMainDescr(String industryCodeMainDescr) {
		this.industryCodeMainDescr = industryCodeMainDescr;
	}

	public String getIndustryCodeSub() {
		return this.industryCodeSub;
	}

	public void setIndustryCodeSub(String industryCodeSub) {
		this.industryCodeSub = industryCodeSub;
	}

	public String getIndustryCodeSubDescr() {
		return this.industryCodeSubDescr;
	}

	public void setIndustryCodeSubDescr(String industryCodeSubDescr) {
		this.industryCodeSubDescr = industryCodeSubDescr;
	}

	public BigDecimal getLDiff() {
		return this.lDiff;
	}

	public void setLDiff(BigDecimal lDiff) {
		this.lDiff = lDiff;
	}

	public BigDecimal getPervFBalanceEqu() {
		return this.pervFBalanceEqu;
	}

	public void setPervFBalanceEqu(BigDecimal pervFBalanceEqu) {
		this.pervFBalanceEqu = pervFBalanceEqu;
	}

	public BigDecimal getPervLBalanceEqu() {
		return this.pervLBalanceEqu;
	}

	public void setPervLBalanceEqu(BigDecimal pervLBalanceEqu) {
		this.pervLBalanceEqu = pervLBalanceEqu;
	}

	public String getProductDescr() {
		return this.productDescr;
	}

	public void setProductDescr(String productDescr) {
		this.productDescr = productDescr;
	}

}