package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the AUB_NEW_IDC database table.
 * 
 */
@Entity
@Table(name="AUB_NEW_IDC")
@NamedQuery(name="AubNewIdc.findAll", query="SELECT a FROM AubNewIdc a")
public class AubNewIdc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="A_C")
	private BigDecimal aC;

	private BigDecimal amount;

	@Column(name="AMOUNT_USD")
	private BigDecimal amountUsd;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private String ccy;

	private String client;

	@Column(name="IDC_REFRENCE")
	private String idcRefrence;

	private String maturity;

	public AubNewIdc() {
	}

	public BigDecimal getAC() {
		return this.aC;
	}

	public void setAC(BigDecimal aC) {
		this.aC = aC;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAmountUsd() {
		return this.amountUsd;
	}

	public void setAmountUsd(BigDecimal amountUsd) {
		this.amountUsd = amountUsd;
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

	public String getIdcRefrence() {
		return this.idcRefrence;
	}

	public void setIdcRefrence(String idcRefrence) {
		this.idcRefrence = idcRefrence;
	}

	public String getMaturity() {
		return this.maturity;
	}

	public void setMaturity(String maturity) {
		this.maturity = maturity;
	}

}