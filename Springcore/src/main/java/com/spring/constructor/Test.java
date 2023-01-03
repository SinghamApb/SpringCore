package com.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	
	public static void main(String[] args) {
		
	 ApplicationContext context=	new ClassPathXmlApplicationContext("com/spring/constructor/constConfig.xml");
	Person  per=(Person)context.getBean("Person1");
		
	 System.out.println(per);
	}

}
