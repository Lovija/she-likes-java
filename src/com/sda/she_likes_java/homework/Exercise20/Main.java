package com.sda.she_likes_java.homework.Exercise20;

public class Main {
    public static void main(String[] args) {
        CarUtils.safeCast(new Mazda());
        CarUtils.safeCast(new Ferrari());
        CarUtils.safeCast(new Toyota());
        CarUtils.safeCast(new Car());
        BMW bmw = new BMW();
       bmw.speedUp();
        CarUtils.safeCast(bmw);
    }
}
