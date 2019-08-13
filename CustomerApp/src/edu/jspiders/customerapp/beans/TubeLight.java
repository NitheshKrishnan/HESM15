package edu.jspiders.customerapp.beans;

import org.springframework.stereotype.Component;

@Component
public class TubeLight implements Light
{
	public TubeLight() 
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
