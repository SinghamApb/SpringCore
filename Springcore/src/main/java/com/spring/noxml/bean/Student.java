package com.spring.noxml.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
    public Student(int price, Samosa samosa) {
		super();
		this.price = price;
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	
	private int price;
    
    private Samosa samosa;

	public int getName() {
		return price;
	}

	public void setName(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Student [name=" + price + ", samosa=" + samosa + "]";
	}

	
	
}
