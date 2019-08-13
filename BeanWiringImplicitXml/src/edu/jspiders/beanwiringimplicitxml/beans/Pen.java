package edu.jspiders.beanwiringimplicitxml.beans;

public class Pen 
{
	private String brand;
	private String name;
	private int price;
	
	private Refil refil;
	
	public Pen()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	public Pen(Refil refil) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor");
		this.refil = refil;
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

	public Refil getRefil() {
		return refil;
	}

	public void setRefil(Refil refil) {
		this.refil = refil;
	}

	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}
}