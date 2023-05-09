package com.sda.she_likes_java.strings;

public class ImmutableString {
    public static void main(String[] args) {
        String name = "Loveta";
        name = name.concat(" Seja "); //  concat means the same as this name + "p"
        name = name.concat(" she is 31 ");
        System.out.println("My name now: "+name);

        StringBuilder nameWithBuilder = new StringBuilder("Loveta");
        nameWithBuilder.append(" Seja");
        System.out.println("Name with builder: " + nameWithBuilder);

    String some = "Alice" + "is" + "10" + "years";
    //"Alice is" + "10"+"years"
        //"Alice is 10" +  years
        //"Alice is 10 years" this is how in background works computer with string
        System.out.println(""+some);
    String alice = "Alice";
        System.out.println(""+alice);


    StringBuilder someString = new StringBuilder();
    someString.append("Alice ");
        someString.append("is ");
        someString.append(" 10 ");
        someString.append("years ");
        System.out.println(""+someString);//stringbuilder is memory friendly
    }
}
