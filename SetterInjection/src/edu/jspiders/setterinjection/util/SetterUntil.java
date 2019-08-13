package edu.jspiders.setterinjection.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.setterinjection.beans.Pen;

public class SetterUntil 
{
	public static void main(String[] args) 
	{
		// Create the Container
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Use the Beans
		Pen p1 = (Pen) context.getBean("pen1");
		Pen p2 = (Pen) context.getBean("pen2");
		
		System.out.println("Pen p1 --> "+p1);
		System.out.println("Pen p2 --> "+p2);
		
		// CLose the Container
		context.close();
	}
}
