package com.sda.she_likes_java.homework.e24_dictionary;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let`s learn some Latvian");

        EnglishLatvianDictionary englishLatvianDictionary = new EnglishLatvianDictionary();
        englishLatvianDictionary.translate("sky");
        englishLatvianDictionary.translate("school");
        englishLatvianDictionary.translate("dog");
    }
}
