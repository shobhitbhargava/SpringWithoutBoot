package com.education.SpringProject;

public class Alien {
	
	private int age;
	private Computer computer;
	
	public Alien() {
		System.out.println("Alien Object Created");
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setter Called for Age");
		this.age = age;
	}
	
	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		System.out.println("Setter Called for Computer");
		this.computer = computer;
	}

	public void code() {
		System.out.println("Coding");
		computer.compile();
	}
	
}
