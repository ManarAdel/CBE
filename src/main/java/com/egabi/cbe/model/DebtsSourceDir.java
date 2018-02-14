package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DEBTS_SOURCE_DIR database table.
 * 
 */
@Entity
@Table(name="DEBTS_SOURCE_DIR")
@NamedQuery(name="DebtsSourceDir.findAll", query="SELECT d FROM DebtsSourceDir d")
public class DebtsSourceDir implements Serializable {
	private static final long serialVersionUID = 1L;
	
			//This Table Doesn't have A PK 
			//Generated Id 
			@Id
		    @GeneratedValue(strategy=GenerationType.IDENTITY)
		    private Long id;

	private String busdate;

	private String debtno;

	private String debtyear;

	public DebtsSourceDir() {
	}

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
		this.busdate = busdate;
	}

	public String getDebtno() {
		return this.debtno;
	}

	public void setDebtno(String debtno) {
		this.debtno = debtno;
	}

	public String getDebtyear() {
		return this.debtyear;
	}

	public void setDebtyear(String debtyear) {
		this.debtyear = debtyear;
	}

}