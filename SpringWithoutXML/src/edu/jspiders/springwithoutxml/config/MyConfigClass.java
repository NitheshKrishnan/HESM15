package edu.jspiders.springwithoutxml.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.jspiders.springwithoutxml.beans.ClassA;
import edu.jspiders.springwithoutxml.beans.ClassB;
import edu.jspiders.springwithoutxml.beans.ClassC;

@Configuration
public class MyConfigClass
{
	@Bean
	public ClassA getClassA()
	{
		return new ClassA();
	}
	
	@Bean
	public ClassB getClassB()
	{
		return new ClassB();
	}
	
	@Bean
	public ClassC getClassC()
	{
		return new ClassC();
	}
}
