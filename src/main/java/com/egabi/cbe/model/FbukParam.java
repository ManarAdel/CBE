package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FBUK_PARAM database table.
 * 
 */
@Entity
@Table(name="FBUK_PARAM")
@NamedQuery(name="FbukParam.findAll", query="SELECT f FROM FbukParam f")
public class FbukParam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long usrno;

	@Column(name="PATH_FILE")
	private String pathFile;

	public FbukParam() {
	}

	public long getUsrno() {
		return this.usrno;
	}

	public void setUsrno(long usrno) {
		this.usrno = usrno;
	}

	public String getPathFile() {
		return this.pathFile;
	}

	public void setPathFile(String pathFile) {
		this.pathFile = pathFile;
	}

}