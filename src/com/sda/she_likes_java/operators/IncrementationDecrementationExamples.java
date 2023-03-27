package com.sda.she_likes_java.operators;

public class IncrementationDecrementationExamples {
    public static void main(String[] args) {
        int one = 10;
        int two = 10;
        //lets try to increase first value by one ande second value decrease by one
        one++;//postincrementation
        two--;//postdecrementation
        System.out.println("One value is: " + one);
        System.out.println("Two value is: " + two);
        ++one;//preincrementation
        --two;//predecrementation
        System.out.println("One value is: " + one);
        System.out.println("Two value is: " + two);

        int three = ++one;
        System.out.println("One value is: " + one);
        System.out.println("Three should have value of 13, current value is: " + three);

        System.out.println("Incrementation explanation..");
        int four = one++;
        System.out.println("One value is  "+one);
        System.out.println("postincrementation is going to assign to your current/last value of one and later we`re going to increase value of one");
        System.out.println("four value is: "+four);
        four = ++one;
        System.out.println("one value is: "+one);
        System.out.println("four value is: "+four);
        System.out.println("precrementation - first increment, later user new value in assignment expression");
    }
}
