package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the BONDS_1501_P_18_TEMP database table.
 * 
 */
@Entity
@Table(name="BONDS_1501_P_18_TEMP")
@NamedQuery(name="Bonds1501P18Temp.findAll", query="SELECT b FROM Bonds1501P18Temp b")
public class Bonds1501P18Temp implements Serializable {
	private static final long serialVersionUID = 1L;
	
			//This Table Doesn't have A PK 
			//Generated Id 
			@Id
		    @GeneratedValue(strategy=GenerationType.IDENTITY)
		    private Long id;

	private String bonds;

	@Column(name="BONDS_AMT")
	private String bondsAmt;

	@Column(name="BONDS_COUNT")
	private String bondsCount;

	@Column(name="BOOKING_AMT")
	private String bookingAmt;

	private String busdate;

	private String cost;

	public Bonds1501P18Temp() {
	}

	public String getBonds() {
		return this.bonds;
	}

	public void setBonds(String bonds) {
		this.bonds = bonds;
	}

	public String getBondsAmt() {
		return this.bondsAmt;
	}

	public void setBondsAmt(String bondsAmt) {
		this.bondsAmt = bondsAmt;
	}

	public String getBondsCount() {
		return this.bondsCount;
	}

	public void setBondsCount(String bondsCount) {
		this.bondsCount = bondsCount;
	}

	public String getBookingAmt() {
		return this.bookingAmt;
	}

	public void setBookingAmt(String bookingAmt) {
		this.bookingAmt = bookingAmt;
	}

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
		this.busdate = busdate;
	}

	public String getCost() {
		return this.cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

}