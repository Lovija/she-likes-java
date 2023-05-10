package com.sda.she_likes_java.homework.Exercise18_example;

public class Main {
    public static void main(String[] args) {
        Airplaine myAirplaine = new Airplaine();
        myAirplaine.takeOff();
        myAirplaine.takeOff();
        System.out.println("Let`s go Paris!");
        myAirplaine.flyTo(21,52);
        myAirplaine.land();
        myAirplaine.land();
    }
}
