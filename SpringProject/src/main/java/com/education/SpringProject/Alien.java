package com.education.SpringProject;

public class Alien {
	
	int age;
	
	public Alien() {
		System.out.println("Alien Object Created");
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setter Called");
		this.age = age;
	}

	public void code() {
		System.out.println("Coding");
	}
	
}
