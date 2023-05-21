package com.sda.she_likes_java.homework.e24_dictionary_with_scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EnglishLatvianDictionary2 secondDictionary = new EnglishLatvianDictionary2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an English word to translate: ");
        String englishWord = scanner.nextLine();
        String latvianWord = secondDictionary.translate(englishWord);
        System.out.println("The Latvian translation is: " + latvianWord);
    }
}
