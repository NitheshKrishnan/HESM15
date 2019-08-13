package edu.jspiders.beanwiringimplicitannotationwithcomponentscancpu.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Processor implements Serializable
{
	@Value("")
	private String brand;
	@Value("")
	private String speed;
	@Value("")
	private double price;
	
	public Processor()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", speed=" + speed + ", price=" + price + "]";
	}
}