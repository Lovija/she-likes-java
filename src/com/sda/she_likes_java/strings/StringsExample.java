package com.sda.she_likes_java.strings;

public class StringsExample {
    public static void main(String[] args) {
        String name  = "Loveta";
        String surname  = "Sēja";
        int age = 31;
        System.out.println("Hi, I`m "+ name +" "+ surname+". I am "+ age + " old.");
        System.out.println(String.format("Hi, I`m %s %s. I am %s old.",name, surname, age));
        System.out.println("Hi, I`m %s %s. I am %s old".formatted(name,surname,age));
    }
}
