package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the AUB_BASE_TABLE_OLD1 database table.
 * 
 */
@Entity
@Table(name="AUB_BASE_TABLE_OLD1")
@NamedQuery(name="AubBaseTableOld1.findAll", query="SELECT a FROM AubBaseTableOld1 a")
public class AubBaseTableOld1 implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	

	@Column(name="A_C")
	private BigDecimal aC;

	private BigDecimal alloc;

	private BigDecimal amount;

	@Column(name="AMOUNT_IN_USD")
	private BigDecimal amountInUsd;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private BigDecimal canceled;

	private BigDecimal category;

	private BigDecimal cbe;

	private String ccy;

	@Column(name="CLIENT_NAME")
	private String clientName;

	@Column(name="CORPORATE_RETAIL")
	private String corporateRetail;

	private BigDecimal decrease;

	@Column(name="IDC_KIND")
	private String idcKind;

	@Column(name="IDC_REFRENCE")
	private String idcRefrence;

	private BigDecimal increase;

	@Column(name="INTER_BANK")
	private BigDecimal interBank;

	private String maturity;

	private BigDecimal rate;

	@Column(name="TYPE_OF_GOOD")
	private String typeOfGood;

	public AubBaseTableOld1() {
	}

	public BigDecimal getAC() {
		return this.aC;
	}

	public void setAC(BigDecimal aC) {
		this.aC = aC;
	}

	public BigDecimal getAlloc() {
		return this.alloc;
	}

	public void setAlloc(BigDecimal alloc) {
		this.alloc = alloc;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAmountInUsd() {
		return this.amountInUsd;
	}

	public void setAmountInUsd(BigDecimal amountInUsd) {
		this.amountInUsd = amountInUsd;
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public BigDecimal getCanceled() {
		return this.canceled;
	}

	public void setCanceled(BigDecimal canceled) {
		this.canceled = canceled;
	}

	public BigDecimal getCategory() {
		return this.category;
	}

	public void setCategory(BigDecimal category) {
		this.category = category;
	}

	public BigDecimal getCbe() {
		return this.cbe;
	}

	public void setCbe(BigDecimal cbe) {
		this.cbe = cbe;
	}

	public String getCcy() {
		return this.ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getCorporateRetail() {
		return this.corporateRetail;
	}

	public void setCorporateRetail(String corporateRetail) {
		this.corporateRetail = corporateRetail;
	}

	public BigDecimal getDecrease() {
		return this.decrease;
	}

	public void setDecrease(BigDecimal decrease) {
		this.decrease = decrease;
	}

	public String getIdcKind() {
		return this.idcKind;
	}

	public void setIdcKind(String idcKind) {
		this.idcKind = idcKind;
	}

	public String getIdcRefrence() {
		return this.idcRefrence;
	}

	public void setIdcRefrence(String idcRefrence) {
		this.idcRefrence = idcRefrence;
	}

	public BigDecimal getIncrease() {
		return this.increase;
	}

	public void setIncrease(BigDecimal increase) {
		this.increase = increase;
	}

	public BigDecimal getInterBank() {
		return this.interBank;
	}

	public void setInterBank(BigDecimal interBank) {
		this.interBank = interBank;
	}

	public String getMaturity() {
		return this.maturity;
	}

	public void setMaturity(String maturity) {
		this.maturity = maturity;
	}

	public BigDecimal getRate() {
		return this.rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	public String getTypeOfGood() {
		return this.typeOfGood;
	}

	public void setTypeOfGood(String typeOfGood) {
		this.typeOfGood = typeOfGood;
	}

}