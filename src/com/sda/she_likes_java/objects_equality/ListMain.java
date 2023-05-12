package com.sda.she_likes_java.objects_equality;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
    List personList = new ArrayList<>();

    Person me = new Person("Monika", "Saule", 12);
    Person me2 = new Person("Alise", "Rits", 25);
    Person otherPerson = new Person("John", "Rail", 45);
    personList.add(me);
    personList.add(me2);
    personList.add(otherPerson);
    // we are adding objects wit these lines personList.add...
        System.out.println(personList);
        System.out.println("Try to get person out of list");
        System.out.println("second person from list " + personList.get(1));// java starts counting from zero, that`s why second is in index 1

        Person personFromList = (Person) personList.get(2);
        System.out.println("Third person from list: " + personFromList);
        Object fromPosition0 = personList.get(0);
        System.out.println("age of the person fromPosition: " + ((Person)fromPosition0).getAge());


        List<Person> betterPersonList = new ArrayList<>();
        betterPersonList.add(me);
        Person fromTheList = betterPersonList.get(0);
        System.out.println("First person from the list: "+fromTheList);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("pink"));
        cars.add(new Car("blue"));
        System.out.println("Car colour is: " + cars.get(0).colour);


    }
}
