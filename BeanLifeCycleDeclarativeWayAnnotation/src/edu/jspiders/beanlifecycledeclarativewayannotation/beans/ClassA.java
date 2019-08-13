package edu.jspiders.beanlifecycledeclarativewayannotation.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class ClassA
{
	public ClassA() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	@PostConstruct
	public void myOwnInitialization()
	{
		System.out.println("inside myOwnInitialization() of "+this.getClass().getSimpleName());
	}

	@PreDestroy
	public void myOwnDestroy()
	{
		System.out.println("inside myOwnDestroy() of "+this.getClass().getSimpleName());
	}
}
