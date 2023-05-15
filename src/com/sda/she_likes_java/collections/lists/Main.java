package com.sda.she_likes_java.collections.lists;

import com.sda.she_likes_java.collections.Trousers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int a= 5;
        System.out.println("a is " + a);
        a = 6;// we can change variable a
        System.out.println("a is " + a);
        final int b = 7;//we are not abel to change value b, because it is final
        System.out.println("b is " + b);
        //b= 8;
        List<Trousers> trousers= new ArrayList<>();
        trousers.add(new Trousers("Jeans", "big star"));
        trousers.add(new Trousers("silk", "Versache"));
        trousers.add(new Trousers("jersey", "primemark"));
        showItemsFromTheList(trousers);// prints out all the trousers
        // let`s add item to list
        trousers.add(new Trousers("linen", "Nature"));
        // list.of is frozen list but array list is expandable
        List<Trousers> trousersList = List.of(
                new Trousers("Jeans", "Gucci"),
                new Trousers("cotton", "Armani"),
                new Trousers("wool", "Anne")
        );
        // we can`t add more trousers here if want to add something, than we need to do it inside of method or make another listof
        showItemsFromTheList(trousersList);

    }

    public static void showItemsFromTheList(List<Trousers> items) {
        //enhanced for loop write foreach
        for (Trousers currentItem: items) {
            System.out.println(currentItem);

        }
        //old loop write fori and it will write this
        //for (int i = 0; i < items.size(); i++) {
          //  Trousers currentItem = items.get(i);
            //System.out.println(currentItem);
        //}

    }
}
