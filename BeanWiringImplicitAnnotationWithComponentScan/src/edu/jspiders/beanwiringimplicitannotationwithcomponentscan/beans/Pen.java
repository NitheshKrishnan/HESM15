package edu.jspiders.beanwiringimplicitannotationwithcomponentscan.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen 
{
	@Value("Cello")
	private String brand;
	@Value("Bright")
	private String name;
	@Value("10")
	private double price;
	
	//@Autowired(required=false)
	private Refil refil;

	public Pen() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object created");
	}
	
	@Autowired(required=false)
	public Pen(Refil refil)
	{
		System.out.println(this.getClass().getSimpleName()+" Object created using arg-constructor");
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Refil getRefil() {
		return refil;
	}

	//@Autowired(required=false)
	public void setRefil(Refil refil) {
		this.refil = refil;
	}

	@Override
	public String toString() {
		return "Pen [brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}
}
