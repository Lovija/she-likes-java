package com.sda.she_likes_java.virtual_methods;

public class HumanLife {
    public void tellMeWhoYouAre(Human human){
        if (human !=null) {
            human.whoYouAre();
        }
    }
    public void tryToCastHumanToMan(Human maybeWomanOrMan){
        if (maybeWomanOrMan instanceof Man){
            System.out.println("Man like to clean");
            //instanceof will check if the object is man or woman true/false
            // if it is man, then casting is happening
       //casting or down-casting from generic to specific
        // casting works for references

            ((Man) maybeWomanOrMan).learnToCleanHouse();
        }
       // ((Woman)maybeWomanOrMan).learnJava(); //if we want to get to learn java from woman class and it doesn`t work, because man and woman are different classes
        // every woman is a human, but not  every human is woman
        if (maybeWomanOrMan instanceof Woman) {
            System.out.println("It`s woman learning Java");
            ((Woman) maybeWomanOrMan).learnJava();
        }
        }

}
