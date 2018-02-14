//package com.egabi.cbe.model;
//
//import java.io.Serializable;
//import javax.persistence.*;
//
//
///**
// * The persistent class for the V$INSTANCE_BP database table.
// * 
// */
//@Entity
//@Table(name="V$INSTANCE_BP")
//@NamedQuery(name="V$instanceBp.findAll", query="SELECT v FROM V$instanceBp v")
//public class V$instanceBp implements Serializable {
//	private static final long serialVersionUID = 1L;
//	
//	//This Table Doesn't have A PK 
//	//Generated Id 
//	@Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    private Long id;
//
//
//	@Column(name="ACTIVE_STATE")
//	private Object activeState;
//
//	private Object archiver;
//
//	private Object blocked;
//
//	@Column(name="DATABASE_STATUS")
//	private Object databaseStatus;
//
//	@Column(name="HOST_NAME")
//	private Object hostName;
//
//	@Column(name="INSTANCE_NAME")
//	private Object instanceName;
//
//	@Column(name="INSTANCE_NUMBER")
//	private Object instanceNumber;
//
//	@Column(name="INSTANCE_ROLE")
//	private Object instanceRole;
//
//	@Column(name="LOG_SWITCH_WAIT")
//	private Object logSwitchWait;
//
//	private Object logins;
//
//	@Column(name="\"PARALLEL\"")
//	private Object parallel;
//
//	@Column(name="SHUTDOWN_PENDING")
//	private Object shutdownPending;
//
//	@Column(name="STARTUP_TIME")
//	private Object startupTime;
//
//	private Object status;
//
//	@Column(name="THREAD#")
//	private Object thread_;
//
//	@Column(name="\"VERSION\"")
//	private Object version;
//
//	public V$instanceBp() {
//	}
//
//	public Object getActiveState() {
//		return this.activeState;
//	}
//
//	public void setActiveState(Object activeState) {
//		this.activeState = activeState;
//	}
//
//	public Object getArchiver() {
//		return this.archiver;
//	}
//
//	public void setArchiver(Object archiver) {
//		this.archiver = archiver;
//	}
//
//	public Object getBlocked() {
//		return this.blocked;
//	}
//
//	public void setBlocked(Object blocked) {
//		this.blocked = blocked;
//	}
//
//	public Object getDatabaseStatus() {
//		return this.databaseStatus;
//	}
//
//	public void setDatabaseStatus(Object databaseStatus) {
//		this.databaseStatus = databaseStatus;
//	}
//
//	public Object getHostName() {
//		return this.hostName;
//	}
//
//	public void setHostName(Object hostName) {
//		this.hostName = hostName;
//	}
//
//	public Object getInstanceName() {
//		return this.instanceName;
//	}
//
//	public void setInstanceName(Object instanceName) {
//		this.instanceName = instanceName;
//	}
//
//	public Object getInstanceNumber() {
//		return this.instanceNumber;
//	}
//
//	public void setInstanceNumber(Object instanceNumber) {
//		this.instanceNumber = instanceNumber;
//	}
//
//	public Object getInstanceRole() {
//		return this.instanceRole;
//	}
//
//	public void setInstanceRole(Object instanceRole) {
//		this.instanceRole = instanceRole;
//	}
//
//	public Object getLogSwitchWait() {
//		return this.logSwitchWait;
//	}
//
//	public void setLogSwitchWait(Object logSwitchWait) {
//		this.logSwitchWait = logSwitchWait;
//	}
//
//	public Object getLogins() {
//		return this.logins;
//	}
//
//	public void setLogins(Object logins) {
//		this.logins = logins;
//	}
//
//	public Object getParallel() {
//		return this.parallel;
//	}
//
//	public void setParallel(Object parallel) {
//		this.parallel = parallel;
//	}
//
//	public Object getShutdownPending() {
//		return this.shutdownPending;
//	}
//
//	public void setShutdownPending(Object shutdownPending) {
//		this.shutdownPending = shutdownPending;
//	}
//
//	public Object getStartupTime() {
//		return this.startupTime;
//	}
//
//	public void setStartupTime(Object startupTime) {
//		this.startupTime = startupTime;
//	}
//
//	public Object getStatus() {
//		return this.status;
//	}
//
//	public void setStatus(Object status) {
//		this.status = status;
//	}
//
//	public Object getThread_() {
//		return this.thread_;
//	}
//
//	public void setThread_(Object thread_) {
//		this.thread_ = thread_;
//	}
//
//	public Object getVersion() {
//		return this.version;
//	}
//
//	public void setVersion(Object version) {
//		this.version = version;
//	}
//
//}