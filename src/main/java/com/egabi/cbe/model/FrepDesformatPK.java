package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the FREP_DESFORMAT database table.
 * 
 */
@Embeddable
public class FrepDesformatPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String progname;

	private String caption;

	public FrepDesformatPK() {
	}
	public String getProgname() {
		return this.progname;
	}
	public void setProgname(String progname) {
		this.progname = progname;
	}
	public String getCaption() {
		return this.caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FrepDesformatPK)) {
			return false;
		}
		FrepDesformatPK castOther = (FrepDesformatPK)other;
		return 
			this.progname.equals(castOther.progname)
			&& this.caption.equals(castOther.caption);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.progname.hashCode();
		hash = hash * prime + this.caption.hashCode();
		
		return hash;
	}
}