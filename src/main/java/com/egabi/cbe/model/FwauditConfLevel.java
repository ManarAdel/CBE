package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FWAUDIT_CONF_LEVELS database table.
 * 
 */
@Entity
@Table(name="FWAUDIT_CONF_LEVELS")
@NamedQuery(name="FwauditConfLevel.findAll", query="SELECT f FROM FwauditConfLevel f")
public class FwauditConfLevel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


	@Column(name="CONF_LEVEL")
	private BigDecimal confLevel;

	@Temporal(TemporalType.DATE)
	@Column(name="CONF_TIME")
	private Date confTime;

	@Column(name="CONF_USRNO")
	private BigDecimal confUsrno;

	private BigDecimal oprno;

	private BigDecimal usrno;

	public FwauditConfLevel() {
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