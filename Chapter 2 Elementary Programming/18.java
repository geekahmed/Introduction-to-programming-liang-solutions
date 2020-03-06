package com.geekahmed;
        import java.util.Scanner;
/*
 * By: Ahmed Moustafa
 * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        float a, b;
        System.out.println("a        b        pow(a, b)");
        a = 1;
        b = 2;
        System.out.println((int)a + "        " + (int)b +  "        " + (int)Math.pow(a, b));
        a++;
        b++;
        System.out.println((int)a + "        " + (int)b + "        " + (int)Math.pow(a, b));
        a++;
        b++;
        System.out.println((int)a + "        " + (int)b + "        " + (int)Math.pow(a, b));
        a++;
        b++;
        System.out.println((int)a + "        " + (int)b + "        " + (int)Math.pow(a, b));
        a++;
        b++;
        System.out.println((int)a + "        " + (int)b + "        " + (int)Math.pow(a, b));
    }
}