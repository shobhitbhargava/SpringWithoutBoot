package com.education.SpringProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*
		 * ApplicationContext -- New 
		 * BeanFactory -- Old
		 * 
		 * Both of the above classes are responsible for creating containers and
		 * maintaining and get objects from that container.
		 * 
		 * ApplicationContext will be having all the features of BeanFactory plus some
		 * additional features.
		 */
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		/* 
		 * ClassPathXmlApplicationContext will be for XML based configs. 
		 * 
		 * And the above line will create a container for us. 
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		Alien obj = (Alien) context.getBean("Alien");
		obj.code();
	}
}
