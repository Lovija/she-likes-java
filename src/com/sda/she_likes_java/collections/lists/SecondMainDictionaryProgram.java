package com.sda.she_likes_java.collections.lists;

import java.util.Scanner;

public class SecondMainDictionaryProgram {
    public static void main(String[] args) {
        System.out.println("Hi, which dictionary you`d like to use");
        System.out.println("type 1 for English - Latvian, type 2 for English - Polish");
        Scanner inputReader = new Scanner(System.in);
        String userChoice = inputReader.next();
        MyGreatDictionary currentDictionary;
        if (userChoice.equals("1"))
        {
            currentDictionary = MyDictionaries.createEnglishLatvianDictionary();
            System.out.println("Let`s use English - Latvian dictionary");

        }
        else if (userChoice.equals("2"))
        {
           currentDictionary = MyDictionaries.createEnglishPolishDictionary();
            System.out.println("Let`s use English - Polish dictionary");

        }
        else
        {
            System.out.println("Incorrect type, I don`t know what you mean");
        return;
        }
        System.out.println("Provide word to translate: ");
        String wordFromTheUser = inputReader.next();
       currentDictionary.translateFromSourceLanguageToDestiny(wordFromTheUser);
    }



}
