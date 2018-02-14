package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PROG_LIMIT_ITEM database table.
 * 
 */
@Entity
@Table(name="PROG_LIMIT_ITEM")
@NamedQuery(name="ProgLimitItem.findAll", query="SELECT p FROM ProgLimitItem p")
public class ProgLimitItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
			//This Table Doesn't have A PK 
			//Generated Id 
			@Id
		    @GeneratedValue(strategy=GenerationType.IDENTITY)
		    private Long id;

	@Column(name="CURR_ITEM_NAME")
	private String currItemName;

	@Column(name="ITEM_NAME")
	private String itemName;

	private String progname;

	@Column(name="TRANCODE_ITEM_NAME")
	private String trancodeItemName;

	public ProgLimitItem() {
	}

	public String getCurrItemName() {
		return this.currItemName;
	}

	public void setCurrItemName(String currItemName) {
		this.currItemName = currItemName;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getProgname() {
		return this.progname;
	}

	public void setProgname(String progname) {
		this.progname = progname;
	}

	public String getTrancodeItemName() {
		return this.trancodeItemName;
	}

	public void setTrancodeItemName(String trancodeItemName) {
		this.trancodeItemName = trancodeItemName;
	}

}