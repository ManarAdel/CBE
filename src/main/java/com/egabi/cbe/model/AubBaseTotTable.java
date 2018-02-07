package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the AUB_BASE_TOT_TABLE database table.
 * 
 */
@Entity
@Table(name="AUB_BASE_TOT_TABLE")
@NamedQuery(name="AubBaseTotTable.findAll", query="SELECT a FROM AubBaseTotTable a")
public class AubBaseTotTable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="A_C")
	private BigDecimal aC;

	@Column(name="ALLC_CNT")
	private BigDecimal allcCnt;

	private BigDecimal alloc;

	@Column(name="AMOUNT_IN_USD")
	private BigDecimal amountInUsd;

	@Column(name="AMT_CLASS")
	private String amtClass;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CANCELED_CNT")
	private BigDecimal canceledCnt;

	private BigDecimal category;

	private BigDecimal cbe;

	@Column(name="CLIENT_NAME")
	private String clientName;

	private BigDecimal decrease;

	private BigDecimal increase;

	@Column(name="INTER_BANK")
	private BigDecimal interBank;

	@Column(name="NEW_CNT")
	private BigDecimal newCnt;

	@Column(name="NEW_REQ")
	private BigDecimal newReq;

	@Column(name="OLD_REQ")
	private BigDecimal oldReq;

	@Column(name="OLD_REQ_CNT")
	private BigDecimal oldReqCnt;

	@Column(name="REM_AMT")
	private BigDecimal remAmt;

	@Column(name="REM_CNT")
	private BigDecimal remCnt;

	@Column(name="TOT_AMT_CLASS")
	private String totAmtClass;

	@Column(name="TYPE_OF_GOOD")
	private String typeOfGood;

	public AubBaseTotTable() {
	}

	public BigDecimal getAC() {
		return this.aC;
	}

	public void setAC(BigDecimal aC) {
		this.aC = aC;
	}

	public BigDecimal getAllcCnt() {
		return this.allcCnt;
	}

	public void setAllcCnt(BigDecimal allcCnt) {
		this.allcCnt = allcCnt;
	}

	public BigDecimal getAlloc() {
		return this.alloc;
	}

	public void setAlloc(BigDecimal alloc) {
		this.alloc = alloc;
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

	public BigDecimal getCanceledCnt() {
		return this.canceledCnt;
	}

	public void setCanceledCnt(BigDecimal canceledCnt) {
		this.canceledCnt = canceledCnt;
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

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public BigDecimal getDecrease() {
		return this.decrease;
	}

	public void setDecrease(BigDecimal decrease) {
		this.decrease = decrease;
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

	public BigDecimal getNewCnt() {
		return this.newCnt;
	}

	public void setNewCnt(BigDecimal newCnt) {
		this.newCnt = newCnt;
	}

	public BigDecimal getNewReq() {
		return this.newReq;
	}

	public void setNewReq(BigDecimal newReq) {
		this.newReq = newReq;
	}

	public BigDecimal getOldReq() {
		return this.oldReq;
	}

	public void setOldReq(BigDecimal oldReq) {
		this.oldReq = oldReq;
	}

	public BigDecimal getOldReqCnt() {
		return this.oldReqCnt;
	}

	public void setOldReqCnt(BigDecimal oldReqCnt) {
		this.oldReqCnt = oldReqCnt;
	}

	public BigDecimal getRemAmt() {
		return this.remAmt;
	}

	public void setRemAmt(BigDecimal remAmt) {
		this.remAmt = remAmt;
	}

	public BigDecimal getRemCnt() {
		return this.remCnt;
	}

	public void setRemCnt(BigDecimal remCnt) {
		this.remCnt = remCnt;
	}

	public String getTotAmtClass() {
		return this.totAmtClass;
	}

	public void setTotAmtClass(String totAmtClass) {
		this.totAmtClass = totAmtClass;
	}

	public String getTypeOfGood() {
		return this.typeOfGood;
	}

	public void setTypeOfGood(String typeOfGood) {
		this.typeOfGood = typeOfGood;
	}

}