package com.sda.she_likes_java.visibility.private_modifier.cars;

public class Main {

    public static void main(String[] args) {
        Cars funnyCar = new Cars();
        funnyCar.setBrand("Toyota");
    // we can`t see brand here in suggestions, because it is private and private variables we can use only in that class
   funnyCar.model = "Corolla";
   funnyCar.colour = "pink";

    }
}
