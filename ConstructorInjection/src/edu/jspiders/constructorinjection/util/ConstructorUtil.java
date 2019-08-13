package edu.jspiders.constructorinjection.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.constructorinjection.beans.Mobile;

public class ConstructorUtil 
{
	public static void main(String[] args) 
	{
		// Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Use the Bean
		/*Mobile m1 = context.getBean(Mobile.class);*/
		
		Mobile m1 = context.getBean("m1", Mobile.class);
		Mobile m2 = context.getBean("m2", Mobile.class);
		Mobile m3 = context.getBean("m3", Mobile.class);
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		// close the container
		context.close();
	}
}
