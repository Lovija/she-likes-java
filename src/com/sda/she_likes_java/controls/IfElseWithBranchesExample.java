package com.sda.she_likes_java.controls;

import java.util.Scanner;

public class IfElseWithBranchesExample {
    public static void main(String[] args) {
        //get user age
        //0-10
        //11-20
        //21-30
        //>30
        //print a message your age is between 0-10
        int age;
        Scanner inputReader = new Scanner(System.in);
        System.out.println("How old are you?");
        age = inputReader.nextInt();
        if (age>0 && age<=10){
            System.out.println("Hi you are between 0 and 10");
        }
        else if (age >=11 && age <=20){
            System.out.println("You`re between 11 and 20");
        } else if (age >=21 && age <=30) {
            System.out.println("You`re between 21 and 30");
        }
        else {
            System.out.println("You`re older than 30");
        }

    }
}
