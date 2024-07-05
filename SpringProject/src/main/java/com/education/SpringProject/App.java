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
		
		/*
		 *  
		 *  By default the spring follow the singleton design pattern.
		 *  
		 * 	By deafult if the scope is prototype then the objct will get created only when 
		 * 	context.getBean metthod is called.
		 *  
		 */
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		System.out.println();
		
		Alien obj = (Alien) context.getBean("Alien");
		System.out.println(obj.getAge());
		obj.code();
		
		System.out.println();
		
		Alien obj1 = (Alien) context.getBean("Alien");
		System.out.println(obj1.getAge());
		obj1.code();
	}
}
