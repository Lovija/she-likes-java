package com.sda.she_likes_java.objects;

public class HouseExample {
    public static void main(String[] args) {
        House myHouse = new House(4, 2);
        myHouse.setNumberOfFloors(2);
        System.out.println("I`ve got new house: "+myHouse);
        //stage 1

        System.out.println("Currently my house has got "+ myHouse.getNumberOfRoom() + " rooms");
        System.out.println("I need more rooms...");
        myHouse.setNumberOfRoom(5);
        //stage 2

        System.out.println("I`ve got more rooms now.");
        System.out.println("Currently my house has got "+ myHouse.getNumberOfRoom() + " rooms");
        System.out.println("My new house: "+myHouse);

        //after houseowner class creation
        System.out.println("=====================");
        HouseOwner wife = new HouseOwner("Mary", myHouse);//House myHouse = new House(5, 2);assigning this house to wife
        //stage 3
        HouseOwner husband = new HouseOwner("Jack", myHouse);
        //stage 4
        System.out.println("Mary would like to repair her house");

        wife.getHouse().setNumberOfBathrooms(3);//House house = wife.getHouse(); house.setNumberOfBathrooms(3)
        System.out.println("Mary`s house after repair: "+myHouse);
        //stage 5

        husband.getHouse().setNumberOfBathrooms(1);
        //stage 6
        System.out.println("Jack`s house after repair: "+myHouse);
        System.out.println("Mary "+wife);
        System.out.println("Jack "+husband);
        myHouse = new House(1,1);
        System.out.println("New house is: "+myHouse);
        System.out.println("Mary "+wife);
        System.out.println("Jack "+husband);
        //stage 7

        myHouse = new House(10,10);
        wife.setHouse(myHouse);//Mary divorces and moves in to the new house
        //stage 8

        System.out.println("Mary "+wife);
        System.out.println("Jack "+husband);
        wife.setHouse(husband.getHouse());//Mary get`s back with Jack in to the old house
        System.out.println("Mary "+wife);
        System.out.println("Jack "+husband);
        //stage 9


    }
}
