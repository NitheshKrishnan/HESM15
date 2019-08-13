package edu.jspiders.springwithoutxmlwithcomponentscan.util;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jspiders.springwithoutxmlwithcomponentscan.config.MyConfigClass;

public class Util
{
	public static void main(String[] args) 
	{
		// Create the container
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(MyConfigClass.class);
		
		// Use the Bean
		
		// close the container
		context.close();
	}
}
