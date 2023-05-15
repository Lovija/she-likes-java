package com.sda.she_likes_java.collections.maps;

import com.sda.she_likes_java.collections.Person;
import com.sda.she_likes_java.collections.Trousers;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Maps are like dictionary");
        // type of the key is string
        //type of the value is Trousers
        // key:"my favourite jeans"
        //value: new Trousers("jeans", "big star")
        Map<String, Trousers> myJeans = new HashMap<>();
        myJeans.put("my favourite jeans", new Trousers("jeans", "big star"));
        myJeans.put("my old one",new Trousers("unknow material", "primemark"));
        myJeans.put("my old one",new Trousers("cotton material", "primemark"));//this line overwrite the previous one
        System.out.println(myJeans);


        Map<Person, Trousers> personsTrousers = new HashMap<>();
        personsTrousers.put(new Person("Mariusz", "Pas"), new Trousers("cotton", "primemark"));
        personsTrousers.put(new Person("Salvis", "Laza"), new Trousers("cotton", "primemark"));
        System.out.println(personsTrousers);// order of the printed items is not granted how will it  print out



    }
}
