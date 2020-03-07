package com.company;

public class Main {

    public static void main(String[] args) {
	final double mileToKM = 1.6 ;
	double miles = 15 * mileToKM ;
	double time = (50.0/60) + (30.0/(60*60)) ;
	System.out.println("The average speed(MPH): " + (miles/time));
    }
}
