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
    public void describeYoursefl () {
        System.out.println("Hi, I`m " + name);
    }
    public static void genericDescription (){
        System.out.println("Generic description");
    }
    public static void main(String[] args) {

        FullAddress address = new FullAddress("Portugal", "Lisabon", "La Romana", "123");
        FullPerson person = new FullPerson("Anna", "Kolka", 25, address);
        System.out.println("Person is : " + person);
        person.describeYoursefl();

        FullPerson personWithoutAddress = new FullPerson("Saule", "Kovale", 39, null);
        personWithoutAddress.describeYoursefl();

        genericDescription();

    }


}
