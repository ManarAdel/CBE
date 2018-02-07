package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the CBR_SELECT_OP_TEST database table.
 * 
 */
@Entity
@Table(name="CBR_SELECT_OP_TEST")
@NamedQuery(name="CbrSelectOpTest.findAll", query="SELECT c FROM CbrSelectOpTest c")
public class CbrSelectOpTest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="\"DATA\"")
	private String data;

	@Column(name="ROW_NUMBER")
	private BigDecimal rowNumber;

	private BigDecimal usrno;

	public CbrSelectOpTest() {
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public BigDecimal getRowNumber() {
		return this.rowNumber;
	}

	public void setRowNumber(BigDecimal rowNumber) {
		this.rowNumber = rowNumber;
	}

	public BigDecimal getUsrno() {
		return this.usrno;
	}

	public void setUsrno(BigDecimal usrno) {
		this.usrno = usrno;
	}

}