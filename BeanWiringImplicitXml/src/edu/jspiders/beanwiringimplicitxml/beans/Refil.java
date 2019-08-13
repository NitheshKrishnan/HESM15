package edu.jspiders.beanwiringimplicitxml.beans;

public class Refil 
{
	private String brand;
	private String name;
	private int price;
	
	public Refil()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Refil [brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}
}