package edu.jspiders.beanwiringimplicitxmlcpu.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.beanwiringimplicitxmlcpu.beans.CPU;

public class BeanWiringExplicitUtil 
{
	public static void main(String[] args) 
	{
		// Create the container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Use the Bean
		CPU cpu = context.getBean(CPU.class);
		
		System.out.println("CPU Info");
		System.out.println("--------");
		System.out.println(cpu);
		
		// close the container
		context.close();
	}
}
