/*
 * UCF COP3330 Assignment 2 Solutions
 *  Copyright 2021 Jonah Ismael Fernandez
 *
 */


import java.text.MessageFormat;
import java.util.Scanner;

public class Solution19 {
    // Scanner Object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Driver code for each functions
        int weight = getWeight();
        int height = getHeight();
        double bmi = bmiCalc(height,weight);
        printBMIResults(bmi);

    }

    // Take input from BMI calculator and print results
    private static void printBMIResults(double bmi) {


        System.out.println(MessageFormat.format("Your bmi is {0}", bmi));
        // Print if under ideal margin
        if(bmi < 18.5)
            System.out.print("You are underweight and should consult your doctor.");
        // Print if within ideal margin
        else if(!(bmi <= 18.5 || bmi >= 25))
            System.out.print("You are within the ideal weight range.");
        // Print if BMI above selected margin
        else
            System.out.print("You are overweight and should consult your doctor.");

    }
    // do math for bmi calculations
    private static double bmiCalc( int height, int weight) {
        return ((weight+0.0) / (height*height))*703;
    }



    // Method for getting height
    // handler if not int input
    private static int getHeight() {
        System.out.print("Please input your height in inches: ");
        while(!in.hasNextInt()){
            System.out.print("Input is not a number.");
            in.nextInt();
        }
        return in.nextInt();
    }
    // Method for getting weight
    // Handler if not int input
    private static int getWeight() {
        System.out.print("Please input your weight in pounds: ");
        while(!in.hasNextInt()){
            System.out.print("Input is not a number.");
            in.nextInt();
        }
        return in.nextInt();
    }
}
