package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TT2 database table.
 * 
 */
@Entity
@NamedQuery(name="Tt2.findAll", query="SELECT t FROM Tt2 t")
public class Tt2 implements Serializable {
	private static final long serialVersionUID = 1L;
	
		//This Table Doesn't have A PK 
		//Generated Id 
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;

	private String account;

	private String ccy;

	private String client;

	private BigDecimal equivalent;

	private String idc;

	@Column(name="MATURITY_DATE")
	private String maturityDate;

	@Column(name="OUT_REQUESTS")
	private BigDecimal outRequests;

	@Column(name="PROPOSED_USD")
	private BigDecimal proposedUsd;

	public Tt2() {
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
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

	public BigDecimal getEquivalent() {
		return this.equivalent;
	}

	public void setEquivalent(BigDecimal equivalent) {
		this.equivalent = equivalent;
	}

	public String getIdc() {
		return this.idc;
	}

	public void setIdc(String idc) {
		this.idc = idc;
	}

	public String getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(String maturityDate) {
		this.maturityDate = maturityDate;
	}

	public BigDecimal getOutRequests() {
		return this.outRequests;
	}

	public void setOutRequests(BigDecimal outRequests) {
		this.outRequests = outRequests;
	}

	public BigDecimal getProposedUsd() {
		return this.proposedUsd;
	}

	public void setProposedUsd(BigDecimal proposedUsd) {
		this.proposedUsd = proposedUsd;
	}

}