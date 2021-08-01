package com.training.inheritance;
public class SavingsAccount extends Account {

	public SavingsAccount(double balance) {
		super(balance);
			}

	void withdraw(double amount) {
		System.out.println("Savings account after withdraw");
		balance -= amount;
	}

	void deposit(double amount) {
		System.out.println("Savings account after deposit");
		balance += amount;
	}

}