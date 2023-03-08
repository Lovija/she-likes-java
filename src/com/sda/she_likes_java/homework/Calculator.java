package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Calculator {
    // psvm shortcut for main function
    public static void main(String[] args) {
        System.out.println("com.sda.she_likes_java.homework.Calculator...");
        System.out.println("Calculating some of two numbers");
        System.out.println("Provide first number: ");
        double firstNumber;
        double secondNumber;
        //TODO: explain object creation
        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number: ");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " +secondNumber);
        //\n adds new line between, how many that have, so many lines it puts between
        double sum = firstNumber + secondNumber;
        System.out.println("\nSum is: " + sum);

        double difference = firstNumber - secondNumber;
        System.out.println("\nDifference is: " + difference);

        double product = firstNumber * secondNumber;
        System.out.println("\nProduct is: " + product);

        double quotient = firstNumber / secondNumber;
        System.out.println("\nQuotient is: " + quotient);
    }
}
