package com.training.array;

import java.util.Scanner;

public class AndUsage {

	public static void main(String[] args) {
		System.out.println("Enter  x y z values:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		if(x>y && x>z)
		{
			System.out.println("X is greater");
		}
		else if(y>z)
		{
			System.out.println("Y is greater");
		}
		else
		{
			System.out.println("Z is greater");
		}
		sc.close();
	}
	
}
