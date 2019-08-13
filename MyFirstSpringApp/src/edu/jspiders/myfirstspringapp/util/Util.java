package edu.jspiders.myfirstspringapp.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.myfirstspringapp.beans.ClassA;
import edu.jspiders.myfirstspringapp.beans.ClassB;

public class Util 
{
	public static void main(String[] args) 
	{
		// Create the container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		
		// Use the Bean
		ClassA classA = (ClassA) context.getBean("a");
		ClassB classB = (ClassB) context.getBean("b");
		
		System.out.println(classA);
		classA.m1();
		
		System.out.println(classB);
		classB.m1();
		
		// Close the Container
		context.close();
	}
}
