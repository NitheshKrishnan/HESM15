package edu.jspiders.beanwiringexplicit.beans;

import java.io.Serializable;

public class Address implements Serializable
{
	private int doorNo;
	private String apartmentName;
	private String street;
	private String locality;
	private int pincode;
	
	public Address()
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using no-arg Constructor");
	}
	
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getApartmentName() {
		return apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", apartmentName=" + apartmentName + ", street=" + street + ", locality="
				+ locality + ", pincode=" + pincode + "]";
	}
}
