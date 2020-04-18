package com.geekahmed;
import java.util.Scanner;
/*
 * By: Ahmed Moustafa
 * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

       System.out.print("Enter year: (e.g., 2012): ");
       int year = input.nextInt();
       System.out.print("Enter month: 1-12: ");
       int m = input.nextInt();
       System.out.print("Enter the day of the month: 1-31: ");
       int q = input.nextInt();
       if (m == 1){

           m = 13;
           year--;
        } else if (m == 2){
           m = 14;
           year--;
       }
       int j = year / 100;
       int k = year % 100;

       int h = (q + ((26 * (m + 1)) /10 ) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
       String day = "";
       switch (h){
           case 0:
               day += "Saturday"; break;
           case 1:
               day += "Sunday"; break;
           case 2:
               day += "Monday"; break;
           case 3:
               day += "Tuesday"; break;
           case 4:
               day += "Wednesday"; break;
           case 5:
               day += "Thursday"; break;
           case 6:
               day += "Friday"; break;
       }
       System.out.println("Day of the week is " + day);
    }
}
