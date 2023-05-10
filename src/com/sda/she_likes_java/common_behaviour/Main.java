package com.sda.she_likes_java.common_behaviour;

public class Main {
    public static void main(String[] args) {
        //Animal bird = new Bird();if we take fly method from Animal this row won`t work
        Bird bird = new Bird();
       // bird.fly();

        Animal tiger = new Tiger();
        tiger.go();

        Bird parrot = new Parrot();
        parrot.go();
        Bird ostrich = new Ostrich();
        ostrich.go();
         Flyable superman = new Superman();
         superman.fly();
         Flyable flyableParrot = new Parrot();
        // Swimmable tiger2 = tiger; we need to make new tiger because in Animal class there is no reference to swimmable
        Swimmable tiger2 = (Swimmable)tiger;
        Swimmable swimmableTiger = new Tiger();
        Swimmable swimmableSuperman = (Swimmable) superman;
        swimmableSuperman.swim();
        Superman superSuperMan = new Superman();
        Flyable superFly = superSuperMan;
        superFly.fly();
        Swimmable superSwim = superSuperMan;
        superSwim.swim();

        // new Tiger assignment
        Tiger newTiger = new Tiger();
        newTiger.go();
        newTiger.swim();
        Animal animalTiger = new Tiger();
        animalTiger.go();
        Swimmable swimmableTiger2 = new Tiger();
        swimmableTiger2.swim();
        Object objectTiger = new Tiger();
        // none of the methods go or swim are visible to object reference
    }
}
