package com.training.overloading;

public class EmployeeMain {
		public static void main(String[] args) {
			Employee obj1=new Employee("samyuktha","Manager");
			Employee obj2=new Employee("kyathi","Programmer");
			Employee obj3=new Employee("Tom","Director");
			
			System.out.println("Total Allowance is "+obj2.calcBonus(1000.5));
			System.out.println("Total Allowance is "+obj1.calcBonus(1000.2,245.5));
			System.out.println("Total Allowance is "+obj3.calcBonus(4000.6,500.9,7000.9));
			}
}
