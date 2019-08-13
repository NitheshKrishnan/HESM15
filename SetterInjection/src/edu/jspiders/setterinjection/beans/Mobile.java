package edu.jspiders.setterinjection.beans;

import java.io.Serializable;

public class Mobile implements Serializable
{
	private String serialNumber;
	private String brand;
	private String name;
	private double price;
	
	public Mobile() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [serialNumber=" + serialNumber + ", brand=" + brand + ", name=" + name + ", price=" + price
				+ "]";
	}
}
