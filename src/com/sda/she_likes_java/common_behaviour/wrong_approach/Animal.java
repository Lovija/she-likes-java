package com.sda.she_likes_java.common_behaviour.wrong_approach;

public class Animal implements Moveable{
  public void go(){
      System.out.println("I have legs and/or paws");
  }

    @Override
    public void move() {
        System.out.println("Animal is moving");
    }
    //public void fly(){
    //  System.out.println("I have wings");
  //} if we take out fly method from here, because not all animal can fly
}
