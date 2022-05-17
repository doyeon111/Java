package com.sist.vo;

public class SurveyVO {
	private int no;
	private int grade;
	private String gender, interests, course, leave;
	
	public SurveyVO(int no, int grade, String gender, String interests, String course, String leave) {
		super();
		this.no = no;
		this.grade = grade;
		this.gender = gender;
		this.interests = interests;
		this.course = course;
		this.leave = leave;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getInterests() { 
		return interests;
	}
	public void setInterests(String interests) {
		this.interests = interests;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getLeave() {
		return leave;
	}
	public void setLeave(String leave) {
		this.leave = leave;
	}
	public SurveyVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
