package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CSV_TEST database table.
 * 
 */
@Entity
@Table(name="CSV_TEST")
@NamedQuery(name="CsvTest.findAll", query="SELECT c FROM CsvTest c")
public class CsvTest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="BRANCH_NAME")
	private String branchName;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	public CsvTest() {
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

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

}