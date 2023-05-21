package com.sda.she_likes_java.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ListSecondExample {
    private static int a;// this you can`t change because it is statics
    private int b;// this value you can change
    public static void main(String[] args) {
        List<String> names  = new ArrayList<>();
        names.add("Karolina");
        names.add("Ramune");
        names.add("Inese");
        names.add("Agnese");
        a=5;
        System.out.println(a);
        ListSecondExample one = new ListSecondExample();
        one.b = 6;
        ListSecondExample two = new ListSecondExample();
        two.b = 7;
        System.out.println(one.b);
        System.out.println(two.b);
        printNames(names);
        System.out.println("----------------------");
        printOnlySomeNames(names);
    }

    public static void printNames(List<String>names) {
        for (String singleName:names) {
            System.out.println("name is: " + singleName);
        }//singleNAmes is just how we name what we want to print out, here just names

    }

    public static void printOnlySomeNames(List<String>names){
        //starting from position 1 - second item
        for ( int index =1; index < names.size(); index++){
            System.out.println("name is: " + names.get(index));
        }

    }
}
