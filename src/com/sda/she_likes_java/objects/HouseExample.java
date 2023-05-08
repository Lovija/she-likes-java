package com.sda.she_likes_java.objects;

public class HouseExample {
    public static void main(String[] args) {
        House myHouse = new House(4, 2);
        System.out.println("I`ve got new house: "+myHouse);
        System.out.println("Currently my house has got "+ myHouse.getNumberOfRoom() + " rooms");
        System.out.println("I need more rooms...");
        myHouse.setNumberOfRoom(5);
        System.out.println("I`ve got more rooms now.");
        System.out.println("Currently my house has got "+ myHouse.getNumberOfRoom() + " rooms");
        System.out.println("My new house: "+myHouse);

        //after houseowner class creation
        System.out.println("=====================");
        HouseOwner wife = new HouseOwner("Mary", myHouse);//House myHouse = new House(5, 2);assigning this house to wife
        HouseOwner husband = new HouseOwner("Jack", myHouse);

        System.out.println("Mary would like to repair her house");

        wife.getHouse().setNumberOfBathrooms(3);//House house = wife.getHouse(); house.setNumberOfBathrooms(3)
        System.out.println("Mary`s house after repair: "+myHouse);


        husband.getHouse().setNumberOfBathrooms(1);
        System.out.println("Jack`s house after repair: "+myHouse);

        System.out.println("Mary: "+wife);
        System.out.println("Jack: "+husband);


    }
}
