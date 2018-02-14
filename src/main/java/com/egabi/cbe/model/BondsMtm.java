package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the BONDS_MTM database table.
 * 
 */
@Entity
@Table(name="BONDS_MTM")
@NamedQuery(name="BondsMtm.findAll", query="SELECT b FROM BondsMtm b")
public class BondsMtm implements Serializable {
	private static final long serialVersionUID = 1L;

	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	

	
	@Column(name="ACCURED_AMOUNT")
	private BigDecimal accuredAmount;

	private BigDecimal amount;

	@Column(name="BOND_NAME")
	private String bondName;

	@Column(name="BOOK_VALUE")
	private BigDecimal bookValue;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CLEAN_PRICE")
	private BigDecimal cleanPrice;

	@Column(name="CURRENCY_CODE")
	private String currencyCode;

	@Temporal(TemporalType.DATE)
	@Column(name="DEAL_DATE")
	private Date dealDate;

	@Column(name="F_V")
	private BigDecimal fV;

	@Temporal(TemporalType.DATE)
	@Column(name="ISSUE_DATE")
	private Date issueDate;

	@Column(name="MARKET_PRICE")
	private BigDecimal marketPrice;

	@Column(name="MARKET_VALUE")
	private BigDecimal marketValue;

	@Temporal(TemporalType.DATE)
	@Column(name="MAT_DATE")
	private Date matDate;

	private BigDecimal mtm;

	@Temporal(TemporalType.DATE)
	@Column(name="NEXT_COUPON")
	private Date nextCoupon;

	@Column(name="NO_OF_BONDA")
	private BigDecimal noOfBonda;

	@Column(name="PREMIUM_AMORTIZED")
	private BigDecimal premiumAmortized;

	@Column(name="PREMIUM_AMOUNT")
	private BigDecimal premiumAmount;

	private BigDecimal price1;

	private BigDecimal price2;

	@Column(name="PURCHASE_VALUE")
	private BigDecimal purchaseValue;

	private String purpose;

	private BigDecimal rate;

	@Column(name="SETT_AMOUNT")
	private BigDecimal settAmount;

	public BondsMtm() {
	}

	public BigDecimal getAccuredAmount() {
		return this.accuredAmount;
	}

	public void setAccuredAmount(BigDecimal accuredAmount) {
		this.accuredAmount = accuredAmount;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getBondName() {
		return this.bondName;
	}

	public void setBondName(String bondName) {
		this.bondName = bondName;
	}

	public BigDecimal getBookValue() {
		return this.bookValue;
	}

	public void setBookValue(BigDecimal bookValue) {
		this.bookValue = bookValue;
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public BigDecimal getCleanPrice() {
		return this.cleanPrice;
	}

	public void setCleanPrice(BigDecimal cleanPrice) {
		this.cleanPrice = cleanPrice;
	}

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public Date getDealDate() {
		return this.dealDate;
	}

	public void setDealDate(Date dealDate) {
		this.dealDate = dealDate;
	}

	public BigDecimal getFV() {
		return this.fV;
	}

	public void setFV(BigDecimal fV) {
		this.fV = fV;
	}

	public Date getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public BigDecimal getMarketPrice() {
		return this.marketPrice;
	}

	public void setMarketPrice(BigDecimal marketPrice) {
		this.marketPrice = marketPrice;
	}

	public BigDecimal getMarketValue() {
		return this.marketValue;
	}

	public void setMarketValue(BigDecimal marketValue) {
		this.marketValue = marketValue;
	}

	public Date getMatDate() {
		return this.matDate;
	}

	public void setMatDate(Date matDate) {
		this.matDate = matDate;
	}

	public BigDecimal getMtm() {
		return this.mtm;
	}

	public void setMtm(BigDecimal mtm) {
		this.mtm = mtm;
	}

	public Date getNextCoupon() {
		return this.nextCoupon;
	}

	public void setNextCoupon(Date nextCoupon) {
		this.nextCoupon = nextCoupon;
	}

	public BigDecimal getNoOfBonda() {
		return this.noOfBonda;
	}

	public void setNoOfBonda(BigDecimal noOfBonda) {
		this.noOfBonda = noOfBonda;
	}

	public BigDecimal getPremiumAmortized() {
		return this.premiumAmortized;
	}

	public void setPremiumAmortized(BigDecimal premiumAmortized) {
		this.premiumAmortized = premiumAmortized;
	}

	public BigDecimal getPremiumAmount() {
		return this.premiumAmount;
	}

	public void setPremiumAmount(BigDecimal premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public BigDecimal getPrice1() {
		return this.price1;
	}

	public void setPrice1(BigDecimal price1) {
		this.price1 = price1;
	}

	public BigDecimal getPrice2() {
		return this.price2;
	}

	public void setPrice2(BigDecimal price2) {
		this.price2 = price2;
	}

	public BigDecimal getPurchaseValue() {
		return this.purchaseValue;
	}

	public void setPurchaseValue(BigDecimal purchaseValue) {
		this.purchaseValue = purchaseValue;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public BigDecimal getSettAmount() {
		return this.settAmount;
	}

	public void setSettAmount(BigDecimal settAmount) {
		this.settAmount = settAmount;
	}

}