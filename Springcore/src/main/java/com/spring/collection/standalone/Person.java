package com.spring.collection.standalone;

import java.util.List;
import java.util.Map;

public class Person {
	
	private List<String> friends;
	
	private Map<String, Integer> courses;

	public List<String> getFriends() {
		return friends;
	}

	public Map<String, Integer> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", courses=" + courses + "]";
	}

	

}
