package com.day10;

import com.day9.constructors.Main;

public class SavingsAccount extends BankAccount {
	
	public SavingsAccount(double initialAmount) {
		super(initialAmount);
	}
	public void withdraw(double amount) {
		if(balance-amount>=100) {
			System.out.println("Withdrawing amount of "+ amount);
		}else {
			System.out.println("insufficient funds, balanace should be 100");
		}
	}
	
	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount(700);
		savings.deposit(200);
		savings.withdraw(100);
		savings.withdraw(1000);
		
		
	}
	
}
