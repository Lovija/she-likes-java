package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDisco {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("How old are you: ");
        int personAge = inputReader.nextInt();
        System.out.println();
        System.out.println("How m tall are you: ");
        double personHeight = inputReader.nextDouble();
        System.out.println();
        if (personAge >= 16 & personHeight >= 1.55) {
            System.out.println("Hello disco dancer!");
        } else {
            System.out.println("Go party at your house!");
        }


    }
}
