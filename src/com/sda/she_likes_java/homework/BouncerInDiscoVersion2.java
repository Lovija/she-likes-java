package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDiscoVersion2 {
    public static void main(String[] args) {
        System.out.println("Party time?!");
        System.out.println("Somebody is coming to the club");
        System.out.println("Hi, how old are you: ");
        Scanner inputReader = new Scanner(System.in);
        String declineMessage = "Sorry, go home";
        int age = inputReader.nextInt();
        if (age >= 18) {
            System.out.println("Ok, so you are " + age + " years old");
            System.out.println("Let me know your height: ");
            double height = inputReader.nextDouble();
            if (height >= 1.60 & height <= 2.00) {
                System.out.println("Great, welcome to the disco!");
            } else if (height < 1.60) {
                System.out.println(declineMessage);

            } else if (height > 2.00) {
                System.out.println("Sorry, we have low ceilings, go home.");
            }

        } else {
            System.out.println(declineMessage);
        }


    }
}
