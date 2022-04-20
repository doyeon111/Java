package com.sist.vo;

import java.util.Date;

//데이터베이스 테이블 Orders를 객체로 표현하기 위한 클래스를 만든다.
public class BookVO {
	private int bookid;
	private String bookname; 
	private String publicsher;
	private int price;
	
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPublicsher() {
		return publicsher;
	}
	public void setPublicsher(String publicsher) {
		this.publicsher = publicsher;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price; 
	}
	public BookVO(int bookid, String bookname, String publicsher, int price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.publicsher = publicsher;
		this.price = price;
	}

	

}
