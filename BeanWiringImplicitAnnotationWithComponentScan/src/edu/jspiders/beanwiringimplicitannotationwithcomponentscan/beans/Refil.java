package edu.jspiders.beanwiringimplicitannotationwithcomponentscan.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Refil 
{
	@Value("Reynolds")
	private String brand;
	@Value("Dummy")
	private String name;
	@Value("2")
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