package com.spring.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

public class mobile {
	
	public static void main(String[] args) {
		//Airtel airtel = new Airtel();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config file loaded");
		
		Sim sim = context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
		
	
	}

}
