/**
 * Java program to demonstrate dividing by 0 with Arithmetic Exception and Infinity results.
 */

package com.mymath;

/**
 * Main class.
 */
public class Main {

    // Method main to run java program
    public static void main(String[] args) {

        // Creating int variable
        int int_number = 39;

        // Divide int value by o and printing result to console
        try {

            System.out.println(int_number / 0); // Output: java.lang.ArithmeticException: / by zero

        } catch (ArithmeticException e) {

            e.printStackTrace();

        }

        // Creating double variable
        double number1 = 39.7;

        // Divide double value by o and printing result to console
        System.out.println(number1 / 0.0); // Output: Infinity

        // Creating float variable
        float number2 = 36.3f;

        // Divide float value by o and printing result to console
        System.out.println(number2 / 0f); // Output: Infinity

    }
}