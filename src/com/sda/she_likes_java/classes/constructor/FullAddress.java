package com.sda.she_likes_java.classes.constructor;

public class FullAddress {
    public String country;
    public String city;
    public String street;
    public String postalCode;

    public FullAddress(String country, String city, String street, String postalCode) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalCode = postalCode;
    }
//riht mouse button > generate > constructor
// this is constructor with selected all the variables
    public FullAddress() {
    }
// this is constructor with none selected variables. Default constructor - without any parametres

    @Override
    public String toString() {
        return "FullAddress{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //create your own address
        FullAddress myAddress = new FullAddress();
        myAddress.city = "Riga";
        myAddress.country = "Latvia";
        myAddress.street = "Lucavsalas 3";
        myAddress.postalCode = "3008";
        System.out.println("FullAddress created by hand: "+myAddress);

        FullAddress createdWithFullConstructor = new FullAddress("Spain", "Barcelona", "La","12345");
        System.out.println("FullAddress created with constructor: "+createdWithFullConstructor);
    }
}
