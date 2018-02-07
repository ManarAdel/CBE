package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the BONDS_MTM_TEMP database table.
 * 
 */
@Entity
@Table(name="BONDS_MTM_TEMP")
@NamedQuery(name="BondsMtmTemp.findAll", query="SELECT b FROM BondsMtmTemp b")
public class BondsMtmTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCURED_AMOUNT")
	private String accuredAmount;

	private String amount;

	@Column(name="BOND_NAME")
	private String bondName;

	@Column(name="BOOK_VALUE")
	private String bookValue;

	private String busdate;

	@Column(name="CLEAN_PRICE")
	private String cleanPrice;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Column(name="DEAL_DATE")
	private String dealDate;

	@Column(name="F_V")
	private String fV;

	@Column(name="ISSUE_DATE")
	private String issueDate;

	@Column(name="MARKET_PRICE")
	private String marketPrice;

	@Column(name="MARKET_VALUE")
	private String marketValue;

	@Column(name="MAT_DATE")
	private String matDate;

	private String mtm;

	@Column(name="NEXT_COUPON")
	private String nextCoupon;

	@Column(name="NO_OF_BONDA")
	private String noOfBonda;

	@Column(name="PREMIUM_AMORTIZED")
	private String premiumAmortized;

	@Column(name="PREMIUM_AMOUNT")
	private String premiumAmount;

	private String price1;

	private String price2;

	@Column(name="PURCHASE_VALUE")
	private String purchaseValue;

	private String purpose;

	private String rate;

	@Column(name="SETT_AMOUNT")
	private String settAmount;

	public BondsMtmTemp() {
	}

	public String getAccuredAmount() {
		return this.accuredAmount;
	}

	public void setAccuredAmount(String accuredAmount) {
		this.accuredAmount = accuredAmount;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBondName() {
		return this.bondName;
	}

	public void setBondName(String bondName) {
		this.bondName = bondName;
	}

	public String getBookValue() {
		return this.bookValue;
	}

	public void setBookValue(String bookValue) {
		this.bookValue = bookValue;
	}

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
		this.busdate = busdate;
	}

	public String getCleanPrice() {
		return this.cleanPrice;
	}

	public void setCleanPrice(String cleanPrice) {
		this.cleanPrice = cleanPrice;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getDealDate() {
		return this.dealDate;
	}

	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}

	public String getFV() {
		return this.fV;
	}

	public void setFV(String fV) {
		this.fV = fV;
	}

	public String getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getMarketPrice() {
		return this.marketPrice;
	}

	public void setMarketPrice(String marketPrice) {
		this.marketPrice = marketPrice;
	}

	public String getMarketValue() {
		return this.marketValue;
	}

	public void setMarketValue(String marketValue) {
		this.marketValue = marketValue;
	}

	public String getMatDate() {
		return this.matDate;
	}

	public void setMatDate(String matDate) {
		this.matDate = matDate;
	}

	public String getMtm() {
		return this.mtm;
	}

	public void setMtm(String mtm) {
		this.mtm = mtm;
	}

	public String getNextCoupon() {
		return this.nextCoupon;
	}

	public void setNextCoupon(String nextCoupon) {
		this.nextCoupon = nextCoupon;
	}

	public String getNoOfBonda() {
		return this.noOfBonda;
	}

	public void setNoOfBonda(String noOfBonda) {
		this.noOfBonda = noOfBonda;
	}

	public String getPremiumAmortized() {
		return this.premiumAmortized;
	}

	public void setPremiumAmortized(String premiumAmortized) {
		this.premiumAmortized = premiumAmortized;
	}

	public String getPremiumAmount() {
		return this.premiumAmount;
	}

	public void setPremiumAmount(String premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public String getPrice1() {
		return this.price1;
	}

	public void setPrice1(String price1) {
		this.price1 = price1;
	}

	public String getPrice2() {
		return this.price2;
	}

	public void setPrice2(String price2) {
		this.price2 = price2;
	}

	public String getPurchaseValue() {
		return this.purchaseValue;
	}

	public void setPurchaseValue(String purchaseValue) {
		this.purchaseValue = purchaseValue;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getRate() {
		return this.rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getSettAmount() {
		return this.settAmount;
	}

	public void setSettAmount(String settAmount) {
		this.settAmount = settAmount;
	}

}