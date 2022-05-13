package com.sist.vo;

public class ReservationVO {
	private int rv_no;
	private String checkin;
	private String checkout;
	private int cnt;
	private String rv_phone;
	private int c_no;
	private int r_no;
	private int total;
	private int e_no;
	
	public ReservationVO(int rv_no, String checkin, String checkout, int cnt, String rv_phone, int c_no, int r_no,
			int total, int e_no) {
		super();
		this.rv_no = rv_no;
		this.checkin = checkin;
		this.checkout = checkout;
		this.cnt = cnt;
		this.rv_phone = rv_phone;
		this.c_no = c_no;
		this.r_no = r_no;
		this.total = total;
		this.e_no = e_no;
	}
	
	public int getRv_no() {
		return rv_no;
	}
	public void setRv_no(int rv_no) {
		this.rv_no = rv_no; 
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getRv_phone() {
		return rv_phone;
	}
	public void setRv_phone(String rv_phone) {
		this.rv_phone = rv_phone;
	}
	public int getC_no() {
		return c_no;
	}
	public void setC_no(int c_no) {
		this.c_no = c_no;
	}
	public int getR_no() {
		return r_no;
	}
	public void setR_no(int r_no) {
		this.r_no = r_no;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getE_no() {
		return e_no;
	}
	public void setE_no(int e_no) {
		this.e_no = e_no;
	}
	public ReservationVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
