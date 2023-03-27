package com.sda.she_likes_java.loops.for_loop;

public class ForLoopExample {
    public static void main(String[] args) {
        // we need to print 100 numbers
        for (
                int number = 0; //initialization part and executed only once
                number < 100; // condition of loop, will be executed while number is smaller than 100
                number ++ // executed before condition
        ){
            System.out.println("Number value is: " + number);
        }


        int number  = 0;
        while (number<100) {
            System.out.println("Number value is: "+number);
            number++;// if this line we put before sout, than it will print out number from 1 till 100. now it prints number from 0 till 99

        }
    }
}
