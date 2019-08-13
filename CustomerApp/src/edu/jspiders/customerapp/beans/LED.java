package edu.jspiders.customerapp.beans;

import org.springframework.stereotype.Component;

@Component
public class LED implements Light
{
	public LED() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	@Override
	public void on() {
		System.out.println(this.getClass().getSimpleName()+ " On");
	}

	@Override
	public void off() {
		System.out.println(this.getClass().getSimpleName()+ " Off");
	}
}
