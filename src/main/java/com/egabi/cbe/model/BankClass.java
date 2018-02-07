package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the BANK_CLASS database table.
 * 
 */
@Entity
@Table(name="BANK_CLASS")
@NamedQuery(name="BankClass.findAll", query="SELECT b FROM BankClass b")
public class BankClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BankClassPK id;

	@Column(name="BANK_LOCATION")
	private String bankLocation;

	@Column(name="BANK_SECTOR")
	private String bankSector;

	public BankClass() {
	}

	public BankClassPK getId() {
		return this.id;
	}

	public void setId(BankClassPK id) {
		this.id = id;
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

}