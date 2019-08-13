package edu.jspiders.customerapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer 
{
	@Autowired
	@Qualifier("tubeLight")
	private Light light;
	
	public Customer() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	public void action(int choice)
	{
		if(light!= null)
		{
			if(choice == 1)
				light.on();
			
			else if(choice == 2)
				light.off();
			
			else System.out.println("Wrong Choice");
		}
	}

	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}
}
