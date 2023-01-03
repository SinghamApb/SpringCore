package com.spring.noxml.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student st= context.getBean("student", Student.class);
		System.out.println(st);
		
	}
	
	
}

