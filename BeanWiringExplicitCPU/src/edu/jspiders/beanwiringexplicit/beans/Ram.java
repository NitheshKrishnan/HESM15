package edu.jspiders.beanwiringexplicit.beans;

import java.io.Serializable;

public class Ram implements Serializable
{
	private String brand;
	private double space;
	private double price;
	
	public Ram() 
	{
		
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
	public String toString()
	{
		return "Ram [brand=" + brand + ", space=" + space + "GB, price=" + price + "]";
	}
}
