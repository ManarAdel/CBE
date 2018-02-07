package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CORPORATE_FILE_TABLE database table.
 * 
 */
@Entity
@Table(name="CORPORATE_FILE_TABLE")
@NamedQuery(name="CorporateFileTable.findAll", query="SELECT c FROM CorporateFileTable c")
public class CorporateFileTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CASH_FLOW")
	private String cashFlow;

	@Column(name="CUST_FLAG")
	private BigDecimal custFlag;

	@Column(name="CUSTOMER_ID")
	private String customerId;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	@Column(name="DEFAULT_PERC_")
	private BigDecimal defaultPerc;

	@Column(name="DIRECT_BG")
	private BigDecimal directBg;

	@Column(name="DIRECT_CASH_COLLATERAL")
	private BigDecimal directCashCollateral;

	@Column(name="DIRECT_FC")
	private BigDecimal directFc;

	@Column(name="DIRECT_LM")
	private BigDecimal directLm;

	@Column(name="DIRECT_PRODUCT_TYPE")
	private String directProductType;

	@Column(name="DIRECT_STOCKS")
	private BigDecimal directStocks;

	@Column(name="DIRECT_TB")
	private BigDecimal directTb;

	@Column(name="FCY_DIRECT_EXPOSURES")
	private BigDecimal fcyDirectExposures;

	@Column(name="FCY_DIRECT_PROVISION")
	private BigDecimal fcyDirectProvision;

	@Column(name="FCY_INDIRECT_PROVISION")
	private BigDecimal fcyIndirectProvision;

	@Column(name="FCY_INTEREST_IN_SUSPENSE")
	private BigDecimal fcyInterestInSuspense;

	@Column(name="FCY_NET_INDIRECT_EXPOSURES")
	private BigDecimal fcyNetIndirectExposures;

	private BigDecimal impairment;

	@Column(name="IMPAIRMENT_SEGMENT")
	private String impairmentSegment;

	@Column(name="INDIRECT_BG")
	private BigDecimal indirectBg;

	@Column(name="INDIRECT_FC")
	private BigDecimal indirectFc;

	@Column(name="INDIRECT_LM")
	private BigDecimal indirectLm;

	@Column(name="INDIRECT_STOCKS")
	private BigDecimal indirectStocks;

	@Column(name="LCY_DIRECT_EXPOSURES")
	private BigDecimal lcyDirectExposures;

	@Column(name="LCY_DIRECT_PROVISION")
	private BigDecimal lcyDirectProvision;

	@Column(name="LCY_INDIRECT_PROVISION")
	private BigDecimal lcyIndirectProvision;

	@Column(name="LCY_INTEREST_IN_SUSPENSE")
	private BigDecimal lcyInterestInSuspense;

	@Column(name="LCY_NET_INDIRECT_EXPOSURES")
	private BigDecimal lcyNetIndirectExposures;

	@Column(name="LIVE_DRU")
	private String liveDru;

	private BigDecimal orr;

	private BigDecimal pastdue;

	@Column(name="PROVISION_SEGMENT")
	private String provisionSegment;

	private BigDecimal smi;

	public CorporateFileTable() {
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public String getCashFlow() {
		return this.cashFlow;
	}

	public void setCashFlow(String cashFlow) {
		this.cashFlow = cashFlow;
	}

	public BigDecimal getCustFlag() {
		return this.custFlag;
	}

	public void setCustFlag(BigDecimal custFlag) {
		this.custFlag = custFlag;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public BigDecimal getDefaultPerc() {
		return this.defaultPerc;
	}

	public void setDefaultPerc(BigDecimal defaultPerc) {
		this.defaultPerc = defaultPerc;
	}

	public BigDecimal getDirectBg() {
		return this.directBg;
	}

	public void setDirectBg(BigDecimal directBg) {
		this.directBg = directBg;
	}

	public BigDecimal getDirectCashCollateral() {
		return this.directCashCollateral;
	}

	public void setDirectCashCollateral(BigDecimal directCashCollateral) {
		this.directCashCollateral = directCashCollateral;
	}

	public BigDecimal getDirectFc() {
		return this.directFc;
	}

	public void setDirectFc(BigDecimal directFc) {
		this.directFc = directFc;
	}

	public BigDecimal getDirectLm() {
		return this.directLm;
	}

	public void setDirectLm(BigDecimal directLm) {
		this.directLm = directLm;
	}

	public String getDirectProductType() {
		return this.directProductType;
	}

	public void setDirectProductType(String directProductType) {
		this.directProductType = directProductType;
	}

	public BigDecimal getDirectStocks() {
		return this.directStocks;
	}

	public void setDirectStocks(BigDecimal directStocks) {
		this.directStocks = directStocks;
	}

	public BigDecimal getDirectTb() {
		return this.directTb;
	}

	public void setDirectTb(BigDecimal directTb) {
		this.directTb = directTb;
	}

	public BigDecimal getFcyDirectExposures() {
		return this.fcyDirectExposures;
	}

	public void setFcyDirectExposures(BigDecimal fcyDirectExposures) {
		this.fcyDirectExposures = fcyDirectExposures;
	}

	public BigDecimal getFcyDirectProvision() {
		return this.fcyDirectProvision;
	}

	public void setFcyDirectProvision(BigDecimal fcyDirectProvision) {
		this.fcyDirectProvision = fcyDirectProvision;
	}

	public BigDecimal getFcyIndirectProvision() {
		return this.fcyIndirectProvision;
	}

	public void setFcyIndirectProvision(BigDecimal fcyIndirectProvision) {
		this.fcyIndirectProvision = fcyIndirectProvision;
	}

	public BigDecimal getFcyInterestInSuspense() {
		return this.fcyInterestInSuspense;
	}

	public void setFcyInterestInSuspense(BigDecimal fcyInterestInSuspense) {
		this.fcyInterestInSuspense = fcyInterestInSuspense;
	}

	public BigDecimal getFcyNetIndirectExposures() {
		return this.fcyNetIndirectExposures;
	}

	public void setFcyNetIndirectExposures(BigDecimal fcyNetIndirectExposures) {
		this.fcyNetIndirectExposures = fcyNetIndirectExposures;
	}

	public BigDecimal getImpairment() {
		return this.impairment;
	}

	public void setImpairment(BigDecimal impairment) {
		this.impairment = impairment;
	}

	public String getImpairmentSegment() {
		return this.impairmentSegment;
	}

	public void setImpairmentSegment(String impairmentSegment) {
		this.impairmentSegment = impairmentSegment;
	}

	public BigDecimal getIndirectBg() {
		return this.indirectBg;
	}

	public void setIndirectBg(BigDecimal indirectBg) {
		this.indirectBg = indirectBg;
	}

	public BigDecimal getIndirectFc() {
		return this.indirectFc;
	}

	public void setIndirectFc(BigDecimal indirectFc) {
		this.indirectFc = indirectFc;
	}

	public BigDecimal getIndirectLm() {
		return this.indirectLm;
	}

	public void setIndirectLm(BigDecimal indirectLm) {
		this.indirectLm = indirectLm;
	}

	public BigDecimal getIndirectStocks() {
		return this.indirectStocks;
	}

	public void setIndirectStocks(BigDecimal indirectStocks) {
		this.indirectStocks = indirectStocks;
	}

	public BigDecimal getLcyDirectExposures() {
		return this.lcyDirectExposures;
	}

	public void setLcyDirectExposures(BigDecimal lcyDirectExposures) {
		this.lcyDirectExposures = lcyDirectExposures;
	}

	public BigDecimal getLcyDirectProvision() {
		return this.lcyDirectProvision;
	}

	public void setLcyDirectProvision(BigDecimal lcyDirectProvision) {
		this.lcyDirectProvision = lcyDirectProvision;
	}

	public BigDecimal getLcyIndirectProvision() {
		return this.lcyIndirectProvision;
	}

	public void setLcyIndirectProvision(BigDecimal lcyIndirectProvision) {
		this.lcyIndirectProvision = lcyIndirectProvision;
	}

	public BigDecimal getLcyInterestInSuspense() {
		return this.lcyInterestInSuspense;
	}

	public void setLcyInterestInSuspense(BigDecimal lcyInterestInSuspense) {
		this.lcyInterestInSuspense = lcyInterestInSuspense;
	}

	public BigDecimal getLcyNetIndirectExposures() {
		return this.lcyNetIndirectExposures;
	}

	public void setLcyNetIndirectExposures(BigDecimal lcyNetIndirectExposures) {
		this.lcyNetIndirectExposures = lcyNetIndirectExposures;
	}

	public String getLiveDru() {
		return this.liveDru;
	}

	public void setLiveDru(String liveDru) {
		this.liveDru = liveDru;
	}

	public BigDecimal getOrr() {
		return this.orr;
	}

	public void setOrr(BigDecimal orr) {
		this.orr = orr;
	}

	public BigDecimal getPastdue() {
		return this.pastdue;
	}

	public void setPastdue(BigDecimal pastdue) {
		this.pastdue = pastdue;
	}

	public String getProvisionSegment() {
		return this.provisionSegment;
	}

	public void setProvisionSegment(String provisionSegment) {
		this.provisionSegment = provisionSegment;
	}

	public BigDecimal getSmi() {
		return this.smi;
	}

	public void setSmi(BigDecimal smi) {
		this.smi = smi;
	}

}