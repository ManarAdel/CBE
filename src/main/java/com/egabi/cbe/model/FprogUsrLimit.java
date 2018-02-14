package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FPROG_USR_LIMIT database table.
 * 
 */
@Entity
@Table(name="FPROG_USR_LIMIT")
@NamedQuery(name="FprogUsrLimit.findAll", query="SELECT f FROM FprogUsrLimit f")
public class FprogUsrLimit implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


	@Column(name="LIMIT_CR")
	private BigDecimal limitCr;

	@Column(name="LIMIT_DR")
	private BigDecimal limitDr;

	private String progname;

	private BigDecimal usrno;

	public FprogUsrLimit() {
	}

	public BigDecimal getLimitCr() {
		return this.limitCr;
	}

	public void setLimitCr(BigDecimal limitCr) {
		this.limitCr = limitCr;
	}

	public BigDecimal getLimitDr() {
		return this.limitDr;
	}

	public void setLimitDr(BigDecimal limitDr) {
		this.limitDr = limitDr;
	}

	public String getProgname() {
		return this.progname;
	}

	public void setProgname(String progname) {
		this.progname = progname;
	}

	public BigDecimal getUsrno() {
		return this.usrno;
	}

	public void setUsrno(BigDecimal usrno) {
		this.usrno = usrno;
	}

}