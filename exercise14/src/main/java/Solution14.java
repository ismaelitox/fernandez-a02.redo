/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */


import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Solution14 {
    // Scanner Object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        // Initialized getter methods
        int orderAmount = Integer.parseInt(Solution14.orderAmount());
        String state = Solution14.isItWis();

        // If statement if input is wisconsin
        // Goes through tax math for wis
        // print statement within to print amount
        if (!state.equals("WI")) {
            // If any other state print normal amount
            System.out.println(MessageFormat.format("The total is ${0}", orderAmount));
        } else {
            // Else Print the tax for wisconsin.
            // Rates and Math
            double rate = 0.055;
            double tax = orderAmount * rate;
            // First initial print statement for subtotal
            // No need for formatting of numbers
            System.out.println(MessageFormat.format("The subtotal is ${0}", orderAmount));
            // Otherwise needs formatting for proper print statement
            var taxFormat = numberFormat.format(tax);
            System.out.println(MessageFormat.format("The tax is {0}", taxFormat));
            var total = numberFormat.format(tax + orderAmount);
            System.out.println(MessageFormat.format("The total is {0}", total));

        }


    }
    // Get method for State
    // Ensure that WI can be used as lower case input or not
    // Will still convert to uppercase

    public static String isItWis() {
        System.out.print("What is the State? ");
        String string = in.next();
        string = string.toUpperCase();
        return string;

    }

    // Get method for order amount

    public static String orderAmount() {
        System.out.print("What is the order amount? ");
        return in.nextLine();
    }


}