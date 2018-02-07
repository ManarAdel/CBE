package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the FBLOCK_VALIDATE database table.
 * 
 */
@Entity
@Table(name="FBLOCK_VALIDATE")
@NamedQuery(name="FblockValidate.findAll", query="SELECT f FROM FblockValidate f")
public class FblockValidate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BLOCK_NAME")
	private String blockName;

	private String progname;

	public FblockValidate() {
	}

	public String getBlockName() {
		return this.blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public String getProgname() {
		return this.progname;
	}

	public void setProgname(String progname) {
		this.progname = progname;
	}

}