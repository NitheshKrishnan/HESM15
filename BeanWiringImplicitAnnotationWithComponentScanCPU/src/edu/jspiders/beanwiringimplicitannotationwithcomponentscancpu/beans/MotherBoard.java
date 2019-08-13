package edu.jspiders.beanwiringimplicitannotationwithcomponentscancpu.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MotherBoard implements Serializable
{
	@Value("")
	private String brand;
	@Value("")
	private String dimension;
	@Value("")
	private double price;
	
	public MotherBoard()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
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
