package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDiscoStoryFunctions {
    public static void main(String[] args) {
        System.out.println("Hi, we will check out can you attend the Disco");
        Scanner inputReader = new Scanner(System.in);
        int age;
        double height;
        boolean isAbleToSingWell;
        String declineMessage = "Go gome.";
        System.out.println("How old are you?");
        age = inputReader.nextInt();
        System.out.println("How tall are you?");
        height = inputReader.nextDouble();
        System.out.println("Can you sing well? True/False");
        isAbleToSingWell = inputReader.nextBoolean();
        boolean canEnterTheDisco = checkedByYoungBouncer(age, height, isAbleToSingWell);
        if (canEnterTheDisco) {
            System.out.println("Welcome to the Disco!");
        } else {
            System.out.println(declineMessage);
            System.out.println("Let`s try the second bouncer");
            System.out.println("How old are you?");
            age = inputReader.nextInt();
            System.out.println("How tall are you?");
            height = inputReader.nextDouble();
            System.out.println("Can you sing well? True/False");
            isAbleToSingWell = inputReader.nextBoolean();
            canEnterTheDisco = checkedByOldBouncer(age, height, isAbleToSingWell);
            System.out.println("Great, welcome to the party");
            if (canEnterTheDisco) {
                System.out.println("Great, let`s party!");
            } else {
                System.out.println(declineMessage);
            }
        }
    }
    //first line is function prototype

    public static boolean checkedByYoungBouncer(int age, double height, boolean isAbleToSingWell) {
        return age >= 18 && height > 1.55 && isAbleToSingWell == true;
    }

    public static boolean checkedByOldBouncer(int age, double height, boolean isAbleToSingWell) {
        return age >= 55 || height >= 1.55 || isAbleToSingWell == true;

    }

}
