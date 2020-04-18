package com.geekahmed;
import java.util.Scanner;
/*
 * By: Ahmed Moustafa.
 * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
     System.out.print("Enter the length from the center to a vertex: ");
     double r = input.nextDouble();
     double s = 2 * r * Math.sin(Math.PI / 5);
     double area = (5 * Math.pow(s,2)) / (4 * Math.tan(Math.PI / 5));
     System.out.printf("The area of the pentagon is %.2f", area);
    }
}
