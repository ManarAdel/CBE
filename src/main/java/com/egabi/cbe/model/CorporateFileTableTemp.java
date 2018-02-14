package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CORPORATE_FILE_TABLE_TEMP database table.
 * 
 */
@Entity
@Table(name="CORPORATE_FILE_TABLE_TEMP")
@NamedQuery(name="CorporateFileTableTemp.findAll", query="SELECT c FROM CorporateFileTableTemp c")
public class CorporateFileTableTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	
		//This Table Doesn't have A PK 
		//Generated Id 
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;
		
	private String busdate;

	@Column(name="CASH_FLOW")
	private String cashFlow;

	@Column(name="CUST_FLAG")
	private String custFlag;

	@Column(name="CUSTOMER_ID")
	private String customerId;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	@Column(name="DEFAULT_PERC_")
	private String defaultPerc;

	@Column(name="DIRECT_BG")
	private String directBg;

	@Column(name="DIRECT_CASH_COLLATERAL")
	private String directCashCollateral;

	@Column(name="DIRECT_FC")
	private String directFc;

	@Column(name="DIRECT_LM")
	private String directLm;

	@Column(name="DIRECT_PRODUCT_TYPE")
	private String directProductType;

	@Column(name="DIRECT_STOCKS")
	private String directStocks;

	@Column(name="DIRECT_TB")
	private String directTb;

	@Column(name="FCY_DIRECT_EXPOSURES")
	private String fcyDirectExposures;

	@Column(name="FCY_DIRECT_PROVISION")
	private String fcyDirectProvision;

	@Column(name="FCY_INDIRECT_PROVISION")
	private String fcyIndirectProvision;

	@Column(name="FCY_INTEREST_IN_SUSPENSE")
	private String fcyInterestInSuspense;

	@Column(name="FCY_NET_INDIRECT_EXPOSURES")
	private String fcyNetIndirectExposures;

	private String impairment;

	@Column(name="IMPAIRMENT_SEGMENT")
	private String impairmentSegment;

	@Column(name="INDIRECT_BG")
	private String indirectBg;

	@Column(name="INDIRECT_FC")
	private String indirectFc;

	@Column(name="INDIRECT_LM")
	private String indirectLm;

	@Column(name="INDIRECT_STOCKS")
	private String indirectStocks;

	@Column(name="LCY_DIRECT_EXPOSURES")
	private String lcyDirectExposures;

	@Column(name="LCY_DIRECT_PROVISION")
	private String lcyDirectProvision;

	@Column(name="LCY_INDIRECT_PROVISION")
	private String lcyIndirectProvision;

	@Column(name="LCY_INTEREST_IN_SUSPENSE")
	private String lcyInterestInSuspense;

	@Column(name="LCY_NET_INDIRECT_EXPOSURES")
	private String lcyNetIndirectExposures;

	@Column(name="LIVE_DRU")
	private String liveDru;

	private String orr;

	private String pastdue;

	@Column(name="PROVISION_SEGMENT")
	private String provisionSegment;

	private String smi;

	public CorporateFileTableTemp() {
	}

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
		this.busdate = busdate;
	}

	public String getCashFlow() {
		return this.cashFlow;
	}

	public void setCashFlow(String cashFlow) {
		this.cashFlow = cashFlow;
	}

	public String getCustFlag() {
		return this.custFlag;
	}

	public void setCustFlag(String custFlag) {
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

	public String getDefaultPerc() {
		return this.defaultPerc;
	}

	public void setDefaultPerc(String defaultPerc) {
		this.defaultPerc = defaultPerc;
	}

	public String getDirectBg() {
		return this.directBg;
	}

	public void setDirectBg(String directBg) {
		this.directBg = directBg;
	}

	public String getDirectCashCollateral() {
		return this.directCashCollateral;
	}

	public void setDirectCashCollateral(String directCashCollateral) {
		this.directCashCollateral = directCashCollateral;
	}

	public String getDirectFc() {
		return this.directFc;
	}

	public void setDirectFc(String directFc) {
		this.directFc = directFc;
	}

	public String getDirectLm() {
		return this.directLm;
	}

	public void setDirectLm(String directLm) {
		this.directLm = directLm;
	}

	public String getDirectProductType() {
		return this.directProductType;
	}

	public void setDirectProductType(String directProductType) {
		this.directProductType = directProductType;
	}

	public String getDirectStocks() {
		return this.directStocks;
	}

	public void setDirectStocks(String directStocks) {
		this.directStocks = directStocks;
	}

	public String getDirectTb() {
		return this.directTb;
	}

	public void setDirectTb(String directTb) {
		this.directTb = directTb;
	}

	public String getFcyDirectExposures() {
		return this.fcyDirectExposures;
	}

	public void setFcyDirectExposures(String fcyDirectExposures) {
		this.fcyDirectExposures = fcyDirectExposures;
	}

	public String getFcyDirectProvision() {
		return this.fcyDirectProvision;
	}

	public void setFcyDirectProvision(String fcyDirectProvision) {
		this.fcyDirectProvision = fcyDirectProvision;
	}

	public String getFcyIndirectProvision() {
		return this.fcyIndirectProvision;
	}

	public void setFcyIndirectProvision(String fcyIndirectProvision) {
		this.fcyIndirectProvision = fcyIndirectProvision;
	}

	public String getFcyInterestInSuspense() {
		return this.fcyInterestInSuspense;
	}

	public void setFcyInterestInSuspense(String fcyInterestInSuspense) {
		this.fcyInterestInSuspense = fcyInterestInSuspense;
	}

	public String getFcyNetIndirectExposures() {
		return this.fcyNetIndirectExposures;
	}

	public void setFcyNetIndirectExposures(String fcyNetIndirectExposures) {
		this.fcyNetIndirectExposures = fcyNetIndirectExposures;
	}

	public String getImpairment() {
		return this.impairment;
	}

	public void setImpairment(String impairment) {
		this.impairment = impairment;
	}

	public String getImpairmentSegment() {
		return this.impairmentSegment;
	}

	public void setImpairmentSegment(String impairmentSegment) {
		this.impairmentSegment = impairmentSegment;
	}

	public String getIndirectBg() {
		return this.indirectBg;
	}

	public void setIndirectBg(String indirectBg) {
		this.indirectBg = indirectBg;
	}

	public String getIndirectFc() {
		return this.indirectFc;
	}

	public void setIndirectFc(String indirectFc) {
		this.indirectFc = indirectFc;
	}

	public String getIndirectLm() {
		return this.indirectLm;
	}

	public void setIndirectLm(String indirectLm) {
		this.indirectLm = indirectLm;
	}

	public String getIndirectStocks() {
		return this.indirectStocks;
	}

	public void setIndirectStocks(String indirectStocks) {
		this.indirectStocks = indirectStocks;
	}

	public String getLcyDirectExposures() {
		return this.lcyDirectExposures;
	}

	public void setLcyDirectExposures(String lcyDirectExposures) {
		this.lcyDirectExposures = lcyDirectExposures;
	}

	public String getLcyDirectProvision() {
		return this.lcyDirectProvision;
	}

	public void setLcyDirectProvision(String lcyDirectProvision) {
		this.lcyDirectProvision = lcyDirectProvision;
	}

	public String getLcyIndirectProvision() {
		return this.lcyIndirectProvision;
	}

	public void setLcyIndirectProvision(String lcyIndirectProvision) {
		this.lcyIndirectProvision = lcyIndirectProvision;
	}

	public String getLcyInterestInSuspense() {
		return this.lcyInterestInSuspense;
	}

	public void setLcyInterestInSuspense(String lcyInterestInSuspense) {
		this.lcyInterestInSuspense = lcyInterestInSuspense;
	}

	public String getLcyNetIndirectExposures() {
		return this.lcyNetIndirectExposures;
	}

	public void setLcyNetIndirectExposures(String lcyNetIndirectExposures) {
		this.lcyNetIndirectExposures = lcyNetIndirectExposures;
	}

	public String getLiveDru() {
		return this.liveDru;
	}

	public void setLiveDru(String liveDru) {
		this.liveDru = liveDru;
	}

	public String getOrr() {
		return this.orr;
	}

	public void setOrr(String orr) {
		this.orr = orr;
	}

	public String getPastdue() {
		return this.pastdue;
	}

	public void setPastdue(String pastdue) {
		this.pastdue = pastdue;
	}

	public String getProvisionSegment() {
		return this.provisionSegment;
	}

	public void setProvisionSegment(String provisionSegment) {
		this.provisionSegment = provisionSegment;
	}

	public String getSmi() {
		return this.smi;
	}

	public void setSmi(String smi) {
		this.smi = smi;
	}

}