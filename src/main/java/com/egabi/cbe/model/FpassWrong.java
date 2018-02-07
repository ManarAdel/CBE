package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the FPASS_WRONGS database table.
 * 
 */
@Entity
@Table(name="FPASS_WRONGS")
@NamedQuery(name="FpassWrong.findAll", query="SELECT f FROM FpassWrong f")
public class FpassWrong implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FpassWrongPK id;

	@Column(name="NO_OF_TRIES")
	private BigDecimal noOfTries;

	public FpassWrong() {
	}

	public FpassWrongPK getId() {
		return this.id;
	}

	public void setId(FpassWrongPK id) {
		this.id = id;
	}

	public BigDecimal getNoOfTries() {
		return this.noOfTries;
	}

	public void setNoOfTries(BigDecimal noOfTries) {
		this.noOfTries = noOfTries;
	}

}