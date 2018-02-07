package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FEMP_ROLES database table.
 * 
 */
@Entity
@Table(name="FEMP_ROLES")
@NamedQuery(name="FempRole.findAll", query="SELECT f FROM FempRole f")
public class FempRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FempRolePK id;

	public FempRole() {
	}

	public FempRolePK getId() {
		return this.id;
	}

	public void setId(FempRolePK id) {
		this.id = id;
	}

}