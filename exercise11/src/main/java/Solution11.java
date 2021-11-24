/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */

import java.text.MessageFormat;
import java.util.Scanner;

public class Solution11 {
    // Scanner object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Initialize rate functions

        int c_from = Euro();
        double rate = XRate();
        // Math for currency exchange functions

        double c_to = ( c_from * rate );
        double roundUSD = c_to * 100.0;
        int roundedUSD = (int) Math.ceil(roundUSD);
        double finalUSD = roundedUSD / 100.0;

        System.out.println(MessageFormat.format("{0} euros at an exchange rate of {1} is\n{2} U.S. dollars.", c_from, rate, finalUSD));
    }
    // Exchange rate getter
    private static double XRate() {
        System.out.print("What is the exchange rate? ");
        String getXRate = in.nextLine();
        return Double.parseDouble(getXRate);
    }
    // Amount of Euro getter
    private static int Euro() {
        System.out.print("How many euros are you exchanging? ");
        String getEuro = in.nextLine();
        return Integer.parseInt(getEuro);
    }
}
