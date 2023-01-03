package com.spring.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext con= new ClassPathXmlApplicationContext("com/spring/stereotype/annotation/stconfig.xml");
		
	 Student stud1=	con.getBean("studentObj", Student.class);
	 
	 System.out.println(stud1);
		
		
		
	}

}
