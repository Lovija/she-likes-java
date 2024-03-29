package com.sda.she_likes_java.visibility.default_modifier.example;

public class BetterCar {
    private String brand;
    private String model;
    private String colour;
    private int rpm;
    private int currentGear;

    public BetterCar(String brand, String model, String colour) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
    }
    // encapsulation - hiding internal state behind outside user and exposing just the methods - we do this with word "private"
    public void increaseSpeed () {
        currentGear++;
        rpm = currentGear *100;
    }
}
