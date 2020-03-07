package com.geekahmed;
import java.util.Scanner;
/*
 * By: Ahmed Moustafa
 * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int digits = input.nextInt();
        int d9 = digits % 10;
        digits /= 10;
        int d8 = digits % 10;
        digits /= 10;
        int d7 = digits % 10;
        digits /= 10;
        int d6 = digits % 10;
        digits /= 10;
        int d5 = digits % 10;
        digits /= 10;
        int d4 = digits % 10;
        digits /= 10;
        int d3 = digits % 10;
        digits /= 10;
        int d2 = digits % 10;
        digits /= 10;
        int d1 = digits % 10;
        digits /= 10;

        int d10 = (d1  + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11 ;
        System.out.print( "The ISBN-10 number is " + d1+d2+d3+d4+d5+d6+d7+d8+d9);
        if (d10 == 10)
            System.out.print("X");
        else
            System.out.print(d10);

    }
}