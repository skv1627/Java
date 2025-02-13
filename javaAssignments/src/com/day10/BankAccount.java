package com.day10;

public class BankAccount {
	double balance;
	public BankAccount(double initialBalance) {
		this.balance=initialBalance;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	public double getBalance() {
		return balance;
	}

	
	
}
