package edu.jspiders.setterinjectioncollectiontype.beans;

import java.util.Set;

public class SetTypeCollection 
{
	public SetTypeCollection() 
	{
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	private Set<Character> set;

	public Set<Character> getSet() {
		return set;
	}

	public void setSet(Set<Character> set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return "SetTypeCollection [set=" + set + "]";
	}
	
}