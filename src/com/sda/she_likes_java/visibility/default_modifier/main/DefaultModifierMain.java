package com.sda.she_likes_java.visibility.default_modifier.main;

import com.sda.she_likes_java.visibility.default_modifier.cars.Car;

public class DefaultModifierMain {
    public static void main(String[] args) {
        //try to use Car class with default visibility
        Car car = new Car();
    } // we are not able to use package with private/default visibility outside the package
}
