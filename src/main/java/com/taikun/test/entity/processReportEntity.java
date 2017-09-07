package com.taikun.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zcjb_processreport")
public class processReportEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pid;
	private String typeid1;
	private int typeid21_num;
	private int typeid1_tagnum;
	private String typeid1_reachrate;
	private String typeid2;
	private int typeid2_num;
	private int typeid2_tagnum;
	private String typeid2_reachrate;
	private String typeid3;
	private int typeid3_num;
	private int typeid3_tagnum;
	private String typeid3_reachrate;
	private String typeid4;
	private int typeid4_num;
	private int typeid4_tagnum;
	private String typeid4_reachrate;
	private String typeid5;
	private int typeid5_num;
	private int typeid5_tagnum;
	private String typeid5_reachrate;
	private String typeid6;
	private int typeid6_num;
	private int typeid6_tagnum;
	private String typeid6_reachrate;
	private String btgroup;
	private String tjPeriod;
	private String tjyear;
   
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getTypeid1() {
		return typeid1;
	}

	public void setTypeid1(String typeid1) {
		this.typeid1 = typeid1;
	}

	public int getTypeid21_num() {
		return typeid21_num;
	}

	public void setTypeid21_num(int typeid21_num) {
		this.typeid21_num = typeid21_num;
	}

	public int getTypeid1_tagnum() {
		return typeid1_tagnum;
	}

	public void setTypeid1_tagnum(int typeid1_tagnum) {
		this.typeid1_tagnum = typeid1_tagnum;
	}

	public String getTypeid1_reachrate() {
		return typeid1_reachrate;
	}

	public void setTypeid1_reachrate(String typeid1_reachrate) {
		this.typeid1_reachrate = typeid1_reachrate;
	}

	public String getTypeid2() {
		return typeid2;
	}

	public void setTypeid2(String typeid2) {
		this.typeid2 = typeid2;
	}

	public int getTypeid2_num() {
		return typeid2_num;
	}

	public void setTypeid2_num(int typeid2_num) {
		this.typeid2_num = typeid2_num;
	}

	public int getTypeid2_tagnum() {
		return typeid2_tagnum;
	}

	public void setTypeid2_tagnum(int typeid2_tagnum) {
		this.typeid2_tagnum = typeid2_tagnum;
	}

	public String getTypeid2_reachrate() {
		return typeid2_reachrate;
	}

	public void setTypeid2_reachrate(String typeid2_reachrate) {
		this.typeid2_reachrate = typeid2_reachrate;
	}

	public String getTypeid3() {
		return typeid3;
	}

	public void setTypeid3(String typeid3) {
		this.typeid3 = typeid3;
	}

	public int getTypeid3_num() {
		return typeid3_num;
	}

	public void setTypeid3_num(int typeid3_num) {
		this.typeid3_num = typeid3_num;
	}

	public int getTypeid3_tagnum() {
		return typeid3_tagnum;
	}

	public void setTypeid3_tagnum(int typeid3_tagnum) {
		this.typeid3_tagnum = typeid3_tagnum;
	}

	public String getTypeid3_reachrate() {
		return typeid3_reachrate;
	}

	public void setTypeid3_reachrate(String typeid3_reachrate) {
		this.typeid3_reachrate = typeid3_reachrate;
	}

	public String getTypeid4() {
		return typeid4;
	}

	public void setTypeid4(String typeid4) {
		this.typeid4 = typeid4;
	}

	public int getTypeid4_num() {
		return typeid4_num;
	}

	public void setTypeid4_num(int typeid4_num) {
		this.typeid4_num = typeid4_num;
	}

	public int getTypeid4_tagnum() {
		return typeid4_tagnum;
	}

	public void setTypeid4_tagnum(int typeid4_tagnum) {
		this.typeid4_tagnum = typeid4_tagnum;
	}

	public String getTypeid4_reachrate() {
		return typeid4_reachrate;
	}

	public void setTypeid4_reachrate(String typeid4_reachrate) {
		this.typeid4_reachrate = typeid4_reachrate;
	}

	public String getTypeid5() {
		return typeid5;
	}

	public void setTypeid5(String typeid5) {
		this.typeid5 = typeid5;
	}

	public int getTypeid5_num() {
		return typeid5_num;
	}

	public void setTypeid5_num(int typeid5_num) {
		this.typeid5_num = typeid5_num;
	}

	public int getTypeid5_tagnum() {
		return typeid5_tagnum;
	}

	public void setTypeid5_tagnum(int typeid5_tagnum) {
		this.typeid5_tagnum = typeid5_tagnum;
	}

	public String getTypeid5_reachrate() {
		return typeid5_reachrate;
	}

	public void setTypeid5_reachrate(String typeid5_reachrate) {
		this.typeid5_reachrate = typeid5_reachrate;
	}

	public String getTypeid6() {
		return typeid6;
	}

	public void setTypeid6(String typeid6) {
		this.typeid6 = typeid6;
	}

	public int getTypeid6_num() {
		return typeid6_num;
	}

	public void setTypeid6_num(int typeid6_num) {
		this.typeid6_num = typeid6_num;
	}

	public int getTypeid6_tagnum() {
		return typeid6_tagnum;
	}

	public void setTypeid6_tagnum(int typeid6_tagnum) {
		this.typeid6_tagnum = typeid6_tagnum;
	}

	public String getTypeid6_reachrate() {
		return typeid6_reachrate;
	}

	public void setTypeid6_reachrate(String typeid6_reachrate) {
		this.typeid6_reachrate = typeid6_reachrate;
	}

	public String getBtgroup() {
		return btgroup;
	}

	public void setBtgroup(String btgroup) {
		this.btgroup = btgroup;
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

}
