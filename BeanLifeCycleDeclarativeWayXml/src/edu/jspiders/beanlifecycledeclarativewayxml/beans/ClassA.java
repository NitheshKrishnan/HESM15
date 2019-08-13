package edu.jspiders.beanlifecycledeclarativewayxml.beans;

public class ClassA
{
	public ClassA() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public void myOwnInitialization()
	{
		System.out.println("inside myOwnInitialization() of "+this.getClass().getSimpleName());
	}

	public void myOwnDestroy()
	{
		System.out.println("inside myOwnDestroy() of "+this.getClass().getSimpleName());
	}
}
