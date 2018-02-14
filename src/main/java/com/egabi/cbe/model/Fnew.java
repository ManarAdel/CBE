package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FNEW database table.
 * 
 */
@Entity
@NamedQuery(name="Fnew.findAll", query="SELECT f FROM Fnew f")
public class Fnew implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


	private BigDecimal brcode;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private BigDecimal curcode;

	private BigDecimal custno;

	private BigDecimal glno;

	private BigDecimal subno;

	public Fnew() {
	}

	public BigDecimal getBrcode() {
		return this.brcode;
	}

	public void setBrcode(BigDecimal brcode) {
		this.brcode = brcode;
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public BigDecimal getCurcode() {
		return this.curcode;
	}

	public void setCurcode(BigDecimal curcode) {
		this.curcode = curcode;
	}

	public BigDecimal getCustno() {
		return this.custno;
	}

	public void setCustno(BigDecimal custno) {
		this.custno = custno;
	}

	public BigDecimal getGlno() {
		return this.glno;
	}

	public void setGlno(BigDecimal glno) {
		this.glno = glno;
	}

	public BigDecimal getSubno() {
		return this.subno;
	}

	public void setSubno(BigDecimal subno) {
		this.subno = subno;
	}

}