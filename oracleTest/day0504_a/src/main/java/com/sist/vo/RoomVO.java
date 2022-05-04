package com.sist.vo;

public class RoomVO {
	private int r_no;
	private String r_type;
	private int fee;
	
	public RoomVO(int r_no, String r_type, int fee) {
		super();
		this.r_no = r_no;
		this.r_type = r_type;
		this.fee = fee;
	}
	public int getR_no() {
		return r_no;
	}
	public void setR_no(int r_no) {
		this.r_no = r_no;
	}
	public String getR_type() {
		return r_type;
	}
	public void setR_type(String r_type) {
		this.r_type = r_type;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public RoomVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
