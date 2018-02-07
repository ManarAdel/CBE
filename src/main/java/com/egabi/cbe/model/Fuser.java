package com.egabi.cbe.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FUSERS database table.
 * 
 */
@Entity
@Table(name="FUSERS")
@NamedQuery(name="Fuser.findAll", query="SELECT f FROM Fuser f")
public class Fuser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long usrno;

	@Column(name="ACCT_PASS_FLAG")
	private BigDecimal acctPassFlag;

	@Column(name="ACCT_STATUS_FLAG")
	private BigDecimal acctStatusFlag;

	private String aname;

	@Column(name="BAL_ACCT_PASS_FLAG")
	private BigDecimal balAcctPassFlag;

	@Column(name="CHANGE_RATE_FLAG")
	private BigDecimal changeRateFlag;

	@Column(name="DEP_CODE")
	private BigDecimal depCode;

	@Column(name="DIS_PASS_AMT_FLAG")
	private BigDecimal disPassAmtFlag;

	private String ename;

	@Column(name="EXPENSES_FLAG")
	private BigDecimal expensesFlag;

	@Column(name="FRZ_ACCT_PASS_FLAG")
	private BigDecimal frzAcctPassFlag;

	@Column(name="FST_LOG")
	private BigDecimal fstLog;

	@Column(name="INCOME_FLAG")
	private BigDecimal incomeFlag;

	@Column(name="LMT_FOREIGN_AMT")
	private BigDecimal lmtForeignAmt;

	@Column(name="LMT_FOREIGN_AMT_EXP")
	private BigDecimal lmtForeignAmtExp;

	@Column(name="LMT_LOCAL_AMT")
	private BigDecimal lmtLocalAmt;

	@Column(name="LMT_LOCAL_AMT_EXP")
	private BigDecimal lmtLocalAmtExp;

	@Column(name="OL_FLAG1")
	private BigDecimal olFlag1;

	@Column(name="OL_FLAG2")
	private BigDecimal olFlag2;

	@Temporal(TemporalType.DATE)
	private Date opendate;

	@Temporal(TemporalType.DATE)
	@Column(name="PASSUPDATE_DATE")
	private Date passupdateDate;

	@Column(name="SHOW_PASS_SCREEN_FLAG")
	private BigDecimal showPassScreenFlag;

	@Column(name="SIGN_SEC")
	private BigDecimal signSec;

	@Column(name="USER_ID")
	private String userId;

	@Column(name="USR_BLK")
	private BigDecimal usrBlk;

	@Temporal(TemporalType.DATE)
	@Column(name="USR_BLK_DATE")
	private Date usrBlkDate;

	@Column(name="USR_BLK_REASON")
	private String usrBlkReason;

	private String usrpw;

	//bi-directional many-to-one association to Fbranch
	@ManyToOne
	@JoinColumn(name="BRCODE")
	private Fbranch fbranch;

	public Fuser() {
	}

	public long getUsrno() {
		return this.usrno;
	}

	public void setUsrno(long usrno) {
		this.usrno = usrno;
	}

	public BigDecimal getAcctPassFlag() {
		return this.acctPassFlag;
	}

	public void setAcctPassFlag(BigDecimal acctPassFlag) {
		this.acctPassFlag = acctPassFlag;
	}

	public BigDecimal getAcctStatusFlag() {
		return this.acctStatusFlag;
	}

	public void setAcctStatusFlag(BigDecimal acctStatusFlag) {
		this.acctStatusFlag = acctStatusFlag;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public BigDecimal getBalAcctPassFlag() {
		return this.balAcctPassFlag;
	}

	public void setBalAcctPassFlag(BigDecimal balAcctPassFlag) {
		this.balAcctPassFlag = balAcctPassFlag;
	}

	public BigDecimal getChangeRateFlag() {
		return this.changeRateFlag;
	}

	public void setChangeRateFlag(BigDecimal changeRateFlag) {
		this.changeRateFlag = changeRateFlag;
	}

	public BigDecimal getDepCode() {
		return this.depCode;
	}

	public void setDepCode(BigDecimal depCode) {
		this.depCode = depCode;
	}

	public BigDecimal getDisPassAmtFlag() {
		return this.disPassAmtFlag;
	}

	public void setDisPassAmtFlag(BigDecimal disPassAmtFlag) {
		this.disPassAmtFlag = disPassAmtFlag;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public BigDecimal getExpensesFlag() {
		return this.expensesFlag;
	}

	public void setExpensesFlag(BigDecimal expensesFlag) {
		this.expensesFlag = expensesFlag;
	}

	public BigDecimal getFrzAcctPassFlag() {
		return this.frzAcctPassFlag;
	}

	public void setFrzAcctPassFlag(BigDecimal frzAcctPassFlag) {
		this.frzAcctPassFlag = frzAcctPassFlag;
	}

	public BigDecimal getFstLog() {
		return this.fstLog;
	}

	public void setFstLog(BigDecimal fstLog) {
		this.fstLog = fstLog;
	}

	public BigDecimal getIncomeFlag() {
		return this.incomeFlag;
	}

	public void setIncomeFlag(BigDecimal incomeFlag) {
		this.incomeFlag = incomeFlag;
	}

	public BigDecimal getLmtForeignAmt() {
		return this.lmtForeignAmt;
	}

	public void setLmtForeignAmt(BigDecimal lmtForeignAmt) {
		this.lmtForeignAmt = lmtForeignAmt;
	}

	public BigDecimal getLmtForeignAmtExp() {
		return this.lmtForeignAmtExp;
	}

	public void setLmtForeignAmtExp(BigDecimal lmtForeignAmtExp) {
		this.lmtForeignAmtExp = lmtForeignAmtExp;
	}

	public BigDecimal getLmtLocalAmt() {
		return this.lmtLocalAmt;
	}

	public void setLmtLocalAmt(BigDecimal lmtLocalAmt) {
		this.lmtLocalAmt = lmtLocalAmt;
	}

	public BigDecimal getLmtLocalAmtExp() {
		return this.lmtLocalAmtExp;
	}

	public void setLmtLocalAmtExp(BigDecimal lmtLocalAmtExp) {
		this.lmtLocalAmtExp = lmtLocalAmtExp;
	}

	public BigDecimal getOlFlag1() {
		return this.olFlag1;
	}

	public void setOlFlag1(BigDecimal olFlag1) {
		this.olFlag1 = olFlag1;
	}

	public BigDecimal getOlFlag2() {
		return this.olFlag2;
	}

	public void setOlFlag2(BigDecimal olFlag2) {
		this.olFlag2 = olFlag2;
	}

	public Date getOpendate() {
		return this.opendate;
	}

	public void setOpendate(Date opendate) {
		this.opendate = opendate;
	}

	public Date getPassupdateDate() {
		return this.passupdateDate;
	}

	public void setPassupdateDate(Date passupdateDate) {
		this.passupdateDate = passupdateDate;
	}

	public BigDecimal getShowPassScreenFlag() {
		return this.showPassScreenFlag;
	}

	public void setShowPassScreenFlag(BigDecimal showPassScreenFlag) {
		this.showPassScreenFlag = showPassScreenFlag;
	}

	public BigDecimal getSignSec() {
		return this.signSec;
	}

	public void setSignSec(BigDecimal signSec) {
		this.signSec = signSec;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public BigDecimal getUsrBlk() {
		return this.usrBlk;
	}

	public void setUsrBlk(BigDecimal usrBlk) {
		this.usrBlk = usrBlk;
	}

	public Date getUsrBlkDate() {
		return this.usrBlkDate;
	}

	public void setUsrBlkDate(Date usrBlkDate) {
		this.usrBlkDate = usrBlkDate;
	}

	public String getUsrBlkReason() {
		return this.usrBlkReason;
	}

	public void setUsrBlkReason(String usrBlkReason) {
		this.usrBlkReason = usrBlkReason;
	}

	public String getUsrpw() {
		return this.usrpw;
	}

	public void setUsrpw(String usrpw) {
		this.usrpw = usrpw;
	}

	public Fbranch getFbranch() {
		return this.fbranch;
	}

	public void setFbranch(Fbranch fbranch) {
		this.fbranch = fbranch;
	}

}