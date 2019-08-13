package edu.jspiders.beanlifecycledeclarativewayannotation.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.beanlifecycledeclarativewayannotation.beans.ClassA;

public class Util 
{
	public static void main(String[] args)
	{
		// create the container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// use the bean
		ClassA a = context.getBean(ClassA.class);
		
		System.out.println("ClassA --> "+a);
		
		// close the container
		context.close();
		
	}
}
