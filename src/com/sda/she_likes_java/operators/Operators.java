package com.sda.she_likes_java.operators;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Now, let`s try some operators");
        System.out.println("Logical operators");

        boolean firstValue;
         boolean secondValue;
         boolean evaluationResult;
         System.out.println("&& operator");
         firstValue = true;
         secondValue = true;
         evaluationResult = firstValue && secondValue;
        System.out.println("firstValue && secondValue: " + evaluationResult);

        firstValue = true;
        secondValue = false;
        evaluationResult = firstValue && secondValue;
        System.out.println("true && false: " + evaluationResult);

        firstValue = false;
        secondValue = true;
        evaluationResult = firstValue && secondValue;
        System.out.println("false && true: " + evaluationResult);

        firstValue = false;
        secondValue = false;
        evaluationResult = firstValue && secondValue;
        System.out.println("false && false: " + evaluationResult);


        System.out.println();
        System.out.println("Let1s test negation operator");
        firstValue = false;
        secondValue = !firstValue;
        System.out.println("!false is: "+secondValue);

        firstValue = true;
        secondValue = !firstValue;
        System.out.println("!true is: "+secondValue);

    }
    // comparing some value>=18, negation for all !(value>=18)
}
