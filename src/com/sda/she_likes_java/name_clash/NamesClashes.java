package com.sda.she_likes_java.name_clash;
import java.util.Date;
//import java.sql.Date
public class NamesClashes {
    public static void main(String[] args) {
        Date myDate = new Date();
        //using java.util date > find this with double "shift"> type Date>search in all classes> then find it> type her import and name of the class
    java.sql.Date sqlDate= new java.sql.Date(100);
    // using java sql date class. only one class with the same name can be imported, other one we can get like this
        com.sda.she_likes_java.name_clash.Date myDate2 = new com.sda.she_likes_java.name_clash.Date();
    // with this row we refer to our made Date class
    }
}
