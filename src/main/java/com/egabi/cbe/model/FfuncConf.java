package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FFUNC_CONF database table.
 * 
 */
@Entity
@Table(name="FFUNC_CONF")
@NamedQuery(name="FfuncConf.findAll", query="SELECT f FROM FfuncConf f")
public class FfuncConf implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FfuncConfPK id;

	private BigDecimal conflevel;

	public FfuncConf() {
	}

	public FfuncConfPK getId() {
		return this.id;
	}

	public void setId(FfuncConfPK id) {
		this.id = id;
	}

	public BigDecimal getConflevel() {
		return this.conflevel;
	}

	public void setConflevel(BigDecimal conflevel) {
		this.conflevel = conflevel;
	}

}