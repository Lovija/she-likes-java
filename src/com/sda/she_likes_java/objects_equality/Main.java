package com.sda.she_likes_java.objects_equality;

public class Main {
    public static void main(String[] args) {
        int a =5 , b = 10;
        int c = 5;
        System.out.println("Are a and b equal? " + (a==b));
        System.out.println("Are a and c equal? " + (a==c));

        String name1 = "Monika";
        String name2 = "Monika";
        System.out.println("name 1 equals name2? " + (name2 == name1));

        String name3 = new String("Monika");
        String name4 = new String("Monika");
        System.out.println("Name3 equals name4? " + (name3 == name4));
        String name5 = name4;
        System.out.println("Name5 equals name4? " + (name5 == name4));


        Person first = new Person("Monika", "Vind",19);
        Person second = new Person("Monika","Vind",19 );

    //using generate > equals and hastags > mark all - in person class
        System.out.println("first equals second? " + (first == second));
        System.out.println("first is equal to second: " + (first.equals(second)));

    }
}
