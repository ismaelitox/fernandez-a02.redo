/*
 * UCF COP3330 Assignment 2 Solution
 * Copyright 2021 Jonah Ismael Fernandez
 */


import java.text.MessageFormat;
import java.util.Scanner;

public class Solution22 {
    // Scanner Object
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // declare new array
        int[] numArr = new int[3];
        int maxNum = getMax(numArr);
        // save to 1st index in array
        System.out.print("Enter the first number: ");
        numArr[0] = in.nextInt();
        // Save to 2nd index in array
        System.out.print("Enter the second number: ");
        numArr[1] = in.nextInt();
        // Save to 3rd index in array
        System.out.print("Enter the third number: ");
        numArr[2] = in.nextInt();

        System.out.println(MessageFormat.format("The largest number is {0}.", maxNum));
    }


    // Max search algorithm straight from stack over flow
    private static int getMax(int[] numArr)
    {
        int [] arr = new int[3];
        int max = arr[0];

        int i;
        for(i = 1; i < 3; i++)
        {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }




}
