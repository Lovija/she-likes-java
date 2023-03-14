package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncersInDiscoStory {
    public static void main(String[] args) {
        System.out.println("A story about bouncers in Disco");
        System.out.println("Let`s trial teh first bouncer!");
        int bouncerAge;
        double bouncerHeight;
        boolean canSingWell;
        String declineMessage= "You can`t enter the disco!";
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Hi, how old are you");
        bouncerAge = inputReader.nextInt();
        System.out.println("How tall you are?");
        bouncerHeight = inputReader.nextDouble();
        System.out.println("Can you sing well? true/false?");
        canSingWell = inputReader.nextBoolean();
        boolean youCanEnterTheDisco = bouncerAge>=18 && bouncerHeight>=1.55 && canSingWell == true;
            if (youCanEnterTheDisco){
                System.out.println("Welcome to the party!");
            }
            else {
                System.out.println(declineMessage);
                System.out.println("Let`s try the second bouncer!");
                System.out.println("How old are you?");
                bouncerAge = inputReader.nextInt();
                System.out.println("How tall are you?");
                bouncerHeight = inputReader.nextDouble();
                System.out.println("Can you sing well? true/false?");
                canSingWell = inputReader.nextBoolean();
                youCanEnterTheDisco = bouncerAge>=55 || bouncerHeight>=1.55 || canSingWell==true;
                if (youCanEnterTheDisco){
                    System.out.println("Great, let`s party!");
                }
                else {
                    System.out.println(declineMessage);
                }

            }

    }
}
