package com.sda.she_likes_java.operators;

public class IncDecVersion2 {
    public static void main(String[] args) {
        System.out.println("First postincrementation");
        int age = 17;

        boolean isAdult = age>=18;
        System.out.println("isAdult value "+isAdult);

        isAdult = age++ >= 18;//this line first looks at value first age value 17, after that it adds one year isAdult = age >=18; age ++
        System.out.println("isAdult value "+isAdult);
        System.out.println("age is "+age);

        System.out.println("Now precrementation");

        age = 17;

        isAdult = age>=18;
        System.out.println("isAdult value "+isAdult);

        isAdult = ++age >= 18;//placing ++ore -- before value it means before value is increasing/decreasing and after that it lokks how value is true ore false to conditions
        System.out.println("isAdult value "+isAdult);
        System.out.println("age is "+age);

    }
}
