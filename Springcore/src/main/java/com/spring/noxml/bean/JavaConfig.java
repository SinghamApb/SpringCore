package com.spring.noxml.bean;

import org.springframework.context.annotation.Bean;

public class JavaConfig {
	
	@Bean
	public Samosa samosa() {
		
		Samosa samosa= new Samosa();
		return samosa;
	}
	

	@Bean
	public Student getStudent() {
		
		Student student= new Student(12,samosa());
		
		return student;
		
	}
	
}
