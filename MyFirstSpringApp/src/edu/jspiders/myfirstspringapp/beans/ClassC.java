package edu.jspiders.myfirstspringapp.beans;

public class ClassC 
{
	public ClassC() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	public void m1()
	{
		System.out.println("Inside m1() of "+this.getClass().getSimpleName());
	}
}
