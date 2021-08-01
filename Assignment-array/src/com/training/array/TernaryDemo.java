package com.training.array;

public class TernaryDemo {

	public static void main(String[] args) {
		int a=100;
		int k=(a>500)?90:a+1;
		System.out.println(k);
     
		int x=10,y=120,z=30;
		String result=(x>y)&&(x>z)?"X is greater":(y>z)?"Y is greater":"Z is greater";
		System.out.println(result);

	}

}
