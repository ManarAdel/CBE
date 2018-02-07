package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FDAILYSTATUS database table.
 * 
 */
@Entity
@NamedQuery(name="Fdailystatus.findAll", query="SELECT f FROM Fdailystatus f")
public class Fdailystatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long brcode;

	private BigDecimal status;

	@Temporal(TemporalType.DATE)
	private Date updatedate;

	public Fdailystatus() {
	}

	public long getBrcode() {
		return this.brcode;
	}

	public void setBrcode(long brcode) {
		this.brcode = brcode;
	}

	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
	}

	public Date getUpdatedate() {
		return this.updatedate;
	}

	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}

}