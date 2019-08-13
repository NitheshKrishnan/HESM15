package edu.jspiders.setterinjectioncollectiontype.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.setterinjectioncollectiontype.beans.SetTypeCollection;

public class SetUtil
{
	public static void main(String[] args) 
	{
		// Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// USe the Bean
		SetTypeCollection s = context.getBean(SetTypeCollection.class);
		
		System.out.println(s);
		
		// Close the Container
		context.close();
	}
}
