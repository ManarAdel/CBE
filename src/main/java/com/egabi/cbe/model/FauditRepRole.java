package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FAUDIT_REP_ROLE database table.
 * 
 */
@Entity
@Table(name="FAUDIT_REP_ROLE")
@NamedQuery(name="FauditRepRole.findAll", query="SELECT f FROM FauditRepRole f")
public class FauditRepRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FauditRepRolePK id;

	public FauditRepRole() {
	}

	public FauditRepRolePK getId() {
		return this.id;
	}

	public void setId(FauditRepRolePK id) {
		this.id = id;
	}

}