package com.training.classObj;

public class VehicleDetails {
	String name;
	String model;
	int price;
	
	VehicleDetails(String name,String model,int price)
	{
		
		this.name=name;
		this.model=model;
		this.price=price;
	}
	void getDetails()
	{
		System.out.println("Name:"+name);
		System.out.println("model:"+model);
		System.out.println("price:"+price);
	}


	public static void main(String[] args) {
		VehicleDetails vehicle1=new VehicleDetails("bike","abc",20000);
		vehicle1.getDetails();
		
		
		VehicleDetails vehicle2=new VehicleDetails("car","xyz",30000);
		vehicle2.getDetails();
		

	}

}