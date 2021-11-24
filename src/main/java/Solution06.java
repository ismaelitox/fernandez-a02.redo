/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */


import java.time.Year;
import java.util.Scanner;


public  class Solution06 {
    // declare static scanner object

    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // initialize variables for use
        // get int values from two methods
        // return int values to be used for math in the main method

        int currentAge = currentAge();
        int retiredAge = retiredAge();

        // use values returned from currentAge & retiredAge
        // print statement with concat  in the output
        // create new variables for use from returned methods
        int retireTime = (retiredAge - currentAge);
        System.out.println("You have " + retireTime + " years left until you can retire.");

        // initialize year object for use
        // create variable to add current year plus retireTime
        // print statement with concat from currentYear and retireYear
        int currentYear = Year.now().getValue();
        int retireYear = retireTime + currentYear;
        System.out.println("It's " +currentYear + ", so you can retire in "+ retireYear);





    }



    // method to receive string input from user
    // receive retire age
    // convert to int using next int
    // retuning inline int
    private static int retiredAge() {
        System.out.print("At what age do you wish to retire? ");
        return in.nextInt();
    }
    // method to receive string input from user
    // receive current age
    // convert to int using next int
    // returning inline int
    private static int currentAge() {
        System.out.print("What is your current age? ");
        return in.nextInt();
    }

}