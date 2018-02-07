package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TEST_MOH database table.
 * 
 */
@Entity
@Table(name="TEST_MOH")
@NamedQuery(name="TestMoh.findAll", query="SELECT t FROM TestMoh t")
public class TestMoh implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACC_NO")
	private String accNo;

	private String amountfcy;

	private String amountlcy;

	private String codes;

	private String conc;

	private String curr;

	private String dpcpws;

	private String dpdlno;

	private String dpnar1;

	private String dpnar2;

	private String ec;

	private String name;

	private String oa;

	private String q48;

	private String qgcbcl;

	private String qgghcl;

	private String qgnaty;

	private String rate;

	@Column(name="SIGN_")
	private String sign;

	private String test;

	private String travel;

	@Column(name="W_S")
	private String wS;

	public TestMoh() {
	}

	public String getAccNo() {
		return this.accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAmountfcy() {
		return this.amountfcy;
	}

	public void setAmountfcy(String amountfcy) {
		this.amountfcy = amountfcy;
	}

	public String getAmountlcy() {
		return this.amountlcy;
	}

	public void setAmountlcy(String amountlcy) {
		this.amountlcy = amountlcy;
	}

	public String getCodes() {
		return this.codes;
	}

	public void setCodes(String codes) {
		this.codes = codes;
	}

	public String getConc() {
		return this.conc;
	}

	public void setConc(String conc) {
		this.conc = conc;
	}

	public String getCurr() {
		return this.curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	public String getDpcpws() {
		return this.dpcpws;
	}

	public void setDpcpws(String dpcpws) {
		this.dpcpws = dpcpws;
	}

	public String getDpdlno() {
		return this.dpdlno;
	}

	public void setDpdlno(String dpdlno) {
		this.dpdlno = dpdlno;
	}

	public String getDpnar1() {
		return this.dpnar1;
	}

	public void setDpnar1(String dpnar1) {
		this.dpnar1 = dpnar1;
	}

	public String getDpnar2() {
		return this.dpnar2;
	}

	public void setDpnar2(String dpnar2) {
		this.dpnar2 = dpnar2;
	}

	public String getEc() {
		return this.ec;
	}

	public void setEc(String ec) {
		this.ec = ec;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOa() {
		return this.oa;
	}

	public void setOa(String oa) {
		this.oa = oa;
	}

	public String getQ48() {
		return this.q48;
	}

	public void setQ48(String q48) {
		this.q48 = q48;
	}

	public String getQgcbcl() {
		return this.qgcbcl;
	}

	public void setQgcbcl(String qgcbcl) {
		this.qgcbcl = qgcbcl;
	}

	public String getQgghcl() {
		return this.qgghcl;
	}

	public void setQgghcl(String qgghcl) {
		this.qgghcl = qgghcl;
	}

	public String getQgnaty() {
		return this.qgnaty;
	}

	public void setQgnaty(String qgnaty) {
		this.qgnaty = qgnaty;
	}

	public String getRate() {
		return this.rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getTest() {
		return this.test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getTravel() {
		return this.travel;
	}

	public void setTravel(String travel) {
		this.travel = travel;
	}

	public String getWS() {
		return this.wS;
	}

	public void setWS(String wS) {
		this.wS = wS;
	}

}