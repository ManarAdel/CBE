package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MANUAL_INPUT_200_TEMP database table.
 * 
 */
@Entity
@Table(name="MANUAL_INPUT_200_TEMP")
@NamedQuery(name="ManualInput200Temp.findAll", query="SELECT m FROM ManualInput200Temp m")
public class ManualInput200Temp implements Serializable {
	private static final long serialVersionUID = 1L;

	private String amount;

	private String busdate;

	private String descr;

	public ManualInput200Temp() {
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
		this.busdate = busdate;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

}