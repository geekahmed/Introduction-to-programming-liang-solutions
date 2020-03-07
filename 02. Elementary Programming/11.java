package com.geekahmed;
import java.util.Scanner;
/*
    * By: Ahmed Moustafa
    * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        int population = (int) (312032486.0 + (((31536000.0 / 7) - (31536000.0 / 13)+ (31536000.0 / 45)) * years));
        System.out.println("The population in " + years +" years "+ "is " + population);
    }
}