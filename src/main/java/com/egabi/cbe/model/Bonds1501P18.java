package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the BONDS_1501_P_18 database table.
 * 
 */
@Entity
@Table(name="BONDS_1501_P_18")
@NamedQuery(name="Bonds1501P18.findAll", query="SELECT b FROM Bonds1501P18 b")
public class Bonds1501P18 implements Serializable {
	private static final long serialVersionUID = 1L;

	private String bonds;

	@Column(name="BONDS_AMT")
	private BigDecimal bondsAmt;

	@Column(name="BONDS_COUNT")
	private BigDecimal bondsCount;

	@Column(name="BOOKING_AMT")
	private BigDecimal bookingAmt;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private BigDecimal cost;

	public Bonds1501P18() {
	}

	public String getBonds() {
		return this.bonds;
	}

	public void setBonds(String bonds) {
		this.bonds = bonds;
	}

	public BigDecimal getBondsAmt() {
		return this.bondsAmt;
	}

	public void setBondsAmt(BigDecimal bondsAmt) {
		this.bondsAmt = bondsAmt;
	}

	public BigDecimal getBondsCount() {
		return this.bondsCount;
	}

	public void setBondsCount(BigDecimal bondsCount) {
		this.bondsCount = bondsCount;
	}

	public BigDecimal getBookingAmt() {
		return this.bookingAmt;
	}

	public void setBookingAmt(BigDecimal bookingAmt) {
		this.bookingAmt = bookingAmt;
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

}