/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */

import java.text.MessageFormat;
import java.util.Scanner;

public class Solution21 {
    //Scanner Object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // declaring month
        // formatted print statement
        int month = getMonth();
        System.out.print(MessageFormat.format("The name of the month is {0}", monthNumber(month)));

    }

    // method to get month from user
    private static int getMonth() {
        System.out.print("Please enter the number of the month: ");
        return in.nextInt();
    }

    // Switch block for handling cases
    private static String monthNumber(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "N/A";
        };
    }
}
