package com.spring.collection.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
		
		ApplicationContext con= new ClassPathXmlApplicationContext("com/spring/collection/standalone/standconfig.xml");
		Person person1=con.getBean("person1", Person.class);
		System.out.println(person1);
		
		
	}

}
