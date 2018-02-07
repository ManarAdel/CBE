package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DEBTS_SOURCE database table.
 * 
 */
@Entity
@Table(name="DEBTS_SOURCE")
@NamedQuery(name="DebtsSource.findAll", query="SELECT d FROM DebtsSource d")
public class DebtsSource implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private BigDecimal debtno;

	@Temporal(TemporalType.DATE)
	private Date debtyear;

	public DebtsSource() {
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public BigDecimal getDebtno() {
		return this.debtno;
	}

	public void setDebtno(BigDecimal debtno) {
		this.debtno = debtno;
	}

	public Date getDebtyear() {
		return this.debtyear;
	}

	public void setDebtyear(Date debtyear) {
		this.debtyear = debtyear;
	}

}