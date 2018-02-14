package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FBANK_ITEM_VALID database table.
 * 
 */
@Entity
@Table(name="FBANK_ITEM_VALID")
@NamedQuery(name="FbankItemValid.findAll", query="SELECT f FROM FbankItemValid f")
public class FbankItemValid implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	


	private String aname;

	@Column(name="BANK_DESNAME")
	private String bankDesname;

	@Column(name="BANK_ID")
	private BigDecimal bankId;

	@Column(name="BANK_USERID")
	private String bankUserid;

	private String ename;

	@Column(name="REPORT_KEY")
	private String reportKey;

	@Column(name="W_FLAG")
	private BigDecimal wFlag;

	public FbankItemValid() {
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getBankDesname() {
		return this.bankDesname;
	}

	public void setBankDesname(String bankDesname) {
		this.bankDesname = bankDesname;
	}

	public BigDecimal getBankId() {
		return this.bankId;
	}

	public void setBankId(BigDecimal bankId) {
		this.bankId = bankId;
	}

	public String getBankUserid() {
		return this.bankUserid;
	}

	public void setBankUserid(String bankUserid) {
		this.bankUserid = bankUserid;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getReportKey() {
		return this.reportKey;
	}

	public void setReportKey(String reportKey) {
		this.reportKey = reportKey;
	}

	public BigDecimal getWFlag() {
		return this.wFlag;
	}

	public void setWFlag(BigDecimal wFlag) {
		this.wFlag = wFlag;
	}

}