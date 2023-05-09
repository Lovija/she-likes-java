package com.sda.she_likes_java.static_modifier;

public class WashMachine {
    private static int numberOfCreatedMachines;// this value is 0
    private String brand;
    private String model;
    private int serialNumber;
    // we don`t use static in serialnumber because, every new machine will have it`s own original serial number

    // static means that it share with everybody possible variables in code

    public int getSerialNumber() {
        return serialNumber;
    }

    public static void setNumberOfCreatedMachines(int numberOfCreatedMachines) {
        WashMachine.numberOfCreatedMachines = numberOfCreatedMachines;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public WashMachine(String brand, String model) {
        this.brand = brand;
        this.model = model;
        numberOfCreatedMachines++;//every time we are making new machine, we are counting it
        serialNumber++;
    }

    public static int getNumberOfCreatedMachines() {
        return numberOfCreatedMachines;
    }

    // we don`t need setter`s` because we are not changing brands and models of machines, they are produced like they are
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public void increaseSerialNumber() {
        serialNumber++;// here we work only with serial number, but not with number with machines or anything else
    }
    @Override
    public String toString() {
        return "WashMachine{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

}
