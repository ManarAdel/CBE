package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AUB_NEW_IDC_TEMP database table.
 * 
 */
@Entity
@Table(name="AUB_NEW_IDC_TEMP")
@NamedQuery(name="AubNewIdcTemp.findAll", query="SELECT a FROM AubNewIdcTemp a")
public class AubNewIdcTemp implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
		//This Table Doesn't have A PK 
		//Generated Id 
		@Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;

	@Column(name="A_C")
	private String aC;

	private String amount;

	@Column(name="AMOUNT_USD")
	private String amountUsd;

	private String busdate;

	private String ccy;

	private String client;

	@Column(name="IDC_REFRENCE")
	private String idcRefrence;

	private String maturity;

	public AubNewIdcTemp() {
	}

	public String getAC() {
		return this.aC;
	}

	public void setAC(String aC) {
		this.aC = aC;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAmountUsd() {
		return this.amountUsd;
	}

	public void setAmountUsd(String amountUsd) {
		this.amountUsd = amountUsd;
	}

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
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