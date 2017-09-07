package com.taikun.test.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
* <p>Title: deptEntity</p>
* <p>Description:部门实体 </p>
* <p>Company:广西人寿信息技术部 </p> 
* @author taikun
* @date 2017年8月2日
 */
@Entity
@Table(name = "zcjb_dept")
public class deptEntity {
	@Id
	@Column(length = 12)
    private String did;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "startDate")
	private Date startDate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "endDate")
	private Date endDate;
	private String deptname;
    private String status;
    @JoinColumn(name="bid")
    @OneToOne(fetch=FetchType.EAGER)
    private branchEntity branchEntity;
 
	public String getDid() {
		return did;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public branchEntity getBranchEntity() {
		return branchEntity;
	}
	public void setBranchEntity(branchEntity branchEntity) {
		this.branchEntity = branchEntity;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}


    
    
}
