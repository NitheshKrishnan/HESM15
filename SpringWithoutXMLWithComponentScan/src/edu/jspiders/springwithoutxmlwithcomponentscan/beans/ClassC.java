package edu.jspiders.springwithoutxmlwithcomponentscan.beans;

import org.springframework.stereotype.Component;

@Component
public class ClassC 
{
	public ClassC() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
}
