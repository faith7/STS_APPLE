package com.yoon.Lecture1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
	
		ApplicationContext apple = new ClassPathXmlApplicationContext("Spring.xml"); 
		Vehicle car = (Vehicle)apple.getBean("firstCar"); 
		car.run(); 

	}
}
