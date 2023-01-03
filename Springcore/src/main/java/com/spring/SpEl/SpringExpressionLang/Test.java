package com.spring.SpEl.SpringExpressionLang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args)
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/SpEl/SpringExpressionLang/exprconfig.xml");
	    Demo d1=context.getBean("demo", Demo.class);
		
	    System.out.println(d1);
		
	}
	
	
}
