package edu.jspiders.beanwiringexplicit.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.beanwiringexplicit.beans.Student;

public class BeanWiringExplicitUtil 
{
	public static void main(String[] args) 
	{
		// Create the container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Use the Bean
		
		Student s = context.getBean(Student.class);
		
		System.out.println("Student Info");
		System.out.println("------------");
		System.out.println(s);
		System.out.println("------------");
		System.out.println("Student Address");
		System.out.println("---------------");
		System.out.println(s.getAddr());
		
		
		// close the container
		context.close();
	}
}
