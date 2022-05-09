package com.sist.vo;

public class ScoreVO {
	private String name;
	private int html;
	private int css;
	
	public ScoreVO(String name, int html, int css) {
		super();
		this.name = name;
		this.html = html;
		this.css = css;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getCss() {
		return css;
	}
	public void setCss(int css) {
		this.css = css;
	}
	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
