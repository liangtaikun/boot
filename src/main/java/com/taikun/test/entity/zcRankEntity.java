package com.taikun.test.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * <p>
 * Title: zcRankEntity
 * </p>
 * <p>
 * Description: 星级定义实体
 * </p>
 * <p>
 * Company:广西人寿信息技术部
 * </p>
 * 
 * @author taikun
 * @date 2017年8月1日
 */
@Entity
@Table(name = "zcjb_zcrank")
public class zcRankEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String tagetrank;
	private int tagetnum;
	@JoinColumn(name = "indicatorTypeId")
	@ManyToOne(fetch = FetchType.LAZY)
	private indicatorTypeEntity indicatorTypeEntity;
	@JoinColumn(name = "zcserno")
	@OneToOne(fetch = FetchType.LAZY)
	private TZcInfoEntity tZcInfoEntity;

	public int getId() 
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getTagetrank() 
	{
		return tagetrank;
	}

	public void setTagetrank(String tagetrank) 
	{
		this.tagetrank = tagetrank;
	}

	public int getTagetnum()
	{
		return tagetnum;
	}

	public void setTagetnum(int tagetnum) 
	{
		this.tagetnum = tagetnum;
	}

	public indicatorTypeEntity getIndicatorTypeEntity()
	{
		return indicatorTypeEntity;
	}

	public void setIndicatorTypeEntity(indicatorTypeEntity indicatorTypeEntity) 
	{
		this.indicatorTypeEntity = indicatorTypeEntity;
	}

	public TZcInfoEntity gettZcInfoEntity() 
	{
		return tZcInfoEntity;
	}

	public void settZcInfoEntity(TZcInfoEntity tZcInfoEntity) 
	{
		this.tZcInfoEntity = tZcInfoEntity;
	}

}
