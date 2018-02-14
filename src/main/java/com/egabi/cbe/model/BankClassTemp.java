package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the BANK_CLASS_TEMP database table.
 * 
 */
@Entity
@Table(name="BANK_CLASS_TEMP")
@NamedQuery(name="BankClassTemp.findAll", query="SELECT b FROM BankClassTemp b")
public class BankClassTemp implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


	@Column(name="BANK_LOCATION")
	private String bankLocation;

	@Column(name="BANK_SECTOR")
	private String bankSector;

	private String busdate;

	private String custno;

	public BankClassTemp() {
	}

	public String getBankLocation() {
		return this.bankLocation;
	}

	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}

	public String getBankSector() {
		return this.bankSector;
	}

	public void setBankSector(String bankSector) {
		this.bankSector = bankSector;
	}

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
		this.busdate = busdate;
	}

	public String getCustno() {
		return this.custno;
	}

	public void setCustno(String custno) {
		this.custno = custno;
	}

}