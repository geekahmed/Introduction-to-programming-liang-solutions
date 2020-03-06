package com.geekahmed;
import java.util.Scanner;
/*
    * By: Ahmed Moustafa
    * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        final double POUND_PER_KILOGRAM = 0.45359237;
        final double INCH_PER_KILOGRAM = 0.0254;
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        double bmi = (weight * POUND_PER_KILOGRAM) / Math.pow((height * INCH_PER_KILOGRAM),2);
        System.out.println("BMI is " + bmi);
    }
}