package edu.jspiders.beanwiringimplicitannotationwithcomponentscancpu.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Harddisk implements Serializable
{
	@Value("")
	private String brand;
	@Value("")
	private double space;
	@Value("")
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
