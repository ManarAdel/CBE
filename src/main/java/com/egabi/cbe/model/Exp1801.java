package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the EXP_1801 database table.
 * 
 */
@Entity
@Table(name="EXP_1801")
@NamedQuery(name="Exp1801.findAll", query="SELECT e FROM Exp1801 e")
public class Exp1801 implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	public Exp1801() {
	}

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

}