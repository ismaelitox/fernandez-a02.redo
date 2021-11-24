/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */


import java.text.MessageFormat;
import java.util.Scanner;

public class Solution09 {
    // creating new scanner object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // declare constant value for one gallon of
        // paint covers 350 square feet
        double gallonP = 350;

        // declare methods to get input for length and width
        // have methods return ints to be used for math in output
        int ceilingLength = ceilingLength();
        int ceilingWidth = ceilingWidth();

        // create variables to hold values of total area and paint
        // totalArea will be product of ceiling length and width
        // paint will be quotient of gallons of paint and total area
        // total paint will be rounded up value of paint
        // fun fact the word ceiling comes from the latin word 'caelum'
        // which means "heaven or sky"
        int totalArea = ceilingLength * ceilingWidth;
        double paint = totalArea / gallonP;
        int totalPaint = (int) Math.ceil(paint);

        // formatted print statement with displaying paint needed for user input area
        System.out.println(MessageFormat.format("You will need to purchase {0} gallons of paint to cover {1} square feet.", totalPaint, totalArea));
    }
    // method for getting ceiling width
    // taking in string input
    // returning parsed int
    private static int ceilingWidth() {
        System.out.print("What is the width of the ceiling in feet? ");
        String width = in.nextLine();
        return Integer.parseInt(width);
    }
    // method for getting ceiling height
    // taking in string input
    // returning parsed int
    private static int ceilingLength() {
        System.out.print("What is the length of the ceiling in feet?  ");
        String length = in.nextLine();
        return Integer.parseInt(length);
    }

}