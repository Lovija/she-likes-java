package com.sda.she_likes_java.loops.do_while;

public class FromDoWhileToWhileRefactoring {
    public static void main(String[] args) {
        int numberOfTrials = 3;

        do {
            System.out.println("Current number of trials: "+numberOfTrials);
            numberOfTrials--;
        } while (numberOfTrials>0);
        System.out.println("Let`s refactor that to while loop.");
        numberOfTrials = 3;// we should set value for number again, because the previous is 0
        while (numberOfTrials>0){
            System.out.println("While loop, number of trials");
            numberOfTrials--;

        }

    }
}
