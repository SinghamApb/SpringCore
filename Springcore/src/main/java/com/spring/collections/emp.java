package com.spring.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;



public class emp {
	
	
	
	private String Name;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> course;
	private Properties props;
	

	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public emp(String name, List<String> phones, Set<String> address, Map<String, String> course) {
		super();
		Name = name;
		this.phones = phones;
		this.address = address;
		this.course = course;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "emp [Name=" + Name + ", phones=" + phones + ", address=" + address + ", course=" + course + "]";
	}
	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
