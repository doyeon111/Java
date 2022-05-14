package com.sist.vo;

public class MemberVO {
	private String id, pwd, name, self;

	public MemberVO(String id, String pwd, String name, String self) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.self = self;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
}
