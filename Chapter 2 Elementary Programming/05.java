package com.geekahmed;
import java.util.Scanner;
/*
    * By: Ahmed Moustafa
    * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double subTotal, gratuityRate, gratuity, total;
        System.out.print("Enter the subtotal and a gratuity rate: ");
        subTotal = input.nextDouble();
        gratuityRate = input.nextDouble();
        gratuity = (gratuityRate / 100.0) * subTotal;
        total = subTotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total );
    }
}