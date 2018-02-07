package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBR_CREDIT_RISK database table.
 * 
 */
@Entity
@Table(name="CBR_CREDIT_RISK")
@NamedQuery(name="CbrCreditRisk.findAll", query="SELECT c FROM CbrCreditRisk c")
public class CbrCreditRisk implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrCreditRiskPK id;

	@Column(name="BBG_ORR")
	private BigDecimal bbgOrr;

	@Column(name="CBE_BRANCH_CODE")
	private BigDecimal cbeBranchCode;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Column(name="CRITERIA_FLAG")
	private BigDecimal criteriaFlag;

	@Column(name="CUST_CBE_CODE")
	private BigDecimal custCbeCode;

	@Column(name="CUSTOMER_NAME_A")
	private String customerNameA;

	@Column(name="CUSTOMER_NAME_E")
	private String customerNameE;

	@Column(name="CUSTOMER_TYPE")
	private String customerType;

	@Column(name="FORFEITING_BAL")
	private BigDecimal forfeitingBal;

	@Column(name="FORFEITING_LIMIT")
	private BigDecimal forfeitingLimit;

	@Column(name="GUARAN_BAL")
	private BigDecimal guaranBal;

	@Column(name="GUARAN_LIMIT")
	private BigDecimal guaranLimit;

	@Column(name="GUARANTEED_CUST_CODE")
	private String guaranteedCustCode;

	@Column(name="INT_RECEIV_BAL")
	private BigDecimal intReceivBal;

	@Column(name="INT_RECEIV_LIMIT")
	private BigDecimal intReceivLimit;

	@Column(name="LANDING_PAY_FLAG")
	private BigDecimal landingPayFlag;

	@Column(name="LC_BAL")
	private BigDecimal lcBal;

	@Column(name="LC_LIMIT")
	private BigDecimal lcLimit;

	@Column(name="LG_BAL")
	private BigDecimal lgBal;

	@Column(name="LG_LIMIT")
	private BigDecimal lgLimit;

	@Column(name="ORR_RESERVE_AMOUNT")
	private BigDecimal orrReserveAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="ORR_RESERVE_DATE")
	private Date orrReserveDate;

	@Column(name="SEC_BCH_BAL")
	private BigDecimal secBchBal;

	@Column(name="SEC_BCH_LIMIT")
	private BigDecimal secBchLimit;

	@Column(name="SEC_CORPS_BAL")
	private BigDecimal secCorpsBal;

	@Column(name="SEC_CORPS_LIMIT")
	private BigDecimal secCorpsLimit;

	@Column(name="SEC_FACILITIES_BAL")
	private BigDecimal secFacilitiesBal;

	@Column(name="SEC_FACILITIES_LIMIT")
	private BigDecimal secFacilitiesLimit;

	@Column(name="SEC_FOND_BAL")
	private BigDecimal secFondBal;

	@Column(name="SEC_FOND_LIMIT")
	private BigDecimal secFondLimit;

	@Column(name="SEC_LEG_MORTG_BAL")
	private BigDecimal secLegMortgBal;

	@Column(name="SEC_LEG_MORTG_LIMIT")
	private BigDecimal secLegMortgLimit;

	@Column(name="SEC_PLEDGE_BAL")
	private BigDecimal secPledgeBal;

	@Column(name="SEC_PLEDGE_LIMIT")
	private BigDecimal secPledgeLimit;

	@Column(name="SEC_TREASURY_BAL")
	private BigDecimal secTreasuryBal;

	@Column(name="SEC_TREASURY_LIMIT")
	private BigDecimal secTreasuryLimit;

	@Column(name="TOTAL_BAL")
	private BigDecimal totalBal;

	@Column(name="TOTAL_LIMIT")
	private BigDecimal totalLimit;

	@Column(name="UNMAPPED_BAL")
	private BigDecimal unmappedBal;

	@Column(name="UNMAPPED_LIMIT")
	private BigDecimal unmappedLimit;

	@Column(name="UNSECURED_FAC_BAL")
	private BigDecimal unsecuredFacBal;

	@Column(name="UNSECURED_FAC_LIMIT")
	private BigDecimal unsecuredFacLimit;

	public CbrCreditRisk() {
	}

	public CbrCreditRiskPK getId() {
		return this.id;
	}

	public void setId(CbrCreditRiskPK id) {
		this.id = id;
	}

	public BigDecimal getBbgOrr() {
		return this.bbgOrr;
	}

	public void setBbgOrr(BigDecimal bbgOrr) {
		this.bbgOrr = bbgOrr;
	}

	public BigDecimal getCbeBranchCode() {
		return this.cbeBranchCode;
	}

	public void setCbeBranchCode(BigDecimal cbeBranchCode) {
		this.cbeBranchCode = cbeBranchCode;
	}

	public String getCenterCode() {
		return this.centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public BigDecimal getCriteriaFlag() {
		return this.criteriaFlag;
	}

	public void setCriteriaFlag(BigDecimal criteriaFlag) {
		this.criteriaFlag = criteriaFlag;
	}

	public BigDecimal getCustCbeCode() {
		return this.custCbeCode;
	}

	public void setCustCbeCode(BigDecimal custCbeCode) {
		this.custCbeCode = custCbeCode;
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

	public String getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public BigDecimal getForfeitingBal() {
		return this.forfeitingBal;
	}

	public void setForfeitingBal(BigDecimal forfeitingBal) {
		this.forfeitingBal = forfeitingBal;
	}

	public BigDecimal getForfeitingLimit() {
		return this.forfeitingLimit;
	}

	public void setForfeitingLimit(BigDecimal forfeitingLimit) {
		this.forfeitingLimit = forfeitingLimit;
	}

	public BigDecimal getGuaranBal() {
		return this.guaranBal;
	}

	public void setGuaranBal(BigDecimal guaranBal) {
		this.guaranBal = guaranBal;
	}

	public BigDecimal getGuaranLimit() {
		return this.guaranLimit;
	}

	public void setGuaranLimit(BigDecimal guaranLimit) {
		this.guaranLimit = guaranLimit;
	}

	public String getGuaranteedCustCode() {
		return this.guaranteedCustCode;
	}

	public void setGuaranteedCustCode(String guaranteedCustCode) {
		this.guaranteedCustCode = guaranteedCustCode;
	}

	public BigDecimal getIntReceivBal() {
		return this.intReceivBal;
	}

	public void setIntReceivBal(BigDecimal intReceivBal) {
		this.intReceivBal = intReceivBal;
	}

	public BigDecimal getIntReceivLimit() {
		return this.intReceivLimit;
	}

	public void setIntReceivLimit(BigDecimal intReceivLimit) {
		this.intReceivLimit = intReceivLimit;
	}

	public BigDecimal getLandingPayFlag() {
		return this.landingPayFlag;
	}

	public void setLandingPayFlag(BigDecimal landingPayFlag) {
		this.landingPayFlag = landingPayFlag;
	}

	public BigDecimal getLcBal() {
		return this.lcBal;
	}

	public void setLcBal(BigDecimal lcBal) {
		this.lcBal = lcBal;
	}

	public BigDecimal getLcLimit() {
		return this.lcLimit;
	}

	public void setLcLimit(BigDecimal lcLimit) {
		this.lcLimit = lcLimit;
	}

	public BigDecimal getLgBal() {
		return this.lgBal;
	}

	public void setLgBal(BigDecimal lgBal) {
		this.lgBal = lgBal;
	}

	public BigDecimal getLgLimit() {
		return this.lgLimit;
	}

	public void setLgLimit(BigDecimal lgLimit) {
		this.lgLimit = lgLimit;
	}

	public BigDecimal getOrrReserveAmount() {
		return this.orrReserveAmount;
	}

	public void setOrrReserveAmount(BigDecimal orrReserveAmount) {
		this.orrReserveAmount = orrReserveAmount;
	}

	public Date getOrrReserveDate() {
		return this.orrReserveDate;
	}

	public void setOrrReserveDate(Date orrReserveDate) {
		this.orrReserveDate = orrReserveDate;
	}

	public BigDecimal getSecBchBal() {
		return this.secBchBal;
	}

	public void setSecBchBal(BigDecimal secBchBal) {
		this.secBchBal = secBchBal;
	}

	public BigDecimal getSecBchLimit() {
		return this.secBchLimit;
	}

	public void setSecBchLimit(BigDecimal secBchLimit) {
		this.secBchLimit = secBchLimit;
	}

	public BigDecimal getSecCorpsBal() {
		return this.secCorpsBal;
	}

	public void setSecCorpsBal(BigDecimal secCorpsBal) {
		this.secCorpsBal = secCorpsBal;
	}

	public BigDecimal getSecCorpsLimit() {
		return this.secCorpsLimit;
	}

	public void setSecCorpsLimit(BigDecimal secCorpsLimit) {
		this.secCorpsLimit = secCorpsLimit;
	}

	public BigDecimal getSecFacilitiesBal() {
		return this.secFacilitiesBal;
	}

	public void setSecFacilitiesBal(BigDecimal secFacilitiesBal) {
		this.secFacilitiesBal = secFacilitiesBal;
	}

	public BigDecimal getSecFacilitiesLimit() {
		return this.secFacilitiesLimit;
	}

	public void setSecFacilitiesLimit(BigDecimal secFacilitiesLimit) {
		this.secFacilitiesLimit = secFacilitiesLimit;
	}

	public BigDecimal getSecFondBal() {
		return this.secFondBal;
	}

	public void setSecFondBal(BigDecimal secFondBal) {
		this.secFondBal = secFondBal;
	}

	public BigDecimal getSecFondLimit() {
		return this.secFondLimit;
	}

	public void setSecFondLimit(BigDecimal secFondLimit) {
		this.secFondLimit = secFondLimit;
	}

	public BigDecimal getSecLegMortgBal() {
		return this.secLegMortgBal;
	}

	public void setSecLegMortgBal(BigDecimal secLegMortgBal) {
		this.secLegMortgBal = secLegMortgBal;
	}

	public BigDecimal getSecLegMortgLimit() {
		return this.secLegMortgLimit;
	}

	public void setSecLegMortgLimit(BigDecimal secLegMortgLimit) {
		this.secLegMortgLimit = secLegMortgLimit;
	}

	public BigDecimal getSecPledgeBal() {
		return this.secPledgeBal;
	}

	public void setSecPledgeBal(BigDecimal secPledgeBal) {
		this.secPledgeBal = secPledgeBal;
	}

	public BigDecimal getSecPledgeLimit() {
		return this.secPledgeLimit;
	}

	public void setSecPledgeLimit(BigDecimal secPledgeLimit) {
		this.secPledgeLimit = secPledgeLimit;
	}

	public BigDecimal getSecTreasuryBal() {
		return this.secTreasuryBal;
	}

	public void setSecTreasuryBal(BigDecimal secTreasuryBal) {
		this.secTreasuryBal = secTreasuryBal;
	}

	public BigDecimal getSecTreasuryLimit() {
		return this.secTreasuryLimit;
	}

	public void setSecTreasuryLimit(BigDecimal secTreasuryLimit) {
		this.secTreasuryLimit = secTreasuryLimit;
	}

	public BigDecimal getTotalBal() {
		return this.totalBal;
	}

	public void setTotalBal(BigDecimal totalBal) {
		this.totalBal = totalBal;
	}

	public BigDecimal getTotalLimit() {
		return this.totalLimit;
	}

	public void setTotalLimit(BigDecimal totalLimit) {
		this.totalLimit = totalLimit;
	}

	public BigDecimal getUnmappedBal() {
		return this.unmappedBal;
	}

	public void setUnmappedBal(BigDecimal unmappedBal) {
		this.unmappedBal = unmappedBal;
	}

	public BigDecimal getUnmappedLimit() {
		return this.unmappedLimit;
	}

	public void setUnmappedLimit(BigDecimal unmappedLimit) {
		this.unmappedLimit = unmappedLimit;
	}

	public BigDecimal getUnsecuredFacBal() {
		return this.unsecuredFacBal;
	}

	public void setUnsecuredFacBal(BigDecimal unsecuredFacBal) {
		this.unsecuredFacBal = unsecuredFacBal;
	}

	public BigDecimal getUnsecuredFacLimit() {
		return this.unsecuredFacLimit;
	}

	public void setUnsecuredFacLimit(BigDecimal unsecuredFacLimit) {
		this.unsecuredFacLimit = unsecuredFacLimit;
	}

}