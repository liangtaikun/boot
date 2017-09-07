package com.taikun.test.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * 
* <p>Title: OpInfoEntity</p>
* <p>Description:操作员信息实体类 </p>
* <p>Company:广西人寿信息技术部 </p> 
* @author taikun
* @date 2017年7月7日
 */
@Entity
@Table(name = "zcjb_opinfo")
public class OpInfoEntity {
	
    @Id
    private String pid;
	@Column
	private int OP_Type;
	@Column(length = 12)
	private String OP_Group;
	@Column
	private int OP_State;
	private Date OP_ExpDate;
	private Date OP_UpDate;
	@Column(length = 14)
	private String OP_RecordUser;
	@Column
	private int OP_Permissions;
	private String Op_btupcity;
	private String Op_btcity;
	private String Op_name;
	private String Op_personid;  //操作员身份证号
	private String Op_zctrank;   //操作员职级
	private String Op_btzc;
    @OneToMany(fetch=FetchType.EAGER,mappedBy="OpInfoEntity")
    private List<indexDataEntity> indexDataEntity;

	public int getOP_Type() {
		return OP_Type;
	}
	public void setOP_Type(int oP_Type) {
		OP_Type = oP_Type;
	}
	public String getOP_Group() {
		return OP_Group;
	}
	public void setOP_Group(String oP_Group) {
		OP_Group = oP_Group;
	}
	public int getOP_State() {
		return OP_State;
	}
	public void setOP_State(int oP_State) {
		OP_State = oP_State;
	}
	public Date getOP_ExpDate() {
		return OP_ExpDate;
	}
	public void setOP_ExpDate(Date oP_ExpDate) {
		OP_ExpDate = oP_ExpDate;
	}
	public Date getOP_UpDate() {
		return OP_UpDate;
	}
	public void setOP_UpDate(Date oP_UpDate) {
		OP_UpDate = oP_UpDate;
	}
	public String getOP_RecordUser() {
		return OP_RecordUser;
	}
	public void setOP_RecordUser(String oP_RecordUser) {
		OP_RecordUser = oP_RecordUser;
	}
	public int getOP_Permissions() {
		return OP_Permissions;
	}
	public void setOP_Permissions(int oP_Permissions) {
		OP_Permissions = oP_Permissions;
	}
	public String getOp_btupcity() {
		return Op_btupcity;
	}
	public void setOp_btupcity(String op_btupcity) {
		Op_btupcity = op_btupcity;
	}
	public String getOp_btcity() {
		return Op_btcity;
	}
	public void setOp_btcity(String op_btcity) {
		Op_btcity = op_btcity;
	}
	public String getOp_name() {
		return Op_name;
	}
	public void setOp_name(String op_name) {
		Op_name = op_name;
	}
	public String getOp_personid() {
		return Op_personid;
	}
	public void setOp_personid(String op_personid) {
		Op_personid = op_personid;
	}
	public String getOp_zctrank() {
		return Op_zctrank;
	}
	public void setOp_zctrank(String op_zctrank) {
		Op_zctrank = op_zctrank;
	}
	public String getOp_btzc() {
		return Op_btzc;
	}
	public void setOp_btzc(String op_btzc) {
		Op_btzc = op_btzc;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public List<indexDataEntity> getIndexDataEntity() {
		return indexDataEntity;
	}
	public void setIndexDataEntity(List<indexDataEntity> indexDataEntity) {
		this.indexDataEntity = indexDataEntity;
	}

}
