package com.sda.she_likes_java.arrays;

import java.util.Random;

public class EnglishSchoolGrades {
    /* - opening part of multiline comment
Exercise 13
Create an int array with 100 elements
Initialise each element with a value 3 times greater than the current index
e.g.
tab[0] = 3 * 0
tab[10] = 3 * 10.

     */ // closing part of multiline comment
    public static void main(String[] args) {
        //were going to assing every possible value for array using random
        int [] myGradesOnEnglishClass = new int[100];
        Random gradeGenerator = new Random();
    //here we generate 100 values that all are 0
        for (int index = 0; index< myGradesOnEnglishClass.length; index++) {
        myGradesOnEnglishClass [index] = 1 + gradeGenerator.nextInt(7); // number 1 before gradeGenerator makes that no one will get value 0 and max value is 7
        }
        //here we generate different numbers for 100 values
        for (int index = 0; index < myGradesOnEnglishClass.length; index++){
            System.out.println("my grade on index nr: "+index+ " is: "+myGradesOnEnglishClass[index]);
        }
        // here we print random 100 grades that max value is 7
    // if we don`t have the first for lines, then it will print our 100 zero values for us, because the default value is 0

    }
}
