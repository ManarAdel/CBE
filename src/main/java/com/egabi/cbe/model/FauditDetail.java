package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FAUDIT_DETAILS database table.
 * 
 */
@Entity
@Table(name="FAUDIT_DETAILS")
@NamedQuery(name="FauditDetail.findAll", query="SELECT f FROM FauditDetail f")
public class FauditDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FauditDetailPK id;

	@Column(name="NEW_VALUE")
	private String newValue;

	@Column(name="OLD_VALUE")
	private String oldValue;

	public FauditDetail() {
	}

	public FauditDetailPK getId() {
		return this.id;
	}

	public void setId(FauditDetailPK id) {
		this.id = id;
	}

	public String getNewValue() {
		return this.newValue;
	}

	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}

	public String getOldValue() {
		return this.oldValue;
	}

	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}

}