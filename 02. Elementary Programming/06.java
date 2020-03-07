package com.geekahmed;
import java.util.Scanner;
/*
    * By: Ahmed Moustafa
    * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int number, sum = 0 , units , hundreds, tens;
        System.out.print("Enter a number between 0 and 1000: ");
        number = input.nextInt();
        units = number % 10;
        number /= 10;
        tens = number % 10;
        number /= 10;
        hundreds = number % 10;
        sum = tens + units + hundreds;
        System.out.println("The sum of the digits is " + sum);
    }
}