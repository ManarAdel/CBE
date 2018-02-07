package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CBE_ACCOUNT_DATA_TEMP database table.
 * 
 */
@Entity
@Table(name="CBE_ACCOUNT_DATA_TEMP")
@NamedQuery(name="CbeAccountDataTemp.findAll", query="SELECT c FROM CbeAccountDataTemp c")
public class CbeAccountDataTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOUNT_BALANCE")
	private String accountBalance;

	@Column(name="ACCOUNT_BALANCE_EQU")
	private String accountBalanceEqu;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Column(name="ACCOUNT_OPEN_DATE")
	private String accountOpenDate;

	@Column(name="ARREARS_PAST_DUE")
	private String arrearsPastDue;

	@Column(name="BLOCKED_AMT")
	private String blockedAmt;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	private String busdate;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Column(name="CREDIT_INT_RATE")
	private String creditIntRate;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="DAYS_PAST_DUE")
	private String daysPastDue;

	@Column(name="DEAL_NUMBER")
	private String dealNumber;

	@Column(name="DEBIT_INT_RATE")
	private String debitIntRate;

	@Column(name="DR_CR")
	private String drCr;

	@Column(name="FEES_PAST_DUE")
	private String feesPastDue;

	@Column(name="FULL_TERM_DAYS")
	private String fullTermDays;

	@Column(name="GL_CODE")
	private String glCode;

	@Column(name="GUARANTEE_AMT")
	private String guaranteeAmt;

	@Column(name="GUARANTEE_TYPE")
	private String guaranteeType;

	@Column(name="INT_PAST_DUE")
	private String intPastDue;

	@Column(name="MATURITY_DATE")
	private String maturityDate;

	@Column(name="PENALTY_PAST_DUE")
	private String penaltyPastDue;

	@Column(name="PRODUCT_CODE")
	private String productCode;

	@Column(name="PRODUCT_TYPE")
	private String productType;

	@Column(name="REMAIN_TERM_DAYS")
	private String remainTermDays;

	@Column(name="SOURCE_TABLE")
	private String sourceTable;

	@Column(name="SUB_ACCOUNT_NO")
	private String subAccountNo;

	@Column(name="SUSPENDED_INTERST")
	private String suspendedInterst;

	@Column(name="SYSTEM_NAME")
	private String systemName;

	public CbeAccountDataTemp() {
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

	public String getAccountOpenDate() {
		return this.accountOpenDate;
	}

	public void setAccountOpenDate(String accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}

	public String getArrearsPastDue() {
		return this.arrearsPastDue;
	}

	public void setArrearsPastDue(String arrearsPastDue) {
		this.arrearsPastDue = arrearsPastDue;
	}

	public String getBlockedAmt() {
		return this.blockedAmt;
	}

	public void setBlockedAmt(String blockedAmt) {
		this.blockedAmt = blockedAmt;
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

	public String getCreditIntRate() {
		return this.creditIntRate;
	}

	public void setCreditIntRate(String creditIntRate) {
		this.creditIntRate = creditIntRate;
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

	public String getDaysPastDue() {
		return this.daysPastDue;
	}

	public void setDaysPastDue(String daysPastDue) {
		this.daysPastDue = daysPastDue;
	}

	public String getDealNumber() {
		return this.dealNumber;
	}

	public void setDealNumber(String dealNumber) {
		this.dealNumber = dealNumber;
	}

	public String getDebitIntRate() {
		return this.debitIntRate;
	}

	public void setDebitIntRate(String debitIntRate) {
		this.debitIntRate = debitIntRate;
	}

	public String getDrCr() {
		return this.drCr;
	}

	public void setDrCr(String drCr) {
		this.drCr = drCr;
	}

	public String getFeesPastDue() {
		return this.feesPastDue;
	}

	public void setFeesPastDue(String feesPastDue) {
		this.feesPastDue = feesPastDue;
	}

	public String getFullTermDays() {
		return this.fullTermDays;
	}

	public void setFullTermDays(String fullTermDays) {
		this.fullTermDays = fullTermDays;
	}

	public String getGlCode() {
		return this.glCode;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public String getGuaranteeAmt() {
		return this.guaranteeAmt;
	}

	public void setGuaranteeAmt(String guaranteeAmt) {
		this.guaranteeAmt = guaranteeAmt;
	}

	public String getGuaranteeType() {
		return this.guaranteeType;
	}

	public void setGuaranteeType(String guaranteeType) {
		this.guaranteeType = guaranteeType;
	}

	public String getIntPastDue() {
		return this.intPastDue;
	}

	public void setIntPastDue(String intPastDue) {
		this.intPastDue = intPastDue;
	}

	public String getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getPenaltyPastDue() {
		return this.penaltyPastDue;
	}

	public void setPenaltyPastDue(String penaltyPastDue) {
		this.penaltyPastDue = penaltyPastDue;
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getRemainTermDays() {
		return this.remainTermDays;
	}

	public void setRemainTermDays(String remainTermDays) {
		this.remainTermDays = remainTermDays;
	}

	public String getSourceTable() {
		return this.sourceTable;
	}

	public void setSourceTable(String sourceTable) {
		this.sourceTable = sourceTable;
	}

	public String getSubAccountNo() {
		return this.subAccountNo;
	}

	public void setSubAccountNo(String subAccountNo) {
		this.subAccountNo = subAccountNo;
	}

	public String getSuspendedInterst() {
		return this.suspendedInterst;
	}

	public void setSuspendedInterst(String suspendedInterst) {
		this.suspendedInterst = suspendedInterst;
	}

	public String getSystemName() {
		return this.systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

}