package com.sda.she_likes_java.common_behaviour.wrong_approach;

public class Parrot extends Bird implements Flyable, Moveable{
    @Override
    public void fly() {
        System.out.println("Parrot can fly");
    }

    @Override
    public void move() {

    }
}
