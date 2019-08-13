package edu.jspiders.setterinjection.beans;

import java.io.Serializable;

public class Pen implements Serializable
{
	private String brand;
	private String name;
	private int price;
	
	public Pen() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		
		System.out.println("inside setBrand of "+this.getClass().getSimpleName());
		
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		System.out.println("inside setName of "+this.getClass().getSimpleName());
		
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		
		System.out.println("inside setPrice of "+this.getClass().getSimpleName());
		
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}
}