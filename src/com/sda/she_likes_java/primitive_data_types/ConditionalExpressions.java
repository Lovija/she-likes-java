package com.sda.she_likes_java.primitive_data_types;

public class ConditionalExpressions {
    public static void main(String[] args) {
        System.out.println("Conditionals");

        int age = 15;
        boolean isKid = age <18;
        System.out.println("isKid: "+isKid);
        boolean condition = false;
        if (true){
            System.out.println("This will be run only when condition is true");
        } else {
            System.out.println("This will be run when condition is false");
        }
    }
}
