package com.sda.she_likes_java.classes.private_access;

import com.sda.she_likes_java.classes.constructor.FullPerson;

public class UsingFullPersonExample {
    public static void main(String[] args) {
        FullPerson maybeMe = new FullPerson("Anna", "Kolka", 36, null);
        System.out.println("my age: " + maybeMe.getAge());
        System.out.println("me before age decreasing: "+maybeMe);
        maybeMe.setAge(-1);
        System.out.println("me after failed trial to decrease age "+maybeMe);
        // if we want to get name, age etc from other class that is private.
        //then we should go to that class > right mouse button > generate > getter and setter> mark the variables that we want to use in other classes
        // in other classes after dot it will be getAge; getName etc.
        // we can change parameters only in main class from which we get data
    }
}
