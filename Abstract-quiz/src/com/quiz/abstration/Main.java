package com.quiz.abstration;

public class Main {

	public static void main(String[] args) {

		Accessories a = new Car();
		a.internal();
		a.external();

		Vehicle v = (Vehicle) a;
		v.getMilage();
		v.getDetails();
	}

}


