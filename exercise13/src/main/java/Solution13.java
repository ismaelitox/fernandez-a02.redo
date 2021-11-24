/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution13 {
    // Scanner object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Methods we're going tp use with variables
        // Methods will get principal, rate, years, number of years compounded
        // principal and rate will be doubles ie:  $'1290.12' & '4.9'
        // years and number doubled will be ints
        double principal = principalValue();
        double rate = interestRate();
        int years = numberYears();
        int compounded = numberCompounded();

        // Math functions will be here
        // all will be casted as doubles
        // rate percent will be the rate divided by the constant of 100
        // base number has the standard compound interest
        // amount compounded is the num of times its compounded in total
        // result the base number to the amount compounded power
        // subRounded is the place holder before its rounded
        // roundRate is the rate before it is rounded
        // rateFinal is the final rate
        double intRate = rate / 100.0;
        double baseNumber = (1 + (intRate / compounded));
        double amountCompounded = (compounded * years);
        double result = Math.pow(baseNumber, amountCompounded);
        double subRounded = (principal * result) * 100;
        double roundRate = (int) Math.ceil(subRounded);
        double rateFinal = roundRate / 100;

        //print output with amounts
        System.out.print("$" + principal + " invested at " + rate + "% for " + years + " years compounded " + compounded + " times per year is $");
        // print of final amount
        DecimalFormat format = new DecimalFormat("0.00");
        System.out.print(format.format(rateFinal));

    }
    // Method to get the amount of times compounded
    // taking in string
    // returning parsed int
    private static int numberCompounded() {
        System.out.print("What is the number of times the interest is compounded per year? ");
        return  in.nextInt();
    }
    // Method to get the number of years that wish to be invested
    // Taking in string
    // Returning parsed int
    private static int numberYears() {
        System.out.print("What is the number of years? ");
        return in.nextInt();
    }
    // Method to get the interest rate for the investment
    // taking in string
    // returning parsed double
    private static double interestRate() {
        System.out.print("What is the rate? ");
        return in.nextDouble();
    }
    // Method to get the principal amount
    // taking in string
    // returning parsed double
    private static double principalValue() {
        System.out.print("What is the principal amount? ");
        return in.nextDouble();
    }
}