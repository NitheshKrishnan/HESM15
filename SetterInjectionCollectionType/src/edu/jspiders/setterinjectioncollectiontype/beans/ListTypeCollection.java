package edu.jspiders.setterinjectioncollectiontype.beans;

import java.util.List;

public class ListTypeCollection 
{
	public ListTypeCollection() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	private List<Integer> list;

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ListTypeCollection [list=" + list + "]";
	}
}