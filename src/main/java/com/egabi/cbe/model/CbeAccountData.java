package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBE_ACCOUNT_DATA database table.
 * 
 */
@Entity
@Table(name="CBE_ACCOUNT_DATA")
@NamedQuery(name="CbeAccountData.findAll", query="SELECT c FROM CbeAccountData c")
public class CbeAccountData implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbeAccountDataPK id;

	@Column(name="ACCOUNT_BALANCE")
	private BigDecimal accountBalance;

	@Column(name="ACCOUNT_BALANCE_EQU")
	private BigDecimal accountBalanceEqu;

	@Temporal(TemporalType.DATE)
	@Column(name="ACCOUNT_OPEN_DATE")
	private Date accountOpenDate;

	@Column(name="ARREARS_PAST_DUE")
	private BigDecimal arrearsPastDue;

	@Column(name="BLOCKED_AMT")
	private BigDecimal blockedAmt;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Column(name="CREDIT_INT_RATE")
	private BigDecimal creditIntRate;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="DAYS_PAST_DUE")
	private BigDecimal daysPastDue;

	@Column(name="DEAL_NUMBER")
	private String dealNumber;

	@Column(name="DEBIT_INT_RATE")
	private BigDecimal debitIntRate;

	@Column(name="DR_CR")
	private String drCr;

	@Column(name="FEES_PAST_DUE")
	private BigDecimal feesPastDue;

	@Column(name="FULL_TERM_DAYS")
	private BigDecimal fullTermDays;

	@Column(name="GL_CODE")
	private String glCode;

	@Column(name="GUARANTEE_AMT")
	private BigDecimal guaranteeAmt;

	@Column(name="GUARANTEE_TYPE")
	private String guaranteeType;

	@Column(name="INT_PAST_DUE")
	private BigDecimal intPastDue;

	@Temporal(TemporalType.DATE)
	@Column(name="MATURITY_DATE")
	private Date maturityDate;

	@Column(name="PENALTY_PAST_DUE")
	private BigDecimal penaltyPastDue;

	@Column(name="PRODUCT_CODE")
	private String productCode;

	@Column(name="PRODUCT_TYPE")
	private String productType;

	@Column(name="REMAIN_TERM_DAYS")
	private BigDecimal remainTermDays;

	@Column(name="SOURCE_TABLE")
	private String sourceTable;

	@Column(name="SUB_ACCOUNT_NO")
	private String subAccountNo;

	@Column(name="SUSPENDED_INTERST")
	private BigDecimal suspendedInterst;

	@Column(name="SYSTEM_NAME")
	private String systemName;

	public CbeAccountData() {
	}

	public CbeAccountDataPK getId() {
		return this.id;
	}

	public void setId(CbeAccountDataPK id) {
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

	public Date getAccountOpenDate() {
		return this.accountOpenDate;
	}

	public void setAccountOpenDate(Date accountOpenDate) {
		this.accountOpenDate = accountOpenDate;
	}

	public BigDecimal getArrearsPastDue() {
		return this.arrearsPastDue;
	}

	public void setArrearsPastDue(BigDecimal arrearsPastDue) {
		this.arrearsPastDue = arrearsPastDue;
	}

	public BigDecimal getBlockedAmt() {
		return this.blockedAmt;
	}

	public void setBlockedAmt(BigDecimal blockedAmt) {
		this.blockedAmt = blockedAmt;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getCenterCode() {
		return this.centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public BigDecimal getCreditIntRate() {
		return this.creditIntRate;
	}

	public void setCreditIntRate(BigDecimal creditIntRate) {
		this.creditIntRate = creditIntRate;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public BigDecimal getDaysPastDue() {
		return this.daysPastDue;
	}

	public void setDaysPastDue(BigDecimal daysPastDue) {
		this.daysPastDue = daysPastDue;
	}

	public String getDealNumber() {
		return this.dealNumber;
	}

	public void setDealNumber(String dealNumber) {
		this.dealNumber = dealNumber;
	}

	public BigDecimal getDebitIntRate() {
		return this.debitIntRate;
	}

	public void setDebitIntRate(BigDecimal debitIntRate) {
		this.debitIntRate = debitIntRate;
	}

	public String getDrCr() {
		return this.drCr;
	}

	public void setDrCr(String drCr) {
		this.drCr = drCr;
	}

	public BigDecimal getFeesPastDue() {
		return this.feesPastDue;
	}

	public void setFeesPastDue(BigDecimal feesPastDue) {
		this.feesPastDue = feesPastDue;
	}

	public BigDecimal getFullTermDays() {
		return this.fullTermDays;
	}

	public void setFullTermDays(BigDecimal fullTermDays) {
		this.fullTermDays = fullTermDays;
	}

	public String getGlCode() {
		return this.glCode;
	}

	public void setGlCode(String glCode) {
		this.glCode = glCode;
	}

	public BigDecimal getGuaranteeAmt() {
		return this.guaranteeAmt;
	}

	public void setGuaranteeAmt(BigDecimal guaranteeAmt) {
		this.guaranteeAmt = guaranteeAmt;
	}

	public String getGuaranteeType() {
		return this.guaranteeType;
	}

	public void setGuaranteeType(String guaranteeType) {
		this.guaranteeType = guaranteeType;
	}

	public BigDecimal getIntPastDue() {
		return this.intPastDue;
	}

	public void setIntPastDue(BigDecimal intPastDue) {
		this.intPastDue = intPastDue;
	}

	public Date getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public BigDecimal getPenaltyPastDue() {
		return this.penaltyPastDue;
	}

	public void setPenaltyPastDue(BigDecimal penaltyPastDue) {
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

	public BigDecimal getRemainTermDays() {
		return this.remainTermDays;
	}

	public void setRemainTermDays(BigDecimal remainTermDays) {
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

	public BigDecimal getSuspendedInterst() {
		return this.suspendedInterst;
	}

	public void setSuspendedInterst(BigDecimal suspendedInterst) {
		this.suspendedInterst = suspendedInterst;
	}

	public String getSystemName() {
		return this.systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

}