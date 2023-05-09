package com.sda.she_likes_java.visibility.default_modifier.example;

public class Robot {
    private String model;
    private String generation;
    private int xPosition;
    private int yPosition;

    public Robot(String model, String generation, int xPosition, int yPosition) {
        this.model = model;
        this.generation = generation;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "model='" + model + '\'' +
                ", generation='" + generation + '\'' +
                ", xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                '}';
    }

    public String createJavaProgramm() {
        return """
                public class RoboJavaProgramm{
                public static void main(){
                }
                }
                """;//this ir multi line strings
    }

    public void moveForward() {
        xPosition++;
        System.out.println("I`m moving forward");

    }

    public void moveBackwards() {
        yPosition--;
        System.out.println("I`m moving backwards");

    }

    public void moveToTheLeft() {
        System.out.println("I`m turning left");

    }

    public void moveToTheRight() {
        System.out.println("I`m turning right");
    }
}
