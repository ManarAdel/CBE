package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FWBARC007 database table.
 * 
 */
@Entity
@NamedQuery(name="Fwbarc007.findAll", query="SELECT f FROM Fwbarc007 f")
public class Fwbarc007 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="REP_ID")
	private BigDecimal repId;

	private BigDecimal usrno;

	public Fwbarc007() {
	}

	public BigDecimal getRepId() {
		return this.repId;
	}

	public void setRepId(BigDecimal repId) {
		this.repId = repId;
	}

	public BigDecimal getUsrno() {
		return this.usrno;
	}

	public void setUsrno(BigDecimal usrno) {
		this.usrno = usrno;
	}

}