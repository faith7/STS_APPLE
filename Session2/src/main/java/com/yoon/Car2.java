package com.yoon;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Car2 implements InitializingBean, DisposableBean {

	private int year; 
	private Radio radio;  
	
//	public Car(int year) {
//	
//		this.year = year; 
//		System.out.println("in constructor");
//	}

	public void afterPropertiesSet () {
		System.out.println("db connected initially");
		year = 2017; 
	}
	
	public Radio getRadio() {
		return radio;
	}

	public void setRadio(Radio radio) {
		this.radio = radio;
	}

	public void setYear(int year)
	{
		this.year = year; 
	}
	
	public int getYear() {
		return year;
	}

	public void run() {
		System.out.println("Vroom! - car manufactured in "+ year);	
//		radio.play(); 
	}
	
	public void destroy() {
		System.out.println("db closed..");
	}
}
