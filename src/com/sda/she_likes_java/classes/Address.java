package com.sda.she_likes_java.classes;

public class Address {
    String country;
    String city;
    String street;
    String postalCode;


    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Address myFirstAddress = new Address();
        myFirstAddress.country = "Latvia";
        myFirstAddress.city = "Jelgava";

        Address mySecondAddress = new Address();
        mySecondAddress.country = "Latvia";
        mySecondAddress.city = "Riga";
        System.out.println("City from first address is " + myFirstAddress.city);
        System.out.println("City from second address is " + mySecondAddress.city);
        System.out.println(myFirstAddress);
        System.out.println(mySecondAddress);
    }

}
