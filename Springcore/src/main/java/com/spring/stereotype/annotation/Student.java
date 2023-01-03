package com.spring.stereotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentObj")

//@Scope("we can use singleton, protype" it denotes what type of object should java create)
public class Student {
	@Value("Tushar")
	private String studentName;
	@Value("Delhi")
	private String studentCity;
	
	@Value("#{friendsID}")
	private List<String> friends;
	
	
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentCity=" + studentCity + ", friends=" + friends + "]";
	}
	

}
