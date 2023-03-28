package com.sda.she_likes_java.homework;

public class Exercise13 {
    public static void main(String[] args) {
        /*
        Exercise 13
Create an int array with 100 elements
Initialise each element with a value 3 times greater than the current index
e.g.
tab[0] = 3 * 0
tab[10] = 3 * 10.
         */
        // create an int array with 100 elements and name it numbers
        int [] numbers = new int[100];
         // initialization phase
        // first index is :0
        //last index is numbers lenght -1, this case 100-1 = 99
        for (int i=0; i < numbers.length; i++) {
            // starts at 0, i< numbers.lenght means that values won`t be bigger than our array length, because i++ means it will continiously grow
            System.out.println("Currents value of i is "+i);
            numbers [i] = 3 * i;

        }
        //read data from last element till first one
        for (int i = numbers.length -1; i > -1; i--){
            // i>-1 is because the first value in java is 0, instead we can use i >=0
            //i--, we can write also i=i-2 to show only some numbers not alla 99, 97, 95...
            System.out.println("number [" + i + "] = " + numbers[i]);
        }
    }
}
