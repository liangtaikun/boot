package com.taikun.test.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * 
 * <p>
 * Title: T01PsnEntity
 * </p>
 * <p>
 * Description: 营销人员基本信息表
 * </p>
 * <p>
 * Company:广西人寿信息技术部
 * </p>
 * 
 * @author taikun
 * @date 2017年7月18日
 */
@Entity
@Table(name = "zcjb_t01psn")
public class T01PsnEntity {
	@Id
	@Column(length = 14, unique = true)
	private String pid;
	@Column(length = 20)
	private String psnname;
	@Column(length = 18)
	private String t01personid;
	@Column(length = 2)
	private String t01actrank;
	@Column(length = 1)
	private String t01status;
	@Column(length = 1)
	private String t01persontype;
    
	@JoinColumn(name = "did")
	@ManyToOne
	private deptEntity deptEntity;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private zcPidtraceEntity zcPidtraceEntity;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPsnname() {
		return psnname;
	}

	public void setPsnname(String psnname) {
		this.psnname = psnname;
	}

	public String getT01personid() {
		return t01personid;
	}

	public void setT01personid(String t01personid) {
		this.t01personid = t01personid;
	}

	public String getT01actrank() {
		return t01actrank;
	}

	public void setT01actrank(String t01actrank) {
		this.t01actrank = t01actrank;
	}

	public String getT01status() {
		return t01status;
	}

	public void setT01status(String t01status) {
		this.t01status = t01status;
	}

	public String getT01persontype() {
		return t01persontype;
	}

	public void setT01persontype(String t01persontype) {
		this.t01persontype = t01persontype;
	}

	public deptEntity getDeptEntity() {
		return deptEntity;
	}

	public void setDeptEntity(deptEntity deptEntity) {
		this.deptEntity = deptEntity;
	}

	public zcPidtraceEntity getZcPidtraceEntity() {
		return zcPidtraceEntity;
	}

	public void setZcPidtraceEntity(zcPidtraceEntity zcPidtraceEntity) {
		this.zcPidtraceEntity = zcPidtraceEntity;
	}

}
