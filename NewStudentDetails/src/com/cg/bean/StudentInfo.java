package com.cg.bean;

public class StudentInfo {
	private int sid;
	private String subname;
	private int theory;
	private int prac;
	private int lab;
	private int totalscore;
	private String grade;
	
	
	
	
	public int getSid() {
		return sid;
	}




	public void setSid(int sid) {
		this.sid = sid;
	}




	public String getSubname() {
		return subname;
	}




	public void setSubname(String subname) {
		this.subname = subname;
	}




	public int getTheory() {
		return theory;
	}




	public void setTheory(int theory) {
		this.theory = theory;
	}




	public int getPrac() {
		return prac;
	}




	public void setPrac(int prac) {
		this.prac = prac;
	}




	public int getLab() {
		return lab;
	}




	public void setLab(int lab) {
		this.lab = lab;
	}




	public int getTotalscore() {
		return totalscore;
	}




	public void setTotalscore(int totalscore) {
		this.totalscore = totalscore;
	}




	public String getGrade() {
		return grade;
	}




	public void setGrade(String grade) {
		this.grade = grade;
	}




	public StudentInfo() {
		
	}




	public StudentInfo(int studentid) {
		
	}




	public StudentInfo(int sid, String subname, int totalscore, String grade) {
		super();
		this.sid = sid;
		this.subname = subname;
		this.totalscore = totalscore;
		this.grade = grade;
	}




	public StudentInfo(int sid, String subname, int totalscore, String grade) {
		super();
		this.sid = sid;
		this.subname = subname;
		this.totalscore = totalscore;
		this.grade = grade;
	}




	
	
	
}	