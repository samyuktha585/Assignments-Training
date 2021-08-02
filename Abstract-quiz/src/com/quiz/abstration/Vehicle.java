package com.quiz.abstration;

public abstract class Vehicle extends Accessories {

	String model;
	double price;

	public Vehicle(String model, double price) {
		super();
		this.model = model;
		this.price = price;
	}

	abstract void getMilage();

	void getDetails() {
		System.out.println("Model"+ model);
		System.out.println("Price"+ price);
		
	}

}