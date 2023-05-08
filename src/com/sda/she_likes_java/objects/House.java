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

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfRoom=" + numberOfRoom +
                ", numberOfBathrooms=" + numberOfBathrooms +
                '}';
    }
}
