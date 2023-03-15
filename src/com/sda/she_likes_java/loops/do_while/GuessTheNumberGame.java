package com.sda.she_likes_java.loops.do_while;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        //random makes random number in console
        Random numberGenerator = new Random();
        //when you write number in brackets nextInt, then shows name bound
        int someRandomNumber = numberGenerator.nextInt(10);
        int userAnswer;
       //System.out.println("Random number provided by java is: "+someRandomNumber);
        //generate one more number and user needs to
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Play game with me");

        do {
            System.out.println("Guess a number between 1 and 10");
            userAnswer =inputReader.nextInt();
        }
        while (userAnswer!=someRandomNumber);
        //!= means different

        System.out.println("Great, You guessed it! :)");
    }
}
