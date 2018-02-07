package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FPARAM database table.
 * 
 */
@Entity
@NamedQuery(name="Fparam.findAll", query="SELECT f FROM Fparam f")
public class Fparam implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FparamPK id;

	private String descr;

	private BigDecimal glno;

	private BigDecimal subgl;

	@Column(name="\"TYPE\"")
	private BigDecimal type;

	public Fparam() {
	}

	public FparamPK getId() {
		return this.id;
	}

	public void setId(FparamPK id) {
		this.id = id;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public BigDecimal getGlno() {
		return this.glno;
	}

	public void setGlno(BigDecimal glno) {
		this.glno = glno;
	}

	public BigDecimal getSubgl() {
		return this.subgl;
	}

	public void setSubgl(BigDecimal subgl) {
		this.subgl = subgl;
	}

	public BigDecimal getType() {
		return this.type;
	}

	public void setType(BigDecimal type) {
		this.type = type;
	}

}