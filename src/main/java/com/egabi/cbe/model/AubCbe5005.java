package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the AUB_CBE_5005 database table.
 * 
 */
@Entity
@Table(name="AUB_CBE_5005")
@NamedQuery(name="AubCbe5005.findAll", query="SELECT a FROM AubCbe5005 a")
public class AubCbe5005 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private String ccy;

	private String client;

	@Column(name="CORP_RE")
	private String corpRe;

	private String good;

	@Column(name="HELD_AMOUNT")
	private BigDecimal heldAmount;

	@Column(name="IDC_REFRENCE")
	private String idcRefrence;

	@Column(name="IMP_CASH_FACILITY")
	private BigDecimal impCashFacility;

	private String maturity;

	@Column(name="NET_AMT_AFTER_HOLD")
	private BigDecimal netAmtAfterHold;

	private BigDecimal rate;

	@Column(name="REM_IDC_AMT_USD_EQ")
	private BigDecimal remIdcAmtUsdEq;

	@Column(name="REMAINING_IDC_AMOUNT_TI")
	private BigDecimal remainingIdcAmountTi;

	public AubCbe5005() {
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getCorpRe() {
		return this.corpRe;
	}

	public void setCorpRe(String corpRe) {
		this.corpRe = corpRe;
	}

	public String getGood() {
		return this.good;
	}

	public void setGood(String good) {
		this.good = good;
	}

	public BigDecimal getHeldAmount() {
		return this.heldAmount;
	}

	public void setHeldAmount(BigDecimal heldAmount) {
		this.heldAmount = heldAmount;
	}

	public String getIdcRefrence() {
		return this.idcRefrence;
	}

	public void setIdcRefrence(String idcRefrence) {
		this.idcRefrence = idcRefrence;
	}

	public BigDecimal getImpCashFacility() {
		return this.impCashFacility;
	}

	public void setImpCashFacility(BigDecimal impCashFacility) {
		this.impCashFacility = impCashFacility;
	}

	public String getMaturity() {
		return this.maturity;
	}

	public void setMaturity(String maturity) {
		this.maturity = maturity;
	}

	public BigDecimal getNetAmtAfterHold() {
		return this.netAmtAfterHold;
	}

	public void setNetAmtAfterHold(BigDecimal netAmtAfterHold) {
		this.netAmtAfterHold = netAmtAfterHold;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public BigDecimal getRemIdcAmtUsdEq() {
		return this.remIdcAmtUsdEq;
	}

	public void setRemIdcAmtUsdEq(BigDecimal remIdcAmtUsdEq) {
		this.remIdcAmtUsdEq = remIdcAmtUsdEq;
	}

	public BigDecimal getRemainingIdcAmountTi() {
		return this.remainingIdcAmountTi;
	}

	public void setRemainingIdcAmountTi(BigDecimal remainingIdcAmountTi) {
		this.remainingIdcAmountTi = remainingIdcAmountTi;
	}

}