package com.training.classObj;

public class Student {

	 int id;
	 String name;
	 int marks;
	 int sum=0;

	public Student(String name,int id) {
		
		this.name=name;
		this.id=id;
	}

	public void getDetails()
	{
		System.out.println("name:" +name);
		System.out.println("id:" +id);
	}

	public void getMarks(int []marks) {
		for(int i:marks)
		{
			sum+=i;
		}
		this.marks=sum;
		double avg=sum/marks.length;
		System.out.println("sum: "+this.marks);
		System.out.println("Average: "+avg);
		if(avg>90)
		{
			System.out.println("Grade: A");
		}
		else if(avg>=70)
		{
			System.out.println("Grade: B");
		}
		else if(avg>=50)
		{
			System.out.println("Grade: C");
		}
		else if(avg>=35)
		{
			System.out.println("Grade: D");
		}
		
		else
		{
			System.out.println("Fail");
		}
	}
	
}
