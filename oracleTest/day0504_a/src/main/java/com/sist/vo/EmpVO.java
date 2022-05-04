package com.sist.vo;

import java.util.Date;

public class EmpVO {
	private int e_no;
	private String e_name;
	private String e_jumin;
	private String e_addr;
	private String e_phone;
	private Date e_hiredate;
	private String e_id;
	private String e_pwd;
	private int e_salary;
	private int dno;
	public EmpVO(int e_no, String e_name, String e_jumin, String e_addr, String e_phone, Date e_hiredate, String e_id,
			String e_pwd, int e_salary, int dno) {
		super();
		this.e_no = e_no;
		this.e_name = e_name;
		this.e_jumin = e_jumin;
		this.e_addr = e_addr;
		this.e_phone = e_phone;
		this.e_hiredate = e_hiredate;
		this.e_id = e_id;
		this.e_pwd = e_pwd;
		this.e_salary = e_salary;
		this.dno = dno;
	}
	public int getE_no() {
		return e_no;
	}
	public void setE_no(int e_no) {
		this.e_no = e_no;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public String getE_jumin() {
		return e_jumin;
	}
	public void setE_jumin(String e_jumin) {
		this.e_jumin = e_jumin;
	}
	public String getE_addr() {
		return e_addr;
	}
	public void setE_addr(String e_addr) {
		this.e_addr = e_addr;
	}
	public String getE_phone() {
		return e_phone;
	}
	public void setE_phone(String e_phone) {
		this.e_phone = e_phone;
	}
	public Date getE_hiredate() {
		return e_hiredate;
	}
	public void setE_hiredate(Date e_hiredate) {
		this.e_hiredate = e_hiredate;
	}
	public String getE_id() {
		return e_id;
	}
	public void setE_id(String e_id) {
		this.e_id = e_id;
	}
	public String getE_pwd() {
		return e_pwd;
	}
	public void setE_pwd(String e_pwd) {
		this.e_pwd = e_pwd;
	}
	public int getE_salary() {
		return e_salary;
	}
	public void setE_salary(int e_salary) {
		this.e_salary = e_salary;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public EmpVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
