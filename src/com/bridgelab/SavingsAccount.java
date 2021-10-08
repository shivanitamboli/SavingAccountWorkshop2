package com.bridgelab;

public class SavingsAccount {
	private static double annualInterestRate;
	private static double savingsBalance;

	public SavingsAccount() {
		savingsBalance = 0;
		annualInterestRate = 0;
	}

	protected SavingsAccount(double balance) {
		savingsBalance = balance;
		annualInterestRate = 0;
	}

	protected void calculateMonthlyInterest() {
		System.out.println("Current savings balance is : " + savingsBalance);
		double monthlyInterest;
		monthlyInterest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance += monthlyInterest;
		System.out.println("New savings balance is : " + savingsBalance);
	}

	protected static double getBalance() {
		return savingsBalance;
	}

	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
}

class SpecialSavings extends SavingsAccount {
	protected static void modifyInterestRate() {
		if (SavingsAccount.getBalance() > 10000) {
			modifyInterestRate(.1);
		}

	}
}
