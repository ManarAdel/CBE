package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the AUB_BASE_TABLE_V_OLD database table.
 * 
 */
@Entity
@Table(name="AUB_BASE_TABLE_V_OLD")
@NamedQuery(name="AubBaseTableVOld.findAll", query="SELECT a FROM AubBaseTableVOld a")
public class AubBaseTableVOld implements Serializable {
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

	@Column(name="AMT_CLASS")
	private String amtClass;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private String category;

	private BigDecimal cbe;

	private BigDecimal cnt;

	@Column(name="IDC_KIND")
	private String idcKind;

	@Column(name="INTER_BANK")
	private BigDecimal interBank;

	@Column(name="REM_AMT")
	private BigDecimal remAmt;

	@Column(name="TYPE_OF_GOOD")
	private String typeOfGood;

	public AubBaseTableVOld() {
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

	public String getAmtClass() {
		return this.amtClass;
	}

	public void setAmtClass(String amtClass) {
		this.amtClass = amtClass;
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getCbe() {
		return this.cbe;
	}

	public void setCbe(BigDecimal cbe) {
		this.cbe = cbe;
	}

	public BigDecimal getCnt() {
		return this.cnt;
	}

	public void setCnt(BigDecimal cnt) {
		this.cnt = cnt;
	}

	public String getIdcKind() {
		return this.idcKind;
	}

	public void setIdcKind(String idcKind) {
		this.idcKind = idcKind;
	}

	public BigDecimal getInterBank() {
		return this.interBank;
	}

	public void setInterBank(BigDecimal interBank) {
		this.interBank = interBank;
	}

	public BigDecimal getRemAmt() {
		return this.remAmt;
	}

	public void setRemAmt(BigDecimal remAmt) {
		this.remAmt = remAmt;
	}

	public String getTypeOfGood() {
		return this.typeOfGood;
	}

	public void setTypeOfGood(String typeOfGood) {
		this.typeOfGood = typeOfGood;
	}

}