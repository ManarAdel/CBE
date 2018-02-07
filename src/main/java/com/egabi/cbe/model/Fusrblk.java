package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FUSRBLK database table.
 * 
 */
@Entity
@NamedQuery(name="Fusrblk.findAll", query="SELECT f FROM Fusrblk f")
public class Fusrblk implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private String status;

	@Temporal(TemporalType.DATE)
	private Date sysdat;

	private BigDecimal usrno;

	@Column(name="USRNO_RUN")
	private BigDecimal usrnoRun;

	public Fusrblk() {
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getSysdat() {
		return this.sysdat;
	}

	public void setSysdat(Date sysdat) {
		this.sysdat = sysdat;
	}

	public BigDecimal getUsrno() {
		return this.usrno;
	}

	public void setUsrno(BigDecimal usrno) {
		this.usrno = usrno;
	}

	public BigDecimal getUsrnoRun() {
		return this.usrnoRun;
	}

	public void setUsrnoRun(BigDecimal usrnoRun) {
		this.usrnoRun = usrnoRun;
	}

}