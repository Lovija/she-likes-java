package com.sda.she_likes_java.collections.lists;

import java.util.List;

public class MyDictionaries {
    //create english - latvian dictionary
    public static MyGreatDictionary createEnglishLatvianDictionary(){
        List<WordsBilingual>list = List.of(
                new WordsBilingual("sun", "saule"),
                new WordsBilingual("daughter", "meita"),
                new WordsBilingual("tree", "koks")
        );
        MyGreatDictionary englishLatvianDictionary = new MyGreatDictionary();
        englishLatvianDictionary.fillWithWordBilingual(list);
       return englishLatvianDictionary;
    }
    // create latvian - english dictionary
    public static MyGreatDictionary createEnglishPolishDictionary(){
        List<WordsBilingual> list= List.of(
                new WordsBilingual("house", "dom"),
                new WordsBilingual("tree","drzewo" ),
                new WordsBilingual("sky", "niebo")
        );
        MyGreatDictionary englishPolishDictionary = new MyGreatDictionary();
        englishPolishDictionary.fillWithWordBilingual(list);

        return englishPolishDictionary;
    }
}
