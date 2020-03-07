package com.geekahmed;
import java.util.Scanner;
/*
 * By: Ahmed Moustafa
 * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter investment amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate /= 1200;
        System.out.print("Enter number of years: ");
        int years = input.nextInt();
        double futureInvestmentValue = amount * Math.pow(1 + monthlyInterestRate, years * 12);
        System.out.println("Accumulated value is $" + futureInvestmentValue);    }
}