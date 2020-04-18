package com.geekahmed;
import java.util.Scanner;
/*
 * By: Ahmed Moustafa
 * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int lottery = (int)(Math.random() * 1000);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();
        int lotteryDigit1 = lottery / 100;
        int remainingDigits = lottery % 100;
        int lotteryDigit2 = remainingDigits / 10;
        int lotteryDigit3 = remainingDigits % 10;

        // Extract digits from guess
        int guessDigit1 = guess / 100;
        int remainingDigits1 = guess % 100;
        int guessDigit2 = remainingDigits / 10;
        int guessDigit3 = remainingDigits % 10;
        System.out.println("The lottery number is " + lottery);
        // Check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        if (guessDigit1 == lotteryDigit2)
        {

        }
    }
}