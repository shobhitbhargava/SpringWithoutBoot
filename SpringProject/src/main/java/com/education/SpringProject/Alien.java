package com.education.SpringProject;

import java.beans.ConstructorProperties;

import javax.management.ConstructorParameters;

public class Alien {
	
	private int age;
	private Laptop laptop;
	
	public Alien() {
		System.out.println("Alien Object Created");
	}
	
	public Alien(int age) {
		System.out.println("Parameterized Age Alien Object Created");
		this.age = age;
	}
	
	public Alien(Laptop laptop) {
		System.out.println("Parameterized Laptop Alien Object Created");
		this.laptop = laptop;
	}
	
	@ConstructorProperties({"age", "laptop"})
	public Alien(int age, Laptop laptop) {
		System.out.println("Parameterized Age, Laptop Alien Object Created");
		this.age = age;
		this.laptop = laptop;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setter Called for Age");
		this.age = age;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		System.out.println("Setter Called for Laptop");
		this.laptop = laptop;
	}

	public void code() {
		System.out.println("Coding");
		laptop.compile();
	}
	
}
