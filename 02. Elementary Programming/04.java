package com.geekahmed;
import java.util.Scanner;
/*
    * By: Ahmed Moustafa
    * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        final double POUND_PER_KG = 0.454;
        double kgValue , poundsValue ;
        System.out.print("Enter a number in pounds: ");
        poundsValue = input.nextDouble();
        kgValue = POUND_PER_KG * poundsValue;
        System.out.println(poundsValue + " pounds is " + kgValue + " kilograms");
    }
}