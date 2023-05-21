package com.sda.she_likes_java.collections.lists;

//import java.io.Console;
import java.util.Scanner;

public class MainDictionaryProgram {
    public static void main(String[] args) {
        //MyGreatDictionary englishLatvianDictionary = MyDictionaries.createEnglishLatvianDictionary();
        //englishLatvianDictionary.translateFromSourceLanguageToDestiny("sun");
        //englishLatvianDictionary.translateFromSourceLanguageToDestiny("tree");
       // System.out.println("----------------");
        //MyGreatDictionary englishPolishDictionary = MyDictionaries.createEnglishPolishDictionary();
        //englishPolishDictionary.translateFromSourceLanguageToDestiny("tree");
        //englishPolishDictionary.translateFromSourceLanguageToDestiny("house");
        //englishPolishDictionary.translateFromSourceLanguageToDestiny("purse");
       // System.out.println("----------------");
        System.out.println("Hi, which dictionary you`d like to use");
        System.out.println("type 1 for English - Latvian, type 2 for English - Polish");
        //Console console = System.console();
        //String userChoice = console.readLine();
        Scanner inputReader = new Scanner(System.in);
        String userChoice = inputReader.next();

        if (userChoice.equals("1"))
        {
            MyGreatDictionary englishLatvianDictionary = MyDictionaries.createEnglishLatvianDictionary();
            System.out.println("Let`s use English - Latvian dictionary");
            System.out.println("Provide word to translate: ");
            String wordFromTheUser = inputReader.next();
            englishLatvianDictionary.translateFromSourceLanguageToDestiny(wordFromTheUser);
        }
        else if (userChoice.equals("2"))
        {
            MyGreatDictionary englishPolishDictionary = MyDictionaries.createEnglishPolishDictionary();
            System.out.println("Let`s use English - Polish dictionary");
            System.out.println("Provide word to translate: ");
            String wordFromTheUser = inputReader.next();
            englishPolishDictionary.translateFromSourceLanguageToDestiny(wordFromTheUser);
        }
        else
        {
            System.out.println("Incorrect type, I don`t know what you mean");
        }



    }
}
