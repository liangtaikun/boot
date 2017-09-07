package com.taikun.test.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * 
* <p>Title: indexData</p>
* <p>Description:指标数据采集信息实体 </p>
* <p>Company:广西人寿信息技术部 </p> 
* @author taikun
* @date 2017年7月19日
 */
@Entity
@Table(name="zcjb_indexdata")
public class indexDataEntity {
	
	@Id
	@Column(length = 21,unique=true)
	private String indexDataId;
	private int completionsTiem;
	private Date insertDate;
	private Date updateDate;
	@Column(length=10)
	private String tjPeriod;
	@Column(length=4)
	private String tjyear;
	@Column(length=2)
	private String zbflag;
	@Column(length=1)
	private String btgroup;
	@JoinColumn(name = "pid")
	@ManyToOne
	private OpInfoEntity OpInfoEntity;
	@JoinColumn(name="indicatorTypeId")
	@ManyToOne(fetch = FetchType.EAGER)
	private indicatorTypeEntity indicatorTypeEntity;
	
	public String getIndexDataId() {
		return indexDataId;
	}
	public void setIndexDataId(String indexDataId) {
		this.indexDataId = indexDataId;
	}

	public int getCompletionsTiem() {
		return completionsTiem;
	}
	public void setCompletionsTiem(int completionsTiem) {
		this.completionsTiem = completionsTiem;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getTjPeriod() {
		return tjPeriod;
	}
	public void setTjPeriod(String tjPeriod) {
		this.tjPeriod = tjPeriod;
	}
	public String getTjyear() {
		return tjyear;
	}
	public void setTjyear(String tjyear) {
		this.tjyear = tjyear;
	}
	public String getZbflag() {
		return zbflag;
	}
	public void setZbflag(String zbflag) {
		this.zbflag = zbflag;
	}
	
	public String getBtgroup() {
		return btgroup;
	}
	public void setBtgroup(String btgroup) {
		this.btgroup = btgroup;
	}
	public indicatorTypeEntity getIndicatorTypeEntity() {
		return indicatorTypeEntity;
	}
	public void setIndicatorTypeEntity(indicatorTypeEntity indicatorTypeEntity) {
		this.indicatorTypeEntity = indicatorTypeEntity;
	}
	public OpInfoEntity getOpInfoEntity() {
		return OpInfoEntity;
	}
	public void setOpInfoEntity(OpInfoEntity opInfoEntity) {
		OpInfoEntity = opInfoEntity;
	}
	
	
}
