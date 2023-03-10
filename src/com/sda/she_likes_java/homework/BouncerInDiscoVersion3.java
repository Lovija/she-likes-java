package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDiscoVersion3 {
    public static void main(String[] args) {
    System.out.println("Party time?!");
    System.out.println("Somebody is coming to the club");
    System.out.println("Hi, how old are you: ");
    Scanner inputReader = new Scanner(System.in);
    String declineMessage = "Sorry, go home";
    int age = inputReader.nextInt();
        System.out.println("Let me know yor height: ");
        double height = inputReader.nextDouble();
        boolean isAllowedToParty = age>=18 && height>=1.55;
    if (isAllowedToParty) {
        System.out.println("Have great time at disco!");

    } else {
        System.out.println(declineMessage);
    }


}
}
