/*
 * UCF COP3330 Fall 2021 Assignment 2 Solutions
 * Copyright 2021 Jonah Ismael Fernandez
 *
 */


import java.text.MessageFormat;
import java.util.Scanner;

public class Solution20 {
    // Scanner Object
    private static final Scanner in = new Scanner(System.in);


    public static void main(String[] args) {

        // Driver Methods
        int order = getOrder();
        String state = getState();
        wiCountyTax(order);
        // cases determined based upon string inputs
        // call either normal tax or wisconsin tax if needed
        switch (state) {
            case "Wisconsin" -> wiCountyTax(order);
            case "Illinois" -> normalTax(0.08, order);
            default -> normalTax(0, order);
        }
    }
   // get method for state
    private static String getState() {
        System.out.print("What state do you live in? ");
        return in.next();
    }
    // get method for order
    private static int getOrder() {
        System.out.print("What is the order amount? ");
        return in.nextInt();
    }
    // Method to do wisconsin county taxes.
    private static void wiCountyTax(int order)
    {

        System.out.println("What county do you live in? ");
        String county;
        county = in.nextLine();
        // cases determined based on input
        // call different rates based on two separate counties
        switch (county) {
            case "Eau Claire" -> normalTax(0.055, order);
            case "Dunn" -> normalTax(0.054, order);
            default -> normalTax(0.05, order);
        }

    }

    // take in tax rate
    // take in order
    // calc normal rate
    // print normal rates
    private static void normalTax(double normalTax, int order)
    {
        // Math to calculate normal taxes
        double tax;
        tax = normalTax*order;
        double total;
        total = tax + order;
        // Print taxes
        System.out.println(MessageFormat.format("The tax is ${0}", tax));
        // Print total
        System.out.println(MessageFormat.format("The total is ${0}", total));

    }


}
