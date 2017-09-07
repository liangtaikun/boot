package com.taikun.test.entity;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * <p>
 * Title: zcPidtraceEntity
 * </p>
 * <p>
 * Description: 操作员职场轨迹表
 * </p>
 * <p>
 * Company:广西人寿信息技术部
 * </p>
 * 
 * @author taikun
 * @date 2017年8月3日
 */
@Entity
@Table(name = "zcjb_zcpidtrace")
public class zcPidtraceEntity {
    
	@Id
    @Column(length = 14, unique = true)
    private String pid;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "startdate")
	private Date startdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "enddate")
	private Date enddate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "zcserno")
	private TZcInfoEntity tZcInfoEntity;
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private T01PsnEntity t01PsnEntity;
	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public TZcInfoEntity gettZcInfoEntity() {
		return tZcInfoEntity;
	}

	public void settZcInfoEntity(TZcInfoEntity tZcInfoEntity) {
		this.tZcInfoEntity = tZcInfoEntity;
	}

	public T01PsnEntity getT01PsnEntity() {
		return t01PsnEntity;
	}

	public void setT01PsnEntity(T01PsnEntity t01PsnEntity) {
		this.t01PsnEntity = t01PsnEntity;
	}



   

}
