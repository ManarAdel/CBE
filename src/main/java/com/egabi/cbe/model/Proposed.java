package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PROPOSED database table.
 * 
 */
@Entity
@NamedQuery(name="Proposed.findAll", query="SELECT p FROM Proposed p")
public class Proposed implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

	@Column(name="ACCOUNT_NUMBER")
	private String accountNumber;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private String ccy;

	@Column(name="CLIENT_NAME")
	private String clientName;

	private String idc;

	@Column(name="PROPOSED_USD")
	private BigDecimal proposedUsd;

	@Column(name="REQ_AMT_USD")
	private BigDecimal reqAmtUsd;

	@Column(name="\"TYPE\"")
	private String type;

	public Proposed() {
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getIdc() {
		return this.idc;
	}

	public void setIdc(String idc) {
		this.idc = idc;
	}

	public BigDecimal getProposedUsd() {
		return this.proposedUsd;
	}

	public void setProposedUsd(BigDecimal proposedUsd) {
		this.proposedUsd = proposedUsd;
	}

	public BigDecimal getReqAmtUsd() {
		return this.reqAmtUsd;
	}

	public void setReqAmtUsd(BigDecimal reqAmtUsd) {
		this.reqAmtUsd = reqAmtUsd;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}