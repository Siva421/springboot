package com.kl.springioc;

public class Vodaphone implements Sim{

	@Override
	public void calling() {
		System.out.println("Calling using Vodaphone Sim");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Vodaphone Sim");
		
	}

	@Override
	public void contacts() {
		System.out.println("Saving the contacts by using Sim");
		
	}
	

}
