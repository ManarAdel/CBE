package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CR_MAP_NULL_CBE_CODE database table.
 * 
 */
@Entity
@Table(name="CR_MAP_NULL_CBE_CODE")
@NamedQuery(name="CrMapNullCbeCode.findAll", query="SELECT c FROM CrMapNullCbeCode c")
public class CrMapNullCbeCode implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//This Table Doesn't have A PK 
	//Generated Id 
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;


	@Temporal(TemporalType.DATE)
	private Date busdate;

	@Column(name="CUSTOMER_CBE_CODE")
	private String customerCbeCode;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	public CrMapNullCbeCode() {
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public String getCustomerCbeCode() {
		return this.customerCbeCode;
	}

	public void setCustomerCbeCode(String customerCbeCode) {
		this.customerCbeCode = customerCbeCode;
	}

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

}