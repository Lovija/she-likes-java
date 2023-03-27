package com.sda.she_likes_java.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;// we can declare many variables in one row, not everyone needs to write before int
        int d = 4;
        int e = 5;

        int [] numbers = new int[5]; //array which is able to hold five values
        // for int type default value is 0
        // indexes start from 0 to 4, because of the default value
        System.out.println("First element from array is: " + numbers[0]);
        System.out.println("Last element from this array is: " + numbers[4]);
        System.out.println("Last element always is array size -1");
        //System.out.println("Is it correct to use number [5]? "+numbers[5]);
        System.out.println("is this line printed?");

        System.out.println("Trying to init array");
        numbers[0] = 10;
        numbers [1] = 15;
        numbers [2] = 150;
        numbers [3] = 225;
        numbers [4] = 25;
        System.out.println("number [4] is: "+numbers[4]);

        System.out.println("size of the numbers array is: " + numbers.length);

        //arrays have fixed size, they cannot grow
        //numbers.lenght = 10;

    }
}
