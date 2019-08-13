package edu.jspiders.beanwiringimplicitxmlcpu.beans;

import java.io.Serializable;

public class CPU implements Serializable
{
	private MotherBoard motherBoard;
	private Processor processor;
	private Harddisk harddisk;
	private Ram ram;
	
	public CPU() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	public CPU(MotherBoard motherBoard, Processor processor, Harddisk harddisk, Ram ram) 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created using arg-constructor");
		
		this.motherBoard = motherBoard;
		this.processor = processor;
		this.harddisk = harddisk;
		this.ram = ram;
	}

	public MotherBoard getMotherBoard() {
		return motherBoard;
	}

	public void setMotherBoard(MotherBoard motherBoard) {
		this.motherBoard = motherBoard;
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public Harddisk getHarddisk() {
		return harddisk;
	}

	public void setHarddisk(Harddisk harddisk) {
		this.harddisk = harddisk;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "CPU [motherBoard=" + motherBoard + ",\n processor=" + processor + ",\n harddisk=" + harddisk + ",\n ram="
				+ ram + "]";
	}
}