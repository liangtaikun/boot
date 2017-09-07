package com.taikun.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
* <p>Title: TZcInfoEntity</p>
* <p>Description:职场信息，由Amis系统获得 </p>
* <p>Company:广西人寿信息技术部 </p> 
* @author taikun
* @date 2017年8月1日
 */
@Entity
@Table(name = "zcjb_zcinfo")
public class TZcInfoEntity {
	@Id
	private int zcserno;
	@Column(length = 30,nullable=false)
    private String zcno;
	//职场名称
	@Column(length = 50)
    private String zcname;
	//职场状态
	@Column(length = 4)
    private String status;
	//区域标志
	@Column(length = 4)
    private String areaflag;
	//职场属性
	@Column(length = 4)
    private String zcproperty;

	@JoinColumn(name="bid")
	@ManyToOne
	private branchEntity branchEntity;
	
	public String getZcno() {
		return zcno;
	}
	public void setZcno(String zcno) {
		this.zcno = zcno;
	}
	public String getZcname() {
		return zcname;
	}
	public void setZcname(String zcname) {
		this.zcname = zcname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAreaflag() {
		return areaflag;
	}
	public void setAreaflag(String areaflag) {
		this.areaflag = areaflag;
	}
	public String getZcproperty() {
		return zcproperty;
	}
	public void setZcproperty(String zcproperty) {
		this.zcproperty = zcproperty;
	}
	public branchEntity getBranchEntity() {
		return branchEntity;
	}
	public void setBranchEntity(branchEntity branchEntity) {
		this.branchEntity = branchEntity;
	}

	
}
