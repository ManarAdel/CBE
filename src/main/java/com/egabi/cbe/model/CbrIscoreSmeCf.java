package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CBR_ISCORE_SME_CF database table.
 * 
 */
@Entity
@Table(name="CBR_ISCORE_SME_CF")
@NamedQuery(name="CbrIscoreSmeCf.findAll", query="SELECT c FROM CbrIscoreSmeCf c")
public class CbrIscoreSmeCf implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CbrIscoreSmeCfPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="ACC_CLS_DAT")
	private Date accClsDat;

	@Column(name="ACT_ST")
	private String actSt;

	@Column(name="AMT_FRN")
	private BigDecimal amtFrn;

	@Column(name="AMT_OVR_DUE")
	private BigDecimal amtOvrDue;

	@Column(name="AMT_WRT_OFF")
	private BigDecimal amtWrtOff;

	@Column(name="APR_AMT")
	private String aprAmt;

	@Temporal(TemporalType.DATE)
	@Column(name="APR_DAT")
	private Date aprDat;

	@Column(name="AST_CLS")
	private String astCls;

	@Column(name="BRANCH_CODE")
	private String branchCode;

	@Column(name="CENTER_CODE")
	private String centerCode;

	@Temporal(TemporalType.DATE)
	@Column(name="CON_EXP_DAT")
	private Date conExpDat;

	@Column(name="CON_ST")
	private String conSt;

	private String cort;

	@Column(name="CORT_DEC")
	private String cortDec;

	@Column(name="CORT_LOC")
	private String cortLoc;

	@Column(name="CRD_FAC_BAL")
	private BigDecimal crdFacBal;

	@Temporal(TemporalType.DATE)
	@Column(name="CRD_FAC_DAT")
	private Date crdFacDat;

	@Temporal(TemporalType.DATE)
	@Column(name="CRD_FAC_STL_DAT")
	private Date crdFacStlDat;

	@Column(name="CRD_FAC_TYP")
	private BigDecimal crdFacTyp;

	@Column(name="CRITERIA_FLAG")
	private BigDecimal criteriaFlag;

	private String cur;

	@Column(name="CUSTOMER_CODE")
	private String customerCode;

	@Column(name="CUSTOMER_TYPE")
	private String customerType;

	private String dataid;

	@Temporal(TemporalType.DATE)
	@Column(name="DEC_DAT")
	private Date decDat;

	@Column(name="DIS_NO")
	private String disNo;

	@Column(name="DIS_ST")
	private String disSt;

	@Temporal(TemporalType.DATE)
	@Column(name="FRS_DAT")
	private Date frsDat;

	@Column(name="INS_AMT")
	private String insAmt;

	private String lgl;

	@Column(name="LST_TRN")
	private BigDecimal lstTrn;

	@Temporal(TemporalType.DATE)
	@Column(name="LST_TRN_DAT")
	private Date lstTrnDat;

	@Column(name="NO_DAY")
	private BigDecimal noDay;

	@Column(name="NO_PAY")
	private BigDecimal noPay;

	@Column(name="P_CRD_FAC")
	private String pCrdFac;

	@Column(name="P_DATA_BRN_ID")
	private String pDataBrnId;

	@Column(name="P_DATA_ID")
	private String pDataId;

	@Column(name="PRO_NOT")
	private String proNot;

	@Temporal(TemporalType.DATE)
	@Column(name="PRO_NOT_DAT")
	private Date proNotDat;

	private String rem;

	@Column(name="REP_TYP")
	private String repTyp;

	@Column(name="RES_AMT_FRN")
	private String resAmtFrn;

	@Column(name="RES_AMT_WRT_OFF")
	private String resAmtWrtOff;

	@Column(name="RES_CLS")
	private String resCls;

	@Column(name="SEG_IDN")
	private String segIdn;

	@Column(name="SP_NOT_ACC")
	private String spNotAcc;

	@Column(name="SUT_AMT")
	private BigDecimal sutAmt;

	@Temporal(TemporalType.DATE)
	@Column(name="SUT_DAT")
	private Date sutDat;

	@Column(name="SUT_NO")
	private String sutNo;

	@Column(name="SUT_ST")
	private String sutSt;

	@Column(name="TRM_LON")
	private String trmLon;

	@Column(name="TRN_TYP_CD")
	private String trnTypCd;

	public CbrIscoreSmeCf() {
	}

	public CbrIscoreSmeCfPK getId() {
		return this.id;
	}

	public void setId(CbrIscoreSmeCfPK id) {
		this.id = id;
	}

	public Date getAccClsDat() {
		return this.accClsDat;
	}

	public void setAccClsDat(Date accClsDat) {
		this.accClsDat = accClsDat;
	}

	public String getActSt() {
		return this.actSt;
	}

	public void setActSt(String actSt) {
		this.actSt = actSt;
	}

	public BigDecimal getAmtFrn() {
		return this.amtFrn;
	}

	public void setAmtFrn(BigDecimal amtFrn) {
		this.amtFrn = amtFrn;
	}

	public BigDecimal getAmtOvrDue() {
		return this.amtOvrDue;
	}

	public void setAmtOvrDue(BigDecimal amtOvrDue) {
		this.amtOvrDue = amtOvrDue;
	}

	public BigDecimal getAmtWrtOff() {
		return this.amtWrtOff;
	}

	public void setAmtWrtOff(BigDecimal amtWrtOff) {
		this.amtWrtOff = amtWrtOff;
	}

	public String getAprAmt() {
		return this.aprAmt;
	}

	public void setAprAmt(String aprAmt) {
		this.aprAmt = aprAmt;
	}

	public Date getAprDat() {
		return this.aprDat;
	}

	public void setAprDat(Date aprDat) {
		this.aprDat = aprDat;
	}

	public String getAstCls() {
		return this.astCls;
	}

	public void setAstCls(String astCls) {
		this.astCls = astCls;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getCenterCode() {
		return this.centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public Date getConExpDat() {
		return this.conExpDat;
	}

	public void setConExpDat(Date conExpDat) {
		this.conExpDat = conExpDat;
	}

	public String getConSt() {
		return this.conSt;
	}

	public void setConSt(String conSt) {
		this.conSt = conSt;
	}

	public String getCort() {
		return this.cort;
	}

	public void setCort(String cort) {
		this.cort = cort;
	}

	public String getCortDec() {
		return this.cortDec;
	}

	public void setCortDec(String cortDec) {
		this.cortDec = cortDec;
	}

	public String getCortLoc() {
		return this.cortLoc;
	}

	public void setCortLoc(String cortLoc) {
		this.cortLoc = cortLoc;
	}

	public BigDecimal getCrdFacBal() {
		return this.crdFacBal;
	}

	public void setCrdFacBal(BigDecimal crdFacBal) {
		this.crdFacBal = crdFacBal;
	}

	public Date getCrdFacDat() {
		return this.crdFacDat;
	}

	public void setCrdFacDat(Date crdFacDat) {
		this.crdFacDat = crdFacDat;
	}

	public Date getCrdFacStlDat() {
		return this.crdFacStlDat;
	}

	public void setCrdFacStlDat(Date crdFacStlDat) {
		this.crdFacStlDat = crdFacStlDat;
	}

	public BigDecimal getCrdFacTyp() {
		return this.crdFacTyp;
	}

	public void setCrdFacTyp(BigDecimal crdFacTyp) {
		this.crdFacTyp = crdFacTyp;
	}

	public BigDecimal getCriteriaFlag() {
		return this.criteriaFlag;
	}

	public void setCriteriaFlag(BigDecimal criteriaFlag) {
		this.criteriaFlag = criteriaFlag;
	}

	public String getCur() {
		return this.cur;
	}

	public void setCur(String cur) {
		this.cur = cur;
	}

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getDataid() {
		return this.dataid;
	}

	public void setDataid(String dataid) {
		this.dataid = dataid;
	}

	public Date getDecDat() {
		return this.decDat;
	}

	public void setDecDat(Date decDat) {
		this.decDat = decDat;
	}

	public String getDisNo() {
		return this.disNo;
	}

	public void setDisNo(String disNo) {
		this.disNo = disNo;
	}

	public String getDisSt() {
		return this.disSt;
	}

	public void setDisSt(String disSt) {
		this.disSt = disSt;
	}

	public Date getFrsDat() {
		return this.frsDat;
	}

	public void setFrsDat(Date frsDat) {
		this.frsDat = frsDat;
	}

	public String getInsAmt() {
		return this.insAmt;
	}

	public void setInsAmt(String insAmt) {
		this.insAmt = insAmt;
	}

	public String getLgl() {
		return this.lgl;
	}

	public void setLgl(String lgl) {
		this.lgl = lgl;
	}

	public BigDecimal getLstTrn() {
		return this.lstTrn;
	}

	public void setLstTrn(BigDecimal lstTrn) {
		this.lstTrn = lstTrn;
	}

	public Date getLstTrnDat() {
		return this.lstTrnDat;
	}

	public void setLstTrnDat(Date lstTrnDat) {
		this.lstTrnDat = lstTrnDat;
	}

	public BigDecimal getNoDay() {
		return this.noDay;
	}

	public void setNoDay(BigDecimal noDay) {
		this.noDay = noDay;
	}

	public BigDecimal getNoPay() {
		return this.noPay;
	}

	public void setNoPay(BigDecimal noPay) {
		this.noPay = noPay;
	}

	public String getPCrdFac() {
		return this.pCrdFac;
	}

	public void setPCrdFac(String pCrdFac) {
		this.pCrdFac = pCrdFac;
	}

	public String getPDataBrnId() {
		return this.pDataBrnId;
	}

	public void setPDataBrnId(String pDataBrnId) {
		this.pDataBrnId = pDataBrnId;
	}

	public String getPDataId() {
		return this.pDataId;
	}

	public void setPDataId(String pDataId) {
		this.pDataId = pDataId;
	}

	public String getProNot() {
		return this.proNot;
	}

	public void setProNot(String proNot) {
		this.proNot = proNot;
	}

	public Date getProNotDat() {
		return this.proNotDat;
	}

	public void setProNotDat(Date proNotDat) {
		this.proNotDat = proNotDat;
	}

	public String getRem() {
		return this.rem;
	}

	public void setRem(String rem) {
		this.rem = rem;
	}

	public String getRepTyp() {
		return this.repTyp;
	}

	public void setRepTyp(String repTyp) {
		this.repTyp = repTyp;
	}

	public String getResAmtFrn() {
		return this.resAmtFrn;
	}

	public void setResAmtFrn(String resAmtFrn) {
		this.resAmtFrn = resAmtFrn;
	}

	public String getResAmtWrtOff() {
		return this.resAmtWrtOff;
	}

	public void setResAmtWrtOff(String resAmtWrtOff) {
		this.resAmtWrtOff = resAmtWrtOff;
	}

	public String getResCls() {
		return this.resCls;
	}

	public void setResCls(String resCls) {
		this.resCls = resCls;
	}

	public String getSegIdn() {
		return this.segIdn;
	}

	public void setSegIdn(String segIdn) {
		this.segIdn = segIdn;
	}

	public String getSpNotAcc() {
		return this.spNotAcc;
	}

	public void setSpNotAcc(String spNotAcc) {
		this.spNotAcc = spNotAcc;
	}

	public BigDecimal getSutAmt() {
		return this.sutAmt;
	}

	public void setSutAmt(BigDecimal sutAmt) {
		this.sutAmt = sutAmt;
	}

	public Date getSutDat() {
		return this.sutDat;
	}

	public void setSutDat(Date sutDat) {
		this.sutDat = sutDat;
	}

	public String getSutNo() {
		return this.sutNo;
	}

	public void setSutNo(String sutNo) {
		this.sutNo = sutNo;
	}

	public String getSutSt() {
		return this.sutSt;
	}

	public void setSutSt(String sutSt) {
		this.sutSt = sutSt;
	}

	public String getTrmLon() {
		return this.trmLon;
	}

	public void setTrmLon(String trmLon) {
		this.trmLon = trmLon;
	}

	public String getTrnTypCd() {
		return this.trnTypCd;
	}

	public void setTrnTypCd(String trnTypCd) {
		this.trnTypCd = trnTypCd;
	}

}