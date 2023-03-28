package com.sda.she_likes_java.classes.constructor;

public class FullPerson {
    String name;
    String surname;
    int age;
    FullAddress address;
    public FullPerson() {
    }

    public FullPerson(String name, String surname, int age, FullAddress address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }


    @Override
    public String toString() {
        return "FullPerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
    public static void main(String[] args) {
        // we would like to
        FullAddress address = new FullAddress("Portugal", "Lisabon", "La Romana", "123");
        FullPerson person = new FullPerson("Anna", "Kolka", 25, address);
        System.out.println("Person is : " + person);

    }


}
