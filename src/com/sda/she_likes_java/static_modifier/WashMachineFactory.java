package com.sda.she_likes_java.static_modifier;

public class WashMachineFactory {
    public static void main(String[] args) {
        System.out.println("Current number of washing machines is: " + WashMachine.getNumberOfCreatedMachines());
        // let`s make 2 samsung washing machines
        WashMachine samsung = new WashMachine("Samsung", "1x2");//first created object
        System.out.println("Current number of created machines is: "+WashMachine.getNumberOfCreatedMachines());
        System.out.println("Samsung serial number is: "+samsung.getSerialNumber());
        samsung.setSerialNumber(5);// let`s try to modify number of produced machines
        //do not use instance references to access static members(fields/methods)
        System.out.println("Serial number for samsung now is: " + samsung.getSerialNumber());
        samsung.setNumberOfCreatedMachines(1000);
        samsung.increaseSerialNumber();
        System.out.println("Serial number for samsung now is: " + samsung.getSerialNumber());
        samsung.increaseSerialNumber();
        samsung.increaseSerialNumber();
        samsung.increaseSerialNumber();//how many times this line is repeated, this time 3, it increases number by that number
        System.out.println("Serial number for samsung now is: " + samsung.getSerialNumber());
        WashMachine samsung2 = new WashMachine("Samsung", "2x2");//we created new object
        System.out.println("Current number of created machines is: "+WashMachine.getNumberOfCreatedMachines());
        System.out.println("Samsung2 serial number is: "+samsung2.getSerialNumber());

        for (int i = 0; i < 10; i++) {
            //10 times we produced LG machines i<10 means it will run 10 times
            makeSomeWashMachines();
            //some generic way to know number of produced washing machines

        }
        System.out.println("We`ve made lots of washing machines: " + WashMachine.getNumberOfCreatedMachines());// in order to see how many machines are made, we need to ask to the class that`s make machines

    }

    //let`s create another method of producing washing machines
    public static void makeSomeWashMachines() {
        new WashMachine("LG", "1.1.");
        new WashMachine("LG", "1.2.");
        new WashMachine("LG", "1.3.");
        new WashMachine("LG", "1.4.");
        new WashMachine("LG", "1.5.");
    }
}
