package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MANUAL_INPUT_200 database table.
 * 
 */
@Entity
@Table(name="MANUAL_INPUT_200")
@NamedQuery(name="ManualInput200.findAll", query="SELECT m FROM ManualInput200 m")
public class ManualInput200 implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amount;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private String descr;

	public ManualInput200() {
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

}