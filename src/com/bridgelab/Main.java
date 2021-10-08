package com.bridgelab;

public class Main {
	public static void main(String[] args)
    {
        SavingsAccount person1 = new SavingsAccount(2000);
        SavingsAccount person2 = new SavingsAccount(3000);

        person1.modifyInterestRate(.04);
        person1.calculateMonthlyInterest();
        person2.modifyInterestRate(.04);
        person2.calculateMonthlyInterest();

        person1.modifyInterestRate(.05);
        person1.calculateMonthlyInterest();
        person2.modifyInterestRate(.05);
        person2.calculateMonthlyInterest();
    }
}



