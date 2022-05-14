package com.sist.vo;

import java.util.Date;

public class EmpVO {
	private int eno;
	private String ename;
	private int dno;
	private int salary;
	private int comm;
	private Date hiredate;
	private String phone;
	private String addr;
	private int mgr;
	private String job;
	private String email;
	private String jumin;
	
	public EmpVO(int eno, String ename, int dno, int salary, int comm, Date hiredate, String phone, String addr,
			int mgr, String job, String email, String jumin) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.dno = dno;
		this.salary = salary;
		this.comm = comm;
		this.hiredate = hiredate;
		this.phone = phone;
		this.addr = addr;
		this.mgr = mgr;
		this.job = job;
		this.email = email;
		this.jumin = jumin;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm; 
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public EmpVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
