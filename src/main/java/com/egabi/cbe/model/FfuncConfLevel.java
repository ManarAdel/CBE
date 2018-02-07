package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FFUNC_CONF_LEVEL database table.
 * 
 */
@Entity
@Table(name="FFUNC_CONF_LEVEL")
@NamedQuery(name="FfuncConfLevel.findAll", query="SELECT f FROM FfuncConfLevel f")
public class FfuncConfLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FfuncConfLevelPK id;

	public FfuncConfLevel() {
	}

	public FfuncConfLevelPK getId() {
		return this.id;
	}

	public void setId(FfuncConfLevelPK id) {
		this.id = id;
	}

}