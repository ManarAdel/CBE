package com.egabi.cbe.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the FAUDIT_CONF_LEVELS database table.
 * 
 */
@Entity
@Table(name="FAUDIT_CONF_LEVELS")
@NamedQuery(name="FauditConfLevel.findAll", query="SELECT f FROM FauditConfLevel f")
public class FauditConfLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FauditConfLevelPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="CONF_TIME")
	private Date confTime;

	public FauditConfLevel() {
	}

	public FauditConfLevelPK getId() {
		return this.id;
	}

	public void setId(FauditConfLevelPK id) {
		this.id = id;
	}

	public Date getConfTime() {
		return this.confTime;
	}

	public void setConfTime(Date confTime) {
		this.confTime = confTime;
	}

}