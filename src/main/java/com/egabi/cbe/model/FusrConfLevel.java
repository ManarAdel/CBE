package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FUSR_CONF_LEVELS database table.
 * 
 */
@Entity
@Table(name="FUSR_CONF_LEVELS")
@NamedQuery(name="FusrConfLevel.findAll", query="SELECT f FROM FusrConfLevel f")
public class FusrConfLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FusrConfLevelPK id;

	public FusrConfLevel() {
	}

	public FusrConfLevelPK getId() {
		return this.id;
	}

	public void setId(FusrConfLevelPK id) {
		this.id = id;
	}

}