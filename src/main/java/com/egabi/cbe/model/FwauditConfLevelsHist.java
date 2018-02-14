package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FWAUDIT_CONF_LEVELS_HIST database table.
 * 
 */
@Entity
@Table(name="FWAUDIT_CONF_LEVELS_HIST")
@NamedQuery(name="FwauditConfLevelsHist.findAll", query="SELECT f FROM FwauditConfLevelsHist f")
public class FwauditConfLevelsHist implements Serializable {
	private static final long serialVersionUID = 1L;

	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CONF_LEVEL")
	private BigDecimal confLevel;

	@Temporal(TemporalType.DATE)
	@Column(name="CONF_TIME")
	private Date confTime;

	@Column(name="CONF_USRNO")
	private BigDecimal confUsrno;

	private BigDecimal oprno;

	private BigDecimal usrno;

	public FwauditConfLevelsHist() {
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public BigDecimal getConfLevel() {
		return this.confLevel;
	}

	public void setConfLevel(BigDecimal confLevel) {
		this.confLevel = confLevel;
	}

	public Date getConfTime() {
		return this.confTime;
	}

	public void setConfTime(Date confTime) {
		this.confTime = confTime;
	}

	public BigDecimal getConfUsrno() {
		return this.confUsrno;
	}

	public void setConfUsrno(BigDecimal confUsrno) {
		this.confUsrno = confUsrno;
	}

	public BigDecimal getOprno() {
		return this.oprno;
	}

	public void setOprno(BigDecimal oprno) {
		this.oprno = oprno;
	}

	public BigDecimal getUsrno() {
		return this.usrno;
	}

	public void setUsrno(BigDecimal usrno) {
		this.usrno = usrno;
	}

}