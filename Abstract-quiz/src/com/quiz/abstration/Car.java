package com.quiz.abstration;

public class Car extends Vehicle {

	public Car() {
		super("abcModel", 1000);
		// TODO Auto-generated constructor stub

	}

	void internal() {
		System.out.println("Internal method");
	}

	void external() {
		System.out.println("External method");
	}

	void getMilage() {
		System.out.println("get milage");
	}

}
