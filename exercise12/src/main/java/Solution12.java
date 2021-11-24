/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution12 {
    // Scanner object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Initialize methods to get values
        // Principal Value, interestRate, numberYears
        // return values for math for method
        double principal = principleValue();
        double rate = interestRate();
        int years = numberYears();
        // Compute values returned with values from methods
        // Do math for annual Rate
        // use ciel function to round rate
        // return final rate as double
        double annualRate = principal * (1 + rate / 100 * years) * 100;
        int roundedRate = (int) Math.ceil(annualRate);
        double finalRate = roundedRate / 100.0;

        // Print statement with message formatting
        // Also print statement with decimal formatting for proper output
        System.out.print("After " + years + " years at " + rate + "%, the investment will be worth $");
        DecimalFormat format = new DecimalFormat("0.00");
        System.out.print(format.format(finalRate));
    }
    // Method to get number of years
    // taking in string input
    // return parsed int for year value
    private static int numberYears() {

        System.out.print("Enter the number of years: ");
        return in.nextInt();
    }
    // Method to get interest rate
    // taking in string input
    // returning parsed double for interest value
    private static double interestRate() {

        System.out.print("Enter the rate of interest: ");
        return in.nextDouble();
    }
    // Method to get in principle value
    // taking in string input
    // returning parse double for principle value
    private static double principleValue() {

        System.out.print("Enter the principal value: ");
        return in.nextDouble();
    }
}