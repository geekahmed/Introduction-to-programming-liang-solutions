package com.geekahmed;
import java.util.Scanner;
/*
    * By: Ahmed Moustafa
    * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();
        long days = (minutes % 525600) / 1440;
        long years = minutes / 525600;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days+ " days");
    }
}