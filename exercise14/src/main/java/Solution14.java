/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution14 {
    // Scanner Object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialized getter methods
        double orderAmount = orderAmount();
        String state = isItWis();

       // String wis = "WI";
        // If statement if input is wisconsin
        // Goes through tax math for wis
        // print statement within to print amount
        if(state.equals("WI"))
        {
            double rate = 0.055;
            System.out.println("The subtotal is $" + orderAmount);
            double tax = orderAmount * rate;
            DecimalFormat format = new DecimalFormat("0.00");
            System.out.println(format.format("The tax is" + tax));

        }
        else{
            // Else print normal amount
            System.out.println("The total is $" + orderAmount);
        }


    }
    // Get method for State
    private static  String isItWis() {
        System.out.print("What is the state? ");
        String state = in.next();
        return state;

    }
    // Get method for order amount
    private static int orderAmount() {
       System.out.print("What is the order amount? ");
       return in.nextInt();
    }
}