package com.geekahmed;
import java.util.Scanner;
/*
 * By: Ahmed Moustafa.
 * E-Mail: geekahmed1@gmail.com
 */
public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        final double RADIUS = 6371.01;
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        String xy1 = input.nextLine();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        String xy2 = input.nextLine();
        int k = xy1.indexOf(',');
        double x1 = Double.parseDouble(xy1.substring(0, k ));
        double y1 = Double.parseDouble(xy1.substring(k + 1));
        k = xy2.indexOf(',');
        double x2 = Double.parseDouble(xy2.substring(0, k));
        double y2 = Double.parseDouble(xy2.substring(k + 1));
        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);
        double distance = RADIUS * Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
        System.out.println("The distance between the two points is " + distance + " km");
    }
}
