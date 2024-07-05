package com.education.SpringProject;

public class Alien {
	
	private int age;
	private Laptop laptop;
	
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

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void code() {
		System.out.println("Coding");
		laptop.compile();
	}
	
}
