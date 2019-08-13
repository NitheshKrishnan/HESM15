package edu.jspiders.beanwiringexplicit.beans;

import java.io.Serializable;

public class Student implements Serializable
{
	private int id;
	private String name;
	private double marks;
	
	private Address addr;

	public Student()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using no-arg Constructor");
	}
	
	public Student(int id, String name, double marks, Address addr)
	{
		
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg Constructor");
		
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}
