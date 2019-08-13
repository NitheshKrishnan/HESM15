package edu.jspiders.constructorinjection.beans;

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
	
	public Mobile(String serialNumber, String brand, String name, double price)
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor(SN,Br,N,P)");
		
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}

	public Mobile(String serialNumber,double price, String brand, String name)
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor(SN,P,Br,N)");
		
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	public Mobile(double price,String serialNumber, String brand, String name)
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor(P,SN,Br,N)");
		
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.name = name;
		this.price = price;
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
