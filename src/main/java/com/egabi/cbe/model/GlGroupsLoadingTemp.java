package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the GL_GROUPS_LOADING_TEMP database table.
 * 
 */
@Entity
@Table(name="GL_GROUPS_LOADING_TEMP")
@NamedQuery(name="GlGroupsLoadingTemp.findAll", query="SELECT g FROM GlGroupsLoadingTemp g")
public class GlGroupsLoadingTemp implements Serializable {
	private static final long serialVersionUID = 1L;
	
			//This Table Doesn't have A PK 
			//Generated Id 
			@Id
		    @GeneratedValue(strategy=GenerationType.IDENTITY)
		    private Long id;

	@Column(name="ARABIC_DESCR")
	private String arabicDescr;

	private String busdate;

	private String class1;

	private String class2;

	private String class3;

	private String class4;

	private String class5;

	@Column(name="ENGLISH_DESCR")
	private String englishDescr;

	@Column(name="GROUP_CODE")
	private String groupCode;

	public GlGroupsLoadingTemp() {
	}

	public String getArabicDescr() {
		return this.arabicDescr;
	}

	public void setArabicDescr(String arabicDescr) {
		this.arabicDescr = arabicDescr;
	}

	public String getBusdate() {
		return this.busdate;
	}

	public void setBusdate(String busdate) {
		this.busdate = busdate;
	}

	public String getClass1() {
		return this.class1;
	}

	public void setClass1(String class1) {
		this.class1 = class1;
	}

	public String getClass2() {
		return this.class2;
	}

	public void setClass2(String class2) {
		this.class2 = class2;
	}

	public String getClass3() {
		return this.class3;
	}

	public void setClass3(String class3) {
		this.class3 = class3;
	}

	public String getClass4() {
		return this.class4;
	}

	public void setClass4(String class4) {
		this.class4 = class4;
	}

	public String getClass5() {
		return this.class5;
	}

	public void setClass5(String class5) {
		this.class5 = class5;
	}

	public String getEnglishDescr() {
		return this.englishDescr;
	}

	public void setEnglishDescr(String englishDescr) {
		this.englishDescr = englishDescr;
	}

	public String getGroupCode() {
		return this.groupCode;
	}

	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

}