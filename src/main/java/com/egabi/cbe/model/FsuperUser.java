package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FSUPER_USERS database table.
 * 
 */
@Entity
@Table(name="FSUPER_USERS")
@NamedQuery(name="FsuperUser.findAll", query="SELECT f FROM FsuperUser f")
public class FsuperUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long usrno;

	public FsuperUser() {
	}

	public long getUsrno() {
		return this.usrno;
	}

	public void setUsrno(long usrno) {
		this.usrno = usrno;
	}

}