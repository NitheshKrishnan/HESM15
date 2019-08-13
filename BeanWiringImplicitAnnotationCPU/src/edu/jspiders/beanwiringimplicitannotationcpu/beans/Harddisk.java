package edu.jspiders.beanwiringimplicitannotationcpu.beans;

import java.io.Serializable;

public class Harddisk implements Serializable
{
	private String brand;
	private double space;
	private double price;
	
	public Harddisk() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getSpace() {
		return space;
	}

	public void setSpace(double space) {
		this.space = space;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Harddisk [brand=" + brand + ", space=" + space + "TB, price=" + price + "]";
	}
	
	
}
