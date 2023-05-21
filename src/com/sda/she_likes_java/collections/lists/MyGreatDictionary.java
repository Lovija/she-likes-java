package com.sda.she_likes_java.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class MyGreatDictionary {
    private List<WordsBilingual> dictionary;

    public MyGreatDictionary() {// this is made with constructor, changing some lines
        dictionary = new ArrayList<>();
    }
    public void fillWithWordBilingual (List<WordsBilingual> listOfWords){
        dictionary.addAll(listOfWords);

    }
    public void translateFromSourceLanguageToDestiny (String sourceWord){
        //iterate the list
        for (WordsBilingual currentWordPair:
             dictionary) {
            //compare sourceword with sourcelanguage from the current item
        if (currentWordPair.getSourceLanguage().equals(sourceWord)){
           String translated = currentWordPair.getDestinyLanguage();
            System.out.printf("Translation of [%s] is [%s].", sourceWord,translated);
            return;
        }

        }
        System.out.println("Sorry, no translation of [%s]".formatted(sourceWord));

        //if we found the word, we need to finish the iteration and provide info for user
    }
}
