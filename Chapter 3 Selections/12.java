package com.geekahmed;
import java.util.Scanner;
/*
 * By: Ahmed Moustafa
 * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();
        int n = number;
        int d1 = n % 10;
        n /= 10;
        int d2 = n % 10;
        n /= 10;
        int d3 = n % 10;
        n /= 10;
        if (d1 == d3){
            System.out.println(number + " is a palindrome");

        } else {
            System.out.println(number + " is not a palindrome");

        }
    }
}