package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CSV_TEST_TEMP database table.
 * 
 */
@Entity
@Table(name="CSV_TEST_TEMP")
@NamedQuery(name="CsvTestTemp.findAll", query="SELECT c FROM CsvTestTemp c")
public class CsvTestTemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="BRANCH_NAME")
	private String branchName;

	private String busdate;

	public CsvTestTemp() {
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
		this.busdate = busdate;
	}

}