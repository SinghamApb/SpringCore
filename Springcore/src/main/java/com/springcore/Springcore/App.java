package com.springcore.Springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       
      
      Students student1=(Students) context.getBean("student1");
      
      System.out.println(student1);
    
    }
}
