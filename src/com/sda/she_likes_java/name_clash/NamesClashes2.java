package com.sda.she_likes_java.name_clash;

public class NamesClashes2 {
    public static void main(String[] args) {
        Date myDate = new Date();//referring to our date class

    java.sql.Date sqlDate= new java.sql.Date(100);
    // using java sql date class. only one class with the same name can be imported, other one we can get like this
        com.sda.she_likes_java.name_clash.Date myDate2 = new com.sda.she_likes_java.name_clash.Date();
    // with this row we refer to our made Date class

   //java.util.Date
   java.util.Date utilDate = new java.util.Date(1000);
    }
}
