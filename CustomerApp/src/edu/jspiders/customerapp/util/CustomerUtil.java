package edu.jspiders.customerapp.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jspiders.customerapp.beans.Customer;

public class CustomerUtil 
{
	public static void main(String[] args) 
	{
		// Create the container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("springconfig.xml");
		
		// Use the Bean
		Customer customer = context.getBean(Customer.class);
		
		customer.action(2);
		
		// close the container
		context.close();
	}
}
