package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FW450 database table.
 * 
 */
@Entity
@NamedQuery(name="Fw450.findAll", query="SELECT f FROM Fw450 f")
public class Fw450 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"A\"")
	private String a;

	@Temporal(TemporalType.DATE)
	private Date c;

	private BigDecimal d;

	private BigDecimal e;

	private BigDecimal f;

	private BigDecimal g;

	private BigDecimal h;

	private BigDecimal i;

	private BigDecimal j;

	private BigDecimal k;

	private BigDecimal l;

	public Fw450() {
	}

	public String getA() {
		return this.a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public Date getC() {
		return this.c;
	}

	public void setC(Date c) {
		this.c = c;
	}

	public BigDecimal getD() {
		return this.d;
	}

	public void setD(BigDecimal d) {
		this.d = d;
	}

	public BigDecimal getE() {
		return this.e;
	}

	public void setE(BigDecimal e) {
		this.e = e;
	}

	public BigDecimal getF() {
		return this.f;
	}

	public void setF(BigDecimal f) {
		this.f = f;
	}

	public BigDecimal getG() {
		return this.g;
	}

	public void setG(BigDecimal g) {
		this.g = g;
	}

	public BigDecimal getH() {
		return this.h;
	}

	public void setH(BigDecimal h) {
		this.h = h;
	}

	public BigDecimal getI() {
		return this.i;
	}

	public void setI(BigDecimal i) {
		this.i = i;
	}

	public BigDecimal getJ() {
		return this.j;
	}

	public void setJ(BigDecimal j) {
		this.j = j;
	}

	public BigDecimal getK() {
		return this.k;
	}

	public void setK(BigDecimal k) {
		this.k = k;
	}

	public BigDecimal getL() {
		return this.l;
	}

	public void setL(BigDecimal l) {
		this.l = l;
	}

}