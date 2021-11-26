/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Jonah Fernandez
 */

import java.util.Scanner;

public class Solution16 {
    // Scanner Object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
         // driver code
         ageLimit();
    }
    // Method for getting and returning age
    // print statement with conditionals for output
    private static void ageLimit(){
        System.out.print("What is your age? ");
        int age = in.nextInt();
        if (age >= 16) System.out.println("You are old enough to legally drive.");
        else System.out.println("You are not old enough to legally drive");
    }

}