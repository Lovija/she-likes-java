package com.sda.she_likes_java.polymorphism;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Animal someAnimal = new Animal();
       Cat myCat = new Cat();
        Animal secondCat= new Cat();
        secondCat.makeSound();
        Animal dog = new Dog();
        dog.makeSound();

        callAnimal(someAnimal);
        callAnimal(myCat);
        callAnimal(dog);
        callAnimal(new Elephant());

        Object anotherCat = new Cat();
        //anotherCat.makeSound();
        Animal animalCat = new Cat();
        Cat thirdCat = new Cat();
    }
    public static void callAnimal(Animal animal){
        animal.makeSound();

    }
}
