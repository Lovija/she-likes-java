package com.sda.she_likes_java.homework.exercise21;

public class Main {
    public static void main(String[] args) {
        Venichle ship = new Ship();
        ship.move();
        ((Floating) ship).swim();

        Venichle airplane = new Airplane ();
        airplane.move();
        ((Flying)airplane).fly();

        Venichle submarine =  new Submarine();
        submarine.move();
        ((Diving)submarine).dive();

    }
}
