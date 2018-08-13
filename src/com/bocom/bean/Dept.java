package com.bocom.bean;

import java.sql.Timestamp;

public class Dept {
	/**
	 * 部门编号
	 */
	private Integer deptno;
	/**
	 * 部门名称
	 */
	private String dname;
	/**
	 * 所在地
	 */
	private String location;
	/**
	 * 创建时间
	 */
	private Timestamp createtime;
	/**
	 * 创建人
	 */
	private String creator;
	/**
	 * 状态
	 */
	private String status;
	/**
	 * 描述
	 */
	private String comments;
	/**
	 * @return	the deptno
	 */
	public Integer getDeptno() {
		return deptno;
	}
	/**
	 * @param deptno
	 * 		the deptno to set
	 */
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	/**
	 * @return	the dname
	 */
	public String getDname() {
		return dname;
	}
	/**
	 * @param dname
	 * 		the dname to set
	 */
	public void setDname(String dname) {
		this.dname = dname;
	}
	/**
	 * @return	the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location
	 * 		the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return	the createtime
	 */
	public Timestamp getCreatetime() {
		return createtime;
	}
	/**
	 * @param createtime
	 * 		the createtime to set
	 */
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	/**
	 * @return	the creator
	 */
	public String getCreator() {
		return creator;
	}
	/**
	 * @param creator
	 * 		the creator to set
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}
	/**
	 * @return	the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status
	 * 		the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return	the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments
	 * 		the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", location="
				+ location + ", createtime=" + createtime + ", creator="
				+ creator + ", status=" + status + ", comments=" + comments
				+ "]";
	}
	
}
