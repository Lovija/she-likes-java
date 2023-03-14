package com.sda.she_likes_java.functions;

public class FunctionsFirstExample {
    //it`s function. always runs main function
    public static void main(String[] args) {
        //it is a piece of the code I can call many times
        //function features
        //has name just before opening brackets like "main"
        //has parameters - inside brackets :String [] args
        //has return value - type name before name of the function this time "void"
        //void means no return - doesnt repeat anything or stops somewhere
        //we call function by it`s name
        printMyName();
        System.out.println();
        System.out.println("After call..");
        System.out.println();
        printMyName();
    }
    //it`s function
    public static void printMyName(){
        int numberOfThime = 10;
        while (numberOfThime>0) {
            System.out.println("Hi, I`m Loveta");
            numberOfThime--;
        }
    }

}
