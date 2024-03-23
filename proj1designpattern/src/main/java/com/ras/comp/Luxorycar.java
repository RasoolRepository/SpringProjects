package com.ras.comp;

public class Luxorycar extends Car {
private String regno;
	
	public Luxorycar(String regno) {
		System.out.println("Luxorycar::1-param constructor");
		this.regno = regno;
	}

	@Override
	public void drive() {
		System.out.println("Driving Luxory car..");
	}

}
