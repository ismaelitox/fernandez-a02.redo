/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Scanner;

public class Solution07 {
    // Scanner object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // initializing variables from methods
        // creating two methods to get values
        // holding the conv fact with a double
        int roomLength = roomLength();
        int roomWidth = roomWidth();
        double convFact = 0.09290304;

        // variable holding value from length and width product
        // variable holding value from square footage and conversion factor
        int areaSqFt = roomLength * roomWidth;
        double areaSqMeters = areaSqFt * convFact;

        // creating a decimal format object to get format for proper output
        // set '0.000' to meet assignment constraints
        DecimalFormat decimalFormat = new DecimalFormat("0.000");

        // print statement with fancy format and decimal format for proper output
        System.out.println(MessageFormat.format("You entered the dimensions of {0} feet by {1} feet.", roomLength, roomWidth));
        System.out.println(MessageFormat.format("The area is \n{0} square feet.", areaSqFt));
        System.out.print(decimalFormat.format(areaSqMeters) + " square meters");


    }
    // method for getting room width
    // taking in string
    // returning parsed int
    private static int roomWidth() {
        System.out.print("What is the width of the room in feet? ");
        String width = in.nextLine();
        return Integer.parseInt(width);
    }
    // method for getting room length
    // taking in string
    // returning parsed int
    private static int roomLength() {
        System.out.print("What is the length of the room in feet? ");
        String length = in.nextLine();
        return Integer.parseInt(length);
    }

}
