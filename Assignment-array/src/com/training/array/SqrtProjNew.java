package com.training.array;


import java.util.Scanner;

public class SqrtProjNew {
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
		
		
		double result=0;
		for(int i=0;i<a.length;i++)
		{
			 result=Math.sqrt(a[i]);
			System.out.println("\n"+result);
		
		}
		
		System.out.println("array elements");
		for(int i=0;i<arr;i++)
		{
			System.out.print(Math.sqrt(a[i])+"\t");
		}
		sc.close();
		
	}
}
