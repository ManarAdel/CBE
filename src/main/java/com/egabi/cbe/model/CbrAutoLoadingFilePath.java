package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the CBR_AUTO_LOADING_FILE_PATH database table.
 * 
 */
@Entity
@Table(name="CBR_AUTO_LOADING_FILE_PATH")
@NamedQuery(name="CbrAutoLoadingFilePath.findAll", query="SELECT c FROM CbrAutoLoadingFilePath c")
public class CbrAutoLoadingFilePath implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="PATH_NAME")
	private String pathName;

	public CbrAutoLoadingFilePath() {
	}

	public String getPathName() {
		return this.pathName;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

}