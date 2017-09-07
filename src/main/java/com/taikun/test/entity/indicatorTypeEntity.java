package com.taikun.test.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zcjb_indicatortype")
public class indicatorTypeEntity {

	@Id
	@Column(length=8,nullable=false)
	private String indicatorTypeId;
	private String TypeName;
	private int TargetTime;
	@Column(length = 8)
	private String EffDate;
	@Column(length = 8)
	private String  ExpDate;

	public String getIndicatorTypeId() {
		return indicatorTypeId;
	}

	public void setIndicatorTypeId(String indicatorTypeId) {
		this.indicatorTypeId = indicatorTypeId;
	}

	public String getTypeName() {
		return TypeName;
	}

	public void setTypeName(String typeName) {
		TypeName = typeName;
	}

	public int getTargetTime() {
		return TargetTime;
	}

	public void setTargetTime(int targetTime) {
		TargetTime = targetTime;
	}

	public String getEffDate() {
		return EffDate;
	}

	public void setEffDate(String effDate) {
		EffDate = effDate;
	}

	public String getExpDate() {
		return ExpDate;
	}

	public void setExpDate(String expDate) {
		ExpDate = expDate;
	}



}
