package com.sda.she_likes_java.loops.while_loop;

public class WhileIGrow {
    public static void main(String[] args) {
        int ageOfTheKid = 1;
        while (ageOfTheKid<18){
            System.out.println("Mommy, can I go to the disco " + ageOfTheKid+ " years old");
            System.out.println("No");
           // ageOfTheKid = ageOfTheKid+1;
            ageOfTheKid++;// increases value by one
        }
        System.out.println("I am " +ageOfTheKid+" years old. Mommy: Go to disco!");
    }
}
