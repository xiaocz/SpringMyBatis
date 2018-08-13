package com.bocom.bean;

import java.sql.Date;


public class Emp {
	/**
	 * 员工编号
	 */
	private Integer empno;
	/**
	 * 员工姓名
	 */
	private String ename;
	/**
	 * 职位
	 */
	private String job;
	/**
	 * 领导人
	 */
	private String mgr;
	/**
	 * 入职日期
	 */
	private Date hiredate;
	/**
	 * 薪水
	 */
	private Double sal;
	/**
	 * 奖金
	 */
	private Double comm;
	/**
	 * 所在部门号
	 */
	private Integer deptno;
	
	
	/**
	 * @return	the empno
	 */
	public Integer getEmpno() {
		return empno;
	}
	/**
	 * @param empno
	 * 		the empno to set
	 */
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	/**
	 * @return	the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename
	 * 		the ename to set
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	/**
	 * @return	the job
	 */
	public String getJob() {
		return job;
	}
	/**
	 * @param job
	 * 		the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}
	/**
	 * @return	the mgr
	 */
	public String getMgr() {
		return mgr;
	}
	/**
	 * @param mgr
	 * 		the mgr to set
	 */
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	/**
	 * @return	the hiredate
	 */
	public Date getHiredate() {
		return hiredate;
	}
	/**
	 * @param hiredate
	 * 		the hiredate to set
	 */
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	/**
	 * @return	the sal
	 */
	public Double getSal() {
		return sal;
	}
	/**
	 * @param sal
	 * 		the sal to set
	 */
	public void setSal(Double sal) {
		this.sal = sal;
	}
	/**
	 * @return	the comm
	 */
	public Double getComm() {
		return comm;
	}
	/**
	 * @param comm
	 * 		the comm to set
	 */
	public void setComm(Double comm) {
		this.comm = comm;
	}
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job
				+ ", mgr=" + mgr + ", hiredate=" + hiredate + ", sal=" + sal
				+ ", comm=" + comm + ", deptno=" + deptno + "]";
	}
	
}
