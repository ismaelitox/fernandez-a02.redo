/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */

import java.util.Scanner;

public class Solution10 {
    // Creating scanner object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // create methods to get all values
        // separate methods for each quantity and item
        // quantity will be int no such thing as half an item
        // prices will be double if you enter '12.99' etc
        double  item1Price = firstItem();
        int item1Quantity = quantity1();
        double  item2Price = secondItem();
        int  item2Quantity = quantity2();
        double  item3Price = thirdItem();
        int   item3Quantity = quantity3();

        // subtotal will be double with math done here
        double subtotal = (item1Price * item1Quantity) + (item2Price * item2Quantity) + (item3Price * item3Quantity);
        // Constant for 5.5% tax rate
        double tax = subtotal * 0.055;
        // total for all
        double total = subtotal + tax;

        // formatted print statements for proper output
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total $" + String.format("%.2f", total));



    }
    // Method to get item 3 quantity
    // taking in string
    // returning parsed int
    private static int quantity3() {
        System.out.print("Enter the quantity of item 3: ");
        String quantity3 = in.nextLine();
        return Integer.parseInt(quantity3);
    }
    // Method to get item 3 price
    // taking in string
    // returning parsed double
    private static double thirdItem() {
        System.out.print("Enter the price of item 3: ");
        String price3 = in.nextLine();
        return Double.parseDouble(price3);
    }
    // Method to get item 2 quantity
    // taking in string
    // returning parsed int
    private static int quantity2() {
        System.out.print("Enter the quantity of item 2: ");
        String quantity2 = in.nextLine();
        return Integer.parseInt(quantity2);
    }
    // Method to get item 2 price
    // taking in string
    // returning parsed double
    private static double secondItem() {
        System.out.print("Enter the price of item 2: ");
        String price2 = in.nextLine();
        return Double.parseDouble(price2);
    }
    // Method to get item 1 quantity
    // taking in string
    // returning parsed int
    private static int quantity1() {
        System.out.print("Enter the quantity of item 1: ");
        String quantity1 = in.nextLine();
        return Integer.parseInt(quantity1);
    }
    // Method to get item 1 price
    // taking in string
    // returning parsed double
    private static double firstItem() {
        System.out.print("Enter the price of item 1: ");
        String price1 = in.nextLine();
        return Double.parseDouble(price1);

    }

}
