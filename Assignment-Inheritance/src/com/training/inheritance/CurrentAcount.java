package com.training.inheritance;

public class CurrentAcount extends Account {

	public CurrentAcount(double balance) {
		super(balance);
		
	}

	void withdraw(double amount) {
		System.out.println("Current account withdraw");
		balance-= amount;
	}

	void deposit(double amount) {
		System.out.println("Current account deposit");
		balance+=amount;
	}

}