package com.training.overloading;

public class Employee {
	String empname,empDesign;

	public Employee(String empname, String empDesign) {
		super();
		this.empname = empname;
		this.empDesign = empDesign;
	}
	double calcBonus(double basicAllowance) {
		
		return basicAllowance;
	}
	double calcBonus(double basicAllowance, double carAllowance) {
		return basicAllowance+carAllowance;
	}
    double calcBonus(double basicAllowance, double carAllowance,double houseAllowance) { 
		return basicAllowance+carAllowance+houseAllowance;
	}
}
