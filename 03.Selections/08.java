package com.geekahmed;
import java.util.Scanner;
/*
 * By: Ahmed Moustafa
 * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter 3 integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int temp;
        if (number2 < number1 || number3 < number1){
            if (number2 < number1){
                temp = number1;
                number1 = number2;
                number2 = temp;
            }
            if (number3 < number1){
                temp = number1;
                number1 = number3;
                number3 = temp;
            }
        }
        if (number3 < number2){
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        System.out.println(number1 + " " + number2 + " " + number3);

    }
}