package com.sist.vo;

public class GoodsVO {
	private int no;
	private String item;
	private int qty;
	private int price;
	private String fname;
	
	public GoodsVO(int no, String item, int qty, int price, String fname) {
		super();
		this.no = no;
		this.item = item;
		this.qty = qty;
		this.price = price;
		this.fname = fname;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) { 
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public GoodsVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
