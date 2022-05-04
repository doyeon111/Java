package com.sist.vo;

public class CustomerVO {
	private int c_no;
	private String c_name;
	private String c_jumin;
	private String c_addr;
	private String c_type;
	private String c_phone;
	private String c_email;
	public CustomerVO(int c_no, String c_name, String c_jumin, String c_addr, String c_type, String c_phone,
			String c_email) {
		super();
		this.c_no = c_no;
		this.c_name = c_name;
		this.c_jumin = c_jumin;
		this.c_addr = c_addr;
		this.c_type = c_type;
		this.c_phone = c_phone;
		this.c_email = c_email;
	}
	public int getC_no() {
		return c_no;
	}
	public void setC_no(int c_no) {
		this.c_no = c_no;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_jumin() {
		return c_jumin;
	}
	public void setC_jumin(String c_jumin) {
		this.c_jumin = c_jumin;
	}
	public String getC_addr() {
		return c_addr;
	}
	public void setC_addr(String c_addr) {
		this.c_addr = c_addr;
	}
	public String getC_type() {
		return c_type;
	}
	public void setC_type(String c_type) {
		this.c_type = c_type;
	}
	public String getC_phone() {
		return c_phone;
	}
	public void setC_phone(String c_phone) {
		this.c_phone = c_phone;
	}
	public String getC_email() {
		return c_email;
	}
	public void setC_email(String c_email) {
		this.c_email = c_email;
	}
	public CustomerVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
