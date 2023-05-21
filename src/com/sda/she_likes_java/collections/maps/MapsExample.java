package com.sda.she_likes_java.collections.maps;

import com.sda.she_likes_java.collections.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {
       // int grade = null; for int we can`t assign null
        Integer aInteger = null; //Integer is int`s mirror, like Long is long`s mirror
        // mirrors uses for collections
        List<Integer> intNumbers = new ArrayList<>();
        intNumbers.add(1);
        intNumbers.add(2);
        intNumbers.add(3);
        intNumbers.add(null);
        long grade = -1;// with long we cannot have list
        //Long longGrade = null;
        Long longGrade = 2L;// Long is able to store all the numbers + null
        longGrade = null;// with Long we can have list
        String name = null; // objects without value
        List<Long> numbers;
        // String the name of student
        //List <Long> will be students grades
        Map<String, List<Long>> studentsGrades = new HashMap<>();
        String john = "John";
        List<Long> johnsGrades  = new ArrayList<>();
        johnsGrades.add(5L);
        johnsGrades.add(2L);

        List<Long> anotherListOfGrades = new ArrayList<>();
        anotherListOfGrades.add(3L);

        studentsGrades.put(john,johnsGrades);
        System.out.println("After adding John to map: "  + studentsGrades);
        System.out.println("-----------------");
        studentsGrades.put(john,anotherListOfGrades);
        System.out.println("After resigning John inside map: " + studentsGrades);
        System.out.println("-----------------");

        Person me = new Person("Mariusz", "P");
        System.out.println(me);
        System.out.println("----------------");
        me = new Person("Mariusz", "W");
        System.out.println(me);
        System.out.println("----------------");
        Map<String, String> namesAndSurnames = new HashMap<>();
        namesAndSurnames.put("Ramune", "LTU");
        System.out.println("Ramune`s surname: " + namesAndSurnames.get("Ramune"));
        System.out.println("----------------");
        System.out.println("LTU`s name is: " + namesAndSurnames.get("LTU"));
    }
}
