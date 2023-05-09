package com.sda.she_likes_java.visibility.private_modifier.cars;
//it`s not possible mark class as private
public class Cars {
    private String brand;
    public String model;
    String colour;
//if for private object we get getter and setter, then we delete word "public" from public void setBrand
    //than this private object we can use in another class in the same package wit this row > funnyCar.setBrand("Toyota")
    // but we can`t use with getter and setter this object in different package
    // if we are not abel to get to the class than we won`t be able to get public objects in class
    public String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
}
