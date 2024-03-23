package com.ras.comp;

public class Budgetcar extends Car {
	private String regno;
	
	public Budgetcar(String regno) {
		System.out.println("Budget car::1-param constructor");
		this.regno = regno;
	}

	@Override
	public void drive() {
		System.out.println("Driving budget car....");

	}

}
