package com.sda.she_likes_java.loops.while_loop;

public class WhileLoop {
    public static void main(String[] args) {
        // how to make our calculations in a loop
        System.out.println("I`m here");
        System.out.println("I`m here");
        System.out.println("I`m here");
        boolean condition = false;
        //while loop is going to be executed only when condition is true. Condition is in brackets
        //the body of while loop is going to be repeated as many times as condition is true
  //      while (true) {
    //    System.out.println("Java forever");
  //      }
        while (condition){
            System.out.println("Java forever");
        }
        int numberOfTrials = 5;
        while (numberOfTrials>0){
            System.out.println("I`m working");
            numberOfTrials= numberOfTrials - 1;
            if (numberOfTrials %2 == 1){//printing out just odd number, if == is 1 than printed out will be just odd numbers, when the is 0, then there will be printed out even numbers
            System.out.println("Current value of numberOfTrials: "+numberOfTrials);
            }
        }
        System.out.println("The End");
    }
}
