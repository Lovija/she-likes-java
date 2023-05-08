package com.sda.she_likes_java.objects;

public class House {
    private int numberOfRoom;
    private int numberOfBathrooms;

    public House(int numberOfRoom, int numberOfBathrooms) {
        this.numberOfRoom = numberOfRoom;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfRoom=" + numberOfRoom +
                ", numberOfBathrooms=" + numberOfBathrooms +
                '}';
    }
}
