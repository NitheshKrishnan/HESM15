package edu.jspiders.componentscanning.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ClassC 
{
	public ClassC() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
}
