package com.sda.she_likes_java.common_behaviour;

public class Tiger extends Animal implements Swimmable{
    @Override
    public void go() {
        System.out.println("Tiger likes to run ");
    }


    @Override
    public void swim() {
        System.out.println("Tigers like to swim, especially in hot day");
    }
}
