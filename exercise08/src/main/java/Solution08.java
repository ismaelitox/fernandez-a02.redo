/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */

import java.text.MessageFormat;
import java.util.Scanner;

public class Solution08 {
    // Scanner object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // initialize variables for methods
        // int values for each number
        // set methods to get values
        int numPeople = numPeople();
        int numPizza = numPizza();
        int numSlices = numSlices();

        // initialize values for math
        // use values returned from methods
        // totalSlices will be product of pizzas and slices
        // personSlices will be division of total slices and people
        // leftoverPizza will be mod of num slices and num people
        int totalSlices = numPizza * numSlices;
        int personSlices = totalSlices / numPeople;
        int leftoverPizza = numSlices % numPeople;


        // fancy shmancy formatted print statements for with outputs returned from methods & math
        System.out.println(MessageFormat.format("{0} people with {1} pizzas ({2} slices)", numPeople, numPizza, totalSlices));
        System.out.println(MessageFormat.format("Each person gets {0} pieces of pizza.", personSlices));
        System.out.println(MessageFormat.format("There are {0} leftover pieces.", leftoverPizza));
    }
    // method for getting number of slices
    // parsing string input to int
    // returning int value
    private static int numSlices() {
        System.out.print("How many slices do you have? ");
        String slices = in.nextLine();
        return Integer.parseInt(slices);
    }
    // method for getting number of pizzas
    // parsing string input to int
    // returning int value
    private static int numPizza() {
        System.out.print("How many pizzas do you have? ");
        String pizzas = in.nextLine();
        return Integer.parseInt(pizzas);
    }
    // method for getting number of people
    // parsing string input to int
    // returning int value
    private static int numPeople() {
        System.out.print("How many people? ");
        String people = in.nextLine();
        return Integer.parseInt(people);
    }
}
