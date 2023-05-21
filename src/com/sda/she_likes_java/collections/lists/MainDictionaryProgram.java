package com.sda.she_likes_java.collections.lists;

public class MainDictionaryProgram {
    public static void main(String[] args) {
        MyGreatDictionary englishLatvianDictionary = MyDictionaries.createEnglishLatvianDictionary();
        englishLatvianDictionary.translateFromSourceLanguageToDestiny("sun");
        englishLatvianDictionary.translateFromSourceLanguageToDestiny("tree");
        MyGreatDictionary englishPolishDictionary = MyDictionaries.createEnglishPolishDictionary();
        englishPolishDictionary.translateFromSourceLanguageToDestiny("tree");
        englishPolishDictionary.translateFromSourceLanguageToDestiny("house");
        englishPolishDictionary.translateFromSourceLanguageToDestiny("purse");


    }
}
