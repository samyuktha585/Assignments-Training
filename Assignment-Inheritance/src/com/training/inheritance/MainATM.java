package com.training.inheritance;

import java.util.Scanner;

public class MainATM {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Account type");
	System.out.println("1 Savings Account\n 2 Current Account \n 3 EXIT");
	String choice;
	do {
		choice=sc.nextLine();
		Bank b;
		switch(choice) {
			case "1":
				b=new SavingsAccount(300);
				break;
			case "2":
			    b=new CurrentAcount(1000);
			    break;
			case "3":
				System.exit(0);
			default:
				b=new SavingsAccount(1000);
		}
		b.withdraw(500);
		System.out.println("Balance "+b.getBalance());
		b.deposit(700);
		System.out.println("Balance "+b.getBalance());
	}while(!choice.equals("3"));
	sc.close();
	}

}