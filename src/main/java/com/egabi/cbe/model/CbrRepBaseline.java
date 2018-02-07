package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBR_REP_BASELINE database table.
 * 
 */
@Entity
@Table(name="CBR_REP_BASELINE")
@NamedQuery(name="CbrRepBaseline.findAll", query="SELECT c FROM CbrRepBaseline c")
public class CbrRepBaseline implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrRepBaselinePK id;

	@Column(name="EXTRA_ROW_COUNT")
	private BigDecimal extraRowCount;

	private BigDecimal usrno;

	@Column(name="\"VALUE\"")
	private String value;

	@Temporal(TemporalType.DATE)
	@Column(name="VERSION_DATE")
	private Date versionDate;

	public CbrRepBaseline() {
	}

	public CbrRepBaselinePK getId() {
		return this.id;
	}

	public void setId(CbrRepBaselinePK id) {
		this.id = id;
	}

	public BigDecimal getExtraRowCount() {
		return this.extraRowCount;
	}

	public void setExtraRowCount(BigDecimal extraRowCount) {
		this.extraRowCount = extraRowCount;
	}

	public BigDecimal getUsrno() {
		return this.usrno;
	}

	public void setUsrno(BigDecimal usrno) {
		this.usrno = usrno;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getVersionDate() {
		return this.versionDate;
	}

	public void setVersionDate(Date versionDate) {
		this.versionDate = versionDate;
	}

}