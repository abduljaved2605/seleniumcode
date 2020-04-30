package com.spring.examples;

public class Jio implements Sim{
	
	public Jio()
	{
		System.out.println("**Jio constructor***");
	}


	@Override
	public void calling() {
System.out.println("Calling using Jio sim");		
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Jio sim");		
	}
	
	

}
