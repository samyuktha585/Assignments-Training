package com.training.array;

import java.util.Scanner;

public class OneDimArray {

	public static void main(String[] args) {
		System.out.println("enter array length");
		Scanner sc=new Scanner(System.in);
		int arr=sc.nextInt();
		
		
		int a[]=new int[arr];
	
		for(int i=0;i<arr;i++)
		{
			a[i]=sc.nextInt();

		}
		System.out.println("array elements");
		for(int i=0;i<arr;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println("\n");
		double total=0;
		 double average=0;
		for(int i=0;i<a.length;i++)
		{
			
			 total=total+a[i];
			   average=total/a.length;
		
	     }
		sc.close();
		System.out.println("\n Total \t"+total);
		 System.out.println("\n average \t"+average);
	}
	
}
