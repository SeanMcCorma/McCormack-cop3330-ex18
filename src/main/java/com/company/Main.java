package com.company;

import java.util.Locale;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit\n" +
                "Your choice: ");
        String choice = scan.nextLine().toUpperCase(Locale.ROOT);
        if(choice.equals("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double Fah=Double.parseDouble(scan.nextLine());
            double Cel= Math.ceil((Fah-32)*5/9*100)/100;
            System.out.println("The temperature in Celsius is "+Cel+".");
        }else if(choice.equals("F")){
            System.out.print("Please enter the temperature in Celsius: ");
            double Cel=Double.parseDouble(scan.nextLine());
            double Fah=Math.ceil(((Cel*9/5)+32)*100)/100;
            System.out.println("The temperature in fahrenheit is "+Fah+".");
        }else{
            System.out.println("Not a choice");
        }
    }
}
