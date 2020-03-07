package com.geekahmed;
import java.util.Scanner;
/*
    * By: Ahmed Moustafa
    * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        final double MONTHLY_INTEREST_RATE = 0.00417;
        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();
        double compoundValue = 0 ;
        compoundValue = (savingAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE);
        compoundValue = (savingAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE);
        compoundValue = (savingAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE);
        compoundValue = (savingAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE);
        compoundValue = (savingAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE);
        compoundValue = (savingAmount + compoundValue) * (1 + MONTHLY_INTEREST_RATE);
        System.out.println("After the sixth month, the account value is " + compoundValue);
    }
}