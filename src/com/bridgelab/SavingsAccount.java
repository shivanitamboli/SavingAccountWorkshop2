package com.bridgelab;

public class SavingsAccount {
	private static double annualInterestRate;
	private static double savingsBalance;

    public SavingsAccount() {
	savingsBalance = 0;
	annualInterestRate = 0;
}

	public SavingsAccount(double balance) {
		savingsBalance = balance;
		annualInterestRate = 0;
	}

	public void calculateMonthlyInterest() {
		System.out.println("Current savings balance is : " + savingsBalance);
		double monthlyInterest;
		monthlyInterest = (savingsBalance * annualInterestRate) / 12;
		savingsBalance += monthlyInterest;
		System.out.println("New savings balance after calculating monthly interest is : " + savingsBalance);
	}

	public static double getBalance() {
		return savingsBalance;
	}

	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
}

class SpecialSavings extends SavingsAccount {
	protected static void modifyInterestRate() {
		if (SavingsAccount.getBalance() > 10000) {
			modifyInterestRate(0.1);
		}

	}
}
