//packages use reverse domain names
package com.sda.she_likes_java.homework;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //just showing numbers
        System.out.println("123000000000");
        // variable:
// holder for data
// needs good name e.g. myDaughterAge
// needs type of variable
// that data type limit possible set of allowed values
// int - integer numbers
        int myDaughterAge = 6;
//assingnig new value
        myDaughterAge = 8;
//sout - enter shortcut for System.out.println
        //string type is for words and letters
        System.out.println(myDaughterAge);
        //use camel case starting with lower letter
        String myName = "Loveta";
        String mySurname = "Sēja";
        System.out.println(myName + " " + mySurname);
//understands in brackets like words not numbers
        String five = "5";
        String otherfive = "5";
        System.out.println(five + otherfive);

        //true and false
        boolean trueValue = true;
        trueValue = false;
        System.out.println(trueValue);

        //11.0
        int eleven = 11;
        //double type for decimal number fraction part
        double trueEleven = 11.0;
        System.out.println(trueEleven);

        System.out.println("Exercise 7");
        int sum = 5 + 8;
        System.out.println("Sum of 5 and 8 is = " + sum);

        int difference = 11 - 4;
        System.out.println("Difference of 11 and 4 is: " + difference);

        int product = 5 * 8;
        System.out.println("Product of 5 and 8 is: " + product);

        double quotient = 5.0 / 8.5;
        System.out.println("Quotient of 5.0 and 8.5 is: " + quotient);

        System.out.println("Reminder");
        int result = 9 / 4;
        System.out.println("result is: " + result);
//modulo operator - remainder operator: 9/4=2 and 1 remains (2*4=8; 9-8=1)
        result = 9 % 4;
        System.out.println("and now result is: " + result);

    }
}