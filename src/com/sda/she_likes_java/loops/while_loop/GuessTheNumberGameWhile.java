package com.sda.she_likes_java.loops.while_loop;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGameWhile {
    public static void main(String[] args) {
        //random makes random number in console
        Random numberGenerator = new Random();
        //when you write number in brackets nextInt, then shows name bound
        int someRandomNumber = numberGenerator.nextInt(10);
       //System.out.println("Random number provided by java is: "+someRandomNumber);
        //generate one more number and user needs to
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Play game with me");
        System.out.println("Guess a number between 1 and 10");
       int userAnswer =inputReader.nextInt();
        while (userAnswer != someRandomNumber){
            System.out.println("Guess a number between 1 and 10");
            userAnswer =inputReader.nextInt();
        }
        //!= means different

        System.out.println("Great, You guessed it! :)");
    }
}
