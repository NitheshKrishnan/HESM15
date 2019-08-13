package edu.jspiders.setterinjectioncollectiontype.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.setterinjectioncollectiontype.beans.ListTypeCollection;

public class ListUtil
{
	public static void main(String[] args) 
	{
		// Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// USe the Bean
		ListTypeCollection l = context.getBean(ListTypeCollection.class);
		
		System.out.println(l);
		
		// Close the Container
		context.close();
	}
}
