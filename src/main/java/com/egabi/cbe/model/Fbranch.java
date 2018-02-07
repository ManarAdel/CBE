package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the FBRANCH database table.
 * 
 */
@Entity
@NamedQuery(name="Fbranch.findAll", query="SELECT f FROM Fbranch f")
public class Fbranch implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long brcode;

	@Column(name="ABBREV_BRCODE")
	private String abbrevBrcode;

	private String aname;

	@Column(name="CAPITAL_FLAG")
	private BigDecimal capitalFlag;

	private String ename;

	private BigDecimal exbr;

	//bi-directional many-to-one association to Fuser
	@OneToMany(mappedBy="fbranch")
	private List<Fuser> fusers;

	public Fbranch() {
	}

	public long getBrcode() {
		return this.brcode;
	}

	public void setBrcode(long brcode) {
		this.brcode = brcode;
	}

	public String getAbbrevBrcode() {
		return this.abbrevBrcode;
	}

	public void setAbbrevBrcode(String abbrevBrcode) {
		this.abbrevBrcode = abbrevBrcode;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public BigDecimal getCapitalFlag() {
		return this.capitalFlag;
	}

	public void setCapitalFlag(BigDecimal capitalFlag) {
		this.capitalFlag = capitalFlag;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public BigDecimal getExbr() {
		return this.exbr;
	}

	public void setExbr(BigDecimal exbr) {
		this.exbr = exbr;
	}

	public List<Fuser> getFusers() {
		return this.fusers;
	}

	public void setFusers(List<Fuser> fusers) {
		this.fusers = fusers;
	}

	public Fuser addFuser(Fuser fuser) {
		getFusers().add(fuser);
		fuser.setFbranch(this);

		return fuser;
	}

	public Fuser removeFuser(Fuser fuser) {
		getFusers().remove(fuser);
		fuser.setFbranch(null);

		return fuser;
	}

}