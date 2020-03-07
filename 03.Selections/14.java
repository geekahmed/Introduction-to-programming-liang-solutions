package com.geekahmed;
import java.util.Scanner;
/*
 * By: Ahmed Moustafa
 * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int coin = (int)(Math.random() * 2);
        System.out.print("Enter a guess 0-head or 1-tail: ");
        int guess = input.nextInt();
        System.out.println(((guess == coin) ? "Correct" : "Incorrect") + " guess.");
    }
}