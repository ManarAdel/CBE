package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBE_821_DATA_SOURCE database table.
 * 
 */
@Entity
@Table(name="CBE_821_DATA_SOURCE")
@NamedQuery(name="Cbe821DataSource.findAll", query="SELECT c FROM Cbe821DataSource c")
public class Cbe821DataSource implements Serializable {
	private static final long serialVersionUID = 1L;
	
			//This Table Doesn't have A PK 
			//Generated Id 
			@Id
		    @GeneratedValue(strategy=GenerationType.IDENTITY)
		    private Long id;

	@Temporal(TemporalType.DATE)
	private Date busdate;

	private BigDecimal diff;

	public Cbe821DataSource() {
	}

	public Date getBusdate() {
		return this.busdate;
	}

	public void setBusdate(Date busdate) {
		this.busdate = busdate;
	}

	public BigDecimal getDiff() {
		return this.diff;
	}

	public void setDiff(BigDecimal diff) {
		this.diff = diff;
	}

}