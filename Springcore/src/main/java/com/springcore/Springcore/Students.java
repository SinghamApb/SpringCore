package com.springcore.Springcore;

public class Students {

	private int studentID;
	private String studentName;
	private String studentAddress;
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Students [studentID=" + studentID + ", studentName=" + studentName + ", studentAddress="
				+ studentAddress + "]";
	}
	
	
	
	
	
}

