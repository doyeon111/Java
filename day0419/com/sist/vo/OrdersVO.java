package com.sist.vo;

import java.util.Date;

//�����ͺ��̽� ���̺� Orders�� ��ü�� ǥ���ϱ� ���� Ŭ������ �����.
public class OrdersVO {
	private int orderid, custid, bookid, saleprice;
	private Date orderdate;

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public int getSaleprice() {
		return saleprice;
	}

	public void setSaleprice(int saleprice) {
		this.saleprice = saleprice;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}

	public OrdersVO(int orderid, int custid, int bookid, int saleprice, Date orderdate) {
		super();
		this.orderid = orderid;
		this.custid = custid;
		this.bookid = bookid;
		this.saleprice = saleprice;
		this.orderdate = orderdate;
	}

}
