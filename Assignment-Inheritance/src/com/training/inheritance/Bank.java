package com.training.inheritance;

public class Bank {

	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
		System.out.println("before transaction " + balance);
	}

	void withdraw(double amount) {
		balance -= amount;
	}

	void deposit(double amount) {
		balance += amount;
	}

	double getBalance() {
		System.out.println("after transaction" );
		return balance;
	}

}
