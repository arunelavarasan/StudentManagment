package com.dao;

public class Student {
	private String name;
	private String phoneno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phoneno=" + phoneno + "]";
	}
	
	
}
