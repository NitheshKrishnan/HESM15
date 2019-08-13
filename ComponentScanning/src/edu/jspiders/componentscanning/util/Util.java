package edu.jspiders.componentscanning.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.componentscanning.beans.ClassA;
import edu.jspiders.componentscanning.beans.ClassB;
import edu.jspiders.componentscanning.beans.ClassC;

public class Util 
{
	public static void main(String[] args) 
	{
		// Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Use the Bean
		ClassA a = context.getBean(ClassA.class);
		ClassB b = context.getBean(ClassB.class);
		
		System.out.println(a);
		System.out.println(b);
		
		ClassC c = context.getBean(ClassC.class);
		
		System.out.println(c);
		
		// close the container
		context.close();
	}
}
