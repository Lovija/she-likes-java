package com.sda.she_likes_java.classes;

public class PersonExample {
    public static void main(String[] args) {
        System.out.println("Let`s use our newly created class Person");
        Person me = new Person();
        me.name = "Loveta";
        Person you = new Person();
        you.name = "Jānis";
        // we created scanner from our person file
        //me is object variable, number ir primitive variable
        System.out.println("My name currently is " + me.name);
        System.out.println("You`re name is "+you.name);
        //result now is null, it means that we didn`t assigned value for variable yet
        // but if we define name like me.name = "Loveta"; than it will show

    }
}
