
package com.yoon;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {

// create beans	
/*
  		ApplicationContext apple2 = new ClassPathXmlApplicationContext("SpringConfig.xml"); 
		Car car1 = (Car)apple2.getBean("car"); 
		car1.run();  
*/
		
// create second beans				
/*		
   		Car car2 = (Car)apple2.getBean("second"); 
		car2.run(); 
 
		
//destroy beans (using xml)
/* 		AbstractApplicationContext apple3 = new ClassPathXmlApplicationContext("SpringConfig.xml"); 
		apple3.registerShutdownHook();
*/		
		
//destroy beans - 2nd method (refer to Car2class..by implementing InitializingBean, DisposableBean )
		AbstractApplicationContext apple3 = new ClassPathXmlApplicationContext("SpringConfig.xml"); 
		apple3.registerShutdownHook();	
	}
}
