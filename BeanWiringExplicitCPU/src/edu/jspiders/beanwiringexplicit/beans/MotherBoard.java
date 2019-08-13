package edu.jspiders.beanwiringexplicit.beans;

import java.io.Serializable;

public class MotherBoard implements Serializable
{
	private String brand;
	private String dimension;
	private double price;
	
	public MotherBoard()
	{
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MotherBoard [brand=" + brand + ", dimension=" + dimension + ", price=" + price + "]";
	}
}
