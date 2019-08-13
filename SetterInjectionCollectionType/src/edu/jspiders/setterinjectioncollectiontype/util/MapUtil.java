package edu.jspiders.setterinjectioncollectiontype.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.setterinjectioncollectiontype.beans.MapType;

public class MapUtil
{
	public static void main(String[] args) 
	{
		// Create the Container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// USe the Bean
		MapType map = context.getBean(MapType.class);
		
		System.out.println(map);
		
		// Close the Container
		context.close();
	}
}
