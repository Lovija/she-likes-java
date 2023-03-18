package com.sda.she_likes_java.loops.do_while;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGameWithBrake {
    public static void main(String[] args) {
        //random makes random number in console
        Random numberGenerator = new Random();
        //when you write number in brackets nextInt, then shows name bound
        int someRandomNumber = numberGenerator.nextInt(20);
        int numberOfTrials = 4;

       //System.out.println("Random number provided by java is: "+someRandomNumber);
        //generate one more number and user needs to
        Scanner inputReader = new Scanner(System.in);
        int userAnswer;
        System.out.println("Play game with me");

        do  {

            System.out.println("Guess a number between 1 and 20");
            userAnswer =inputReader.nextInt();
            numberOfTrials--;
            if (numberOfTrials <=0 ){
                System.out.println("Sorry, no more trials.");
                break;
            }
        }
        while (userAnswer!=someRandomNumber);
        //!= means different
        if (userAnswer == someRandomNumber) {
            System.out.println("Great, You guessed it! :)");
        }
        else {
            System.out.println("You`ve lost! :)");
        }
    }
}
