package org.poxiao.dao;

public class Student {
	private String stuname;
	private int stuage;
	private int stuno;
	
	public Student() {
	
	}
	
	public Student(String stuname, int stuage, int stuno) {
		this.stuname = stuname;
		this.stuage = stuage;
		this.stuno = stuno;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getStuage() {
		return stuage;
	}
	public void setStuage(int stuage) {
		this.stuage = stuage;
	}
	public int getStuno() {
		return stuno;
	}
	public void setStuno(int stuno) {
		this.stuno = stuno;
	}
	
}
