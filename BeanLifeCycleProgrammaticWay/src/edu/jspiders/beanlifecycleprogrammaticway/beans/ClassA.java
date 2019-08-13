package edu.jspiders.beanlifecycleprogrammaticway.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ClassA implements InitializingBean,DisposableBean
{
	public ClassA() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	@Override
	public void afterPropertiesSet() throws Exception 
	{
		System.out.println("inside afterPropertiesSet() of "+this.getClass().getSimpleName());
	}

	@Override
	public void destroy() throws Exception 
	{
		System.out.println("inside destroy() of "+this.getClass().getSimpleName());
	}
}
