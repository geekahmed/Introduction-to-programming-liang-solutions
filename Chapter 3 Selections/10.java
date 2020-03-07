package com.geekahmed;
import java.util.Scanner;
/*
 * By: Ahmed Moustafa
 * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        if (number1 + number2 == answer)
            System.out.println("You are correct!");
        else
            System.out.println("You are wrong " + number1 + " + " + number2 + " should be " + (number1 + number2));
    }
}