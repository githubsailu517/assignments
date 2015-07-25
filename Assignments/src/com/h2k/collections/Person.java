package com.h2k.collections;

public class Person implements Comparable {
	public String name;
	String address;
	
	public Person() {
		
	}
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String toString(){
		return name + " " + address ;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void callMe() {
		System.out.println("Reflection: callMe without parameters");
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(((Person)o).getName());
	}	

}
