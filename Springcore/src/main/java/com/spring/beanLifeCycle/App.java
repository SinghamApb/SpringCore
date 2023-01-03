package com.spring.beanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/beanLifeCycle/config.xml");
		empl emp=(empl)context.getBean("emp");
		
		System.out.println(emp.getEmpID());
		
		context.registerShutdownHook();
		
		 UsingInterfaceExample inf= (UsingInterfaceExample)context.getBean("pepsi1");
		 
		 System.out.println(inf);
		
	
		
		
		
		
	}
	
	
}
