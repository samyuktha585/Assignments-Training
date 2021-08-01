package com.training.classObj;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank(30000);

		int choice;
		System.out.println("Enter Your Choice\n 1. Balance 2. withdraw 3. Deposit  4. Exit");
		do {
			choice = sc.nextInt();
			double totalAmount = bank.getBalance();
			switch (choice) {
			case 1:
				System.out.println("Balance in Account: " + bank.getBalance());
				break;

			case 2:
				System.out.println("Enter Amount to withdraw");
				double amount = sc.nextInt();

				if (amount > totalAmount) {
					System.out.println("Sorry! Insufficient Amount");
				} else {
					bank.withdraw(amount);
					System.out.println("Balance in Account: " + bank.getBalance());
				}
				break;

			case 3:

				System.out.println("Enter Amount to Deposit");
				int money2 = sc.nextInt();
				bank.deposit(money2);
				System.out.println("Balance in Account: " + bank.getBalance());
				break;

			case 4:
				System.exit(0);
			default:
				System.out.println("Wrong choice");
			}
		} while (choice != 0);
		sc.close();
	}

}
