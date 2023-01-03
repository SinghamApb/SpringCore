package com.spring.constructor;

import java.util.List;

public class Person {
	
	private String name;
	private int personID;
	private Certi certi;
	private List<String> list;
	public Person(String name, int personID, Certi certi, List<String> list) {
		super();
		this.name = name;
		this.personID = personID;
		this.certi = certi;
		this.list = list;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personID=" + personID + ", certi=" + certi + ", list=" + list
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
