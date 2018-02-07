package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the WWW database table.
 * 
 */
@Entity
@NamedQuery(name="Www.findAll", query="SELECT w FROM Www w")
public class Www implements Serializable {
	private static final long serialVersionUID = 1L;

	private BigDecimal amt;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	public Www() {
	}

	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

}