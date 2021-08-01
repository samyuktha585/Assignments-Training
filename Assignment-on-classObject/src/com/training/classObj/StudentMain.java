package com.training.classObj;


import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		System.out.println("Enter student name");		
		Scanner sc = new Scanner(System.in);
		String name= sc.nextLine();
		
		System.out.println("Enter student Id");
		int id= sc.nextInt();
		
		Student student = new Student(name,id);
		
		System.out.println("enter array length");
		int a=sc.nextInt();
		int []marks=new int[a];
		System.out.println("enter marks");
		for(int i=0;i<a;i++)
		{
			marks[i]=sc.nextInt();
		}
		student.getDetails();
		student.getMarks(marks);
		sc.close();
		
	}
}
	
