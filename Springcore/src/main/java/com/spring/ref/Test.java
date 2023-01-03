package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
	ApplicationContext context=	new ClassPathXmlApplicationContext("com/spring/ref/refConfig.xml");
	
    A a=(A)context.getBean("Aref");
	System.out.println(a.getX()+" " + a.getOb().getY());	
		
		
	}

}
