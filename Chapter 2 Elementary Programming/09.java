package com.geekahmed;
import java.util.Scanner;
/*
    * By: Ahmed Moustafa
    * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        double a = (v1-v0)/t;
        System.out.println("The average acceleration is " + a);
    }
}