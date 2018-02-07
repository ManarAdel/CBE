package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the GL_ACCT database table.
 * 
 */
@Entity
@Table(name="GL_ACCT")
@NamedQuery(name="GlAcct.findAll", query="SELECT g FROM GlAcct g")
public class GlAcct implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GlAcctPK id;

	@Column(name="ACCT_DESCRIPTION_ARB")
	private String acctDescriptionArb;

	@Column(name="ACCT_DESCRIPTION_ENG")
	private String acctDescriptionEng;

	private BigDecimal bal;

	@Column(name="DR_CR")
	private String drCr;

	private BigDecimal equivalent;

	public GlAcct() {
	}

	public GlAcctPK getId() {
		return this.id;
	}

	public void setId(GlAcctPK id) {
		this.id = id;
	}

	public String getAcctDescriptionArb() {
		return this.acctDescriptionArb;
	}

	public void setAcctDescriptionArb(String acctDescriptionArb) {
		this.acctDescriptionArb = acctDescriptionArb;
	}

	public String getAcctDescriptionEng() {
		return this.acctDescriptionEng;
	}

	public void setAcctDescriptionEng(String acctDescriptionEng) {
		this.acctDescriptionEng = acctDescriptionEng;
	}

	public BigDecimal getBal() {
		return this.bal;
	}

	public void setBal(BigDecimal bal) {
		this.bal = bal;
	}

	public String getDrCr() {
		return this.drCr;
	}

	public void setDrCr(String drCr) {
		this.drCr = drCr;
	}

	public BigDecimal getEquivalent() {
		return this.equivalent;
	}

	public void setEquivalent(BigDecimal equivalent) {
		this.equivalent = equivalent;
	}

}