package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FBNKNAM database table.
 * 
 */
@Entity
@NamedQuery(name="Fbnknam.findAll", query="SELECT f FROM Fbnknam f")
public class Fbnknam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long bankno;

	private String add1;

	private String add2;

	private String aname;

	@Column(name="BANK_TYPE")
	private BigDecimal bankType;

	@Column(name="COUNTRY_CODE")
	private BigDecimal countryCode;

	private String ename;

	@Column(name="STAY_FLG")
	private BigDecimal stayFlg;

	@Column(name="SWIFT_BANK_CODE")
	private String swiftBankCode;

	@Column(name="SWIFT_COUNTRY")
	private String swiftCountry;

	@Column(name="SWIFT_LOCATION")
	private String swiftLocation;

	public Fbnknam() {
	}

	public long getBankno() {
		return this.bankno;
	}

	public void setBankno(long bankno) {
		this.bankno = bankno;
	}

	public String getAdd1() {
		return this.add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return this.add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public BigDecimal getBankType() {
		return this.bankType;
	}

	public void setBankType(BigDecimal bankType) {
		this.bankType = bankType;
	}

	public BigDecimal getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(BigDecimal countryCode) {
		this.countryCode = countryCode;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public BigDecimal getStayFlg() {
		return this.stayFlg;
	}

	public void setStayFlg(BigDecimal stayFlg) {
		this.stayFlg = stayFlg;
	}

	public String getSwiftBankCode() {
		return this.swiftBankCode;
	}

	public void setSwiftBankCode(String swiftBankCode) {
		this.swiftBankCode = swiftBankCode;
	}

	public String getSwiftCountry() {
		return this.swiftCountry;
	}

	public void setSwiftCountry(String swiftCountry) {
		this.swiftCountry = swiftCountry;
	}

	public String getSwiftLocation() {
		return this.swiftLocation;
	}

	public void setSwiftLocation(String swiftLocation) {
		this.swiftLocation = swiftLocation;
	}

}