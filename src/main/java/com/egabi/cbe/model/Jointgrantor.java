package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the JOINTGRANTORS database table.
 * 
 */
@Entity
@Table(name="JOINTGRANTORS")
@NamedQuery(name="Jointgrantor.findAll", query="SELECT j FROM Jointgrantor j")
public class Jointgrantor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


	@Column(name="\"A\"")
	private BigDecimal a;

	private BigDecimal b;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private String zz;

	public Jointgrantor() {
	}

	public BigDecimal getA() {
		return this.a;
	}

	public void setA(BigDecimal a) {
		this.a = a;
	}

	public BigDecimal getB() {
		return this.b;
	}

	public void setB(BigDecimal b) {
		this.b = b;
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public String getZz() {
		return this.zz;
	}

	public void setZz(String zz) {
		this.zz = zz;
	}

}