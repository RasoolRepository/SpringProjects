package com.ras.comp;

public class Spotscar extends Car {
   private String regno;
	
	public Spotscar(String regno) {
		System.out.println("Sportscar::1-param constructor");
		this.regno = regno;
	}

	@Override
	public void drive() {
		System.out.println("Driving spots car");

	}

}
