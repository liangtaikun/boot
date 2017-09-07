package com.taikun.test.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * <p>
 * Title: branchEntity
 * </p>
 * <p>
 * Description: 机构表
 * </p>
 * <p>
 * Company:广西人寿信息技术部
 * </p>
 * 
 * @author taikun
 * @date 2017年8月2日
 */
@Entity
@Table(name="zcjb_branch")
public class branchEntity {

	@Id
	@Column(length = 6)
	private String bid;
	private String brhname;
	private String brhlevelNo;
	private String Upbid;
	private String status;
	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBrhname() {
		return brhname;
	}

	public void setBrhname(String brhname) {
		this.brhname = brhname;
	}

	public String getBrhlevelNo() {
		return brhlevelNo;
	}

	public void setBrhlevelNo(String brhlevelNo) {
		this.brhlevelNo = brhlevelNo;
	}

	public String getUpbid() {
		return Upbid;
	}

	public void setUpbid(String upbid) {
		Upbid = upbid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
