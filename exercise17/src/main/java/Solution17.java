/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jonah Ismael Fernandez
 */

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Scanner;

public class Solution17 {
    // Scanner Object
    private static final Scanner in = new Scanner(System.in);
    // prompt if false input
    private static final String falseInput = "Input is not a number , please enter a number ";


    public static void main(String[] args) {
        // Decimal formatter for proper BAC
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(6);
        // Methods to get inputs for BAC
        int sex = getSex();
        int alc = getAlc();
        int weight = getWeight();
        int hours = hoursSinceLastDrink();
        double ratio;


        if (sex == 1)
            ratio = 0.73;
        else
            ratio = 0.66;

        double BAC = (((alc * 5.14)/weight * ratio) - (0.015 * hours));

        System.out.println(MessageFormat.format("\nYour BAC is {0}", decimalFormat.format(BAC)));
        if(BAC >= 0.08)
            System.out.println("It is not legal for you to drive.");
        else
            System.out.println("It is legal for you to drive.");
    }
    // get weight returns int for weight
    private static int getWeight() {
        System.out.print("What is your weight, in pounds? ");
        while (!in.hasNextInt()) {
                System.out.print(falseInput);
                in.nextLine();
        }
        return in.nextInt();
    }
    // get alc returns amount of alc consumed
    private static int getAlc() {
        System.out.print("How many ounces of alcohol did you have? ");
        while (!in.hasNextInt()) {
            System.out.print(falseInput);
            in.nextLine();
        }
        return in.nextInt();
    }

    // get sex returns if male or female
    private static int getSex() {
        System.out.print("Enter a 1 if you are a male or a 2 if you are a female ");
        while (!in.hasNextInt()) {
            System.out.print(falseInput);
            in.nextLine();
        }
        return in.nextInt();

    }
    // hours since last drink returns hours since last drink
    private static int hoursSinceLastDrink(){
            System.out.print("How many hours has it been since your last drink? ");
        while (!in.hasNextInt()) {
            System.out.print(falseInput);
            in.nextLine();
        }

        return in.nextInt();
        }
    }

