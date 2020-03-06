package com.geekahmed;
import java.util.Scanner;
/*
    * By: Ahmed Moustafa
    * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
        double area = ((3 * Math.sqrt(3)) / 2.0) * Math.pow(side, 2);
        System.out.println("The area of the hexagon is " + area);
    }
}