package edu.jspiders.beanwiringimplicitannotation.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.beanwiringimplicitannotation.beans.Pen;

public class BeanWiringImplicitUtil
{
	public static void main(String[] args) 
	{
		// Create the container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		// use the bean
		Pen p = context.getBean(Pen.class);
		
		System.out.println(p);
		System.out.println(p.getRefil());
		
		// close the container
		context.close();
	}
}
