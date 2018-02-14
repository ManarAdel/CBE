package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FWAUB_5005 database table.
 * 
 */
@Entity
@Table(name="FWAUB_5005")
@NamedQuery(name="Fwaub5005.findAll", query="SELECT f FROM Fwaub5005 f")
public class Fwaub5005 implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


	@Column(name="\"A\"")
	private String a;

	private BigDecimal d;

	private BigDecimal e;

	private BigDecimal f;

	private BigDecimal g;

	private BigDecimal h;

	private BigDecimal i;

	private BigDecimal j;

	private BigDecimal k;

	private BigDecimal l;

	private BigDecimal n;

	private BigDecimal o;

	public Fwaub5005() {
	}

	public String getA() {
		return this.a;
	}

	public void setA(String a) {
		this.a = a;
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

	public BigDecimal getN() {
		return this.n;
	}

	public void setN(BigDecimal n) {
		this.n = n;
	}

	public BigDecimal getO() {
		return this.o;
	}

	public void setO(BigDecimal o) {
		this.o = o;
	}

}