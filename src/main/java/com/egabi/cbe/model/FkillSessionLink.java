package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FKILL_SESSION_LINK database table.
 * 
 */
@Entity
@Table(name="FKILL_SESSION_LINK")
@NamedQuery(name="FkillSessionLink.findAll", query="SELECT f FROM FkillSessionLink f")
public class FkillSessionLink implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FkillSessionLinkPK id;

	@Column(name="LINK_NAME")
	private String linkName;

	public FkillSessionLink() {
	}

	public FkillSessionLinkPK getId() {
		return this.id;
	}

	public void setId(FkillSessionLinkPK id) {
		this.id = id;
	}

	public String getLinkName() {
		return this.linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

}