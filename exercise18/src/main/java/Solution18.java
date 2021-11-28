/*
 *   UCF COP3330 Fall 2021 Assignment 2 Solution
 *   Copyright 2021 Jonah Ismael Fernandez
 */

import java.text.MessageFormat;
import java.util.Scanner;

public class Solution18 {
    // Scanner Object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // input will determine what function is ran
        String input = getStringInput();

        if(input.equals("C")) {
            // run if equal to C input
            Celsius();

        } else if (input.equals("F"))
        {
            // else run if F input
            Fahrenheit();
        }
        else{
            // print invalid input if neither are in
            System.out.print("Invalid Entry.\n Please choose either C or F");
        }

    }

    // Method for getting input
    // Return input to upper case
    // will handle both lower and upper cases
    private static String getStringInput() {
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        String baseInput = in.nextLine();
        return baseInput.toUpperCase();
    }
    // Method for handling Celsius conv.
    // Math takes place inside method
    // Called if needed
    private static void Celsius(){
        System.out.print("Please enter the temperature in Celsius: ");
        int celsius = in.nextInt();
        double fahrenheitConverted = (celsius*(9/5.0) + 32);
        System.out.println(MessageFormat.format("The temperature in Fahrenheit is {0}.", fahrenheitConverted));

    }
    // Method for handling Fahrenheit Conv
    // Math takes place inside method
    // Called if needed
    private static void Fahrenheit(){
        System.out.print("Please enter the temperature in Fahrenheit: ");
        int fahrenheit = in.nextInt();
        double celsiusConverted = ((fahrenheit - 32) * (5/9.0));
        System.out.println(MessageFormat.format("The temperature in Celsius is {0}.", celsiusConverted));

    }




}
