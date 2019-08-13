package edu.jspiders.beanwiringimplicitannotationwithcomponentscancpu.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CPU implements Serializable
{
	//@Autowired
	private MotherBoard motherBoard;
	//@Autowired
	private Processor processor;
	//@Autowired
	private Harddisk harddisk;
	//@Autowired
	private Ram ram;
	
	public CPU() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	@Autowired
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