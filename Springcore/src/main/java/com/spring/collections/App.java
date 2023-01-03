package com.spring.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	
	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/collections/collectionconfig.xml");
		emp emp1 =(emp)context.getBean("emp1");
		System.out.println(emp1.getName());  
		System.out.println(emp1.getAddress());  
		System.out.println(emp1.getCourse());  
		System.out.println(emp1.getProps());  
		System.out.println(emp1.getPhones());  
	}
	
	
}
