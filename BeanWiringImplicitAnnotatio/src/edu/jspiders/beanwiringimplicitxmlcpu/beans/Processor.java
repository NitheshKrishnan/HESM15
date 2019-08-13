package edu.jspiders.beanwiringimplicitxmlcpu.beans;

import java.io.Serializable;

public class Processor implements Serializable
{
	private String brand;
	private String speed;
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