package com.bridgelab;

public class Main {
	public static void main(String[] args)
    {
        SavingsAccount person1 = new SavingsAccount(8000);
        SavingsAccount person2 = new SavingsAccount(5000);

        SavingsAccount.modifyInterestRate(0.02);
        person1.calculateMonthlyInterest();
        SavingsAccount.modifyInterestRate(0.02);
        person2.calculateMonthlyInterest();

        SavingsAccount.modifyInterestRate(0.03);
        person1.calculateMonthlyInterest();
        SavingsAccount.modifyInterestRate(0.03);
        person2.calculateMonthlyInterest();
    }
}



