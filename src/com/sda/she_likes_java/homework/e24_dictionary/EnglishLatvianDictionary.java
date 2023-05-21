package com.sda.she_likes_java.homework.e24_dictionary;

import java.util.HashMap;
import java.util.Map;

public class EnglishLatvianDictionary {
    private final Map<String,String> dictionary;
    public EnglishLatvianDictionary(){
        dictionary = new HashMap<>();
        dictionary.put("house", "māja");
        dictionary.put("sun", "saule");
        dictionary.put("moon", "mēness");
        dictionary.put("sky", "debesis");
        dictionary.put("tree", "koks");
        dictionary.put("school", "skola");
        dictionary.put("pupil", "skolēns");
        dictionary.put("teacher", "skolotājs");
        dictionary.put("blacboard", "tāfele");

    }
    public void translate (String englishWord){
        String latvianTranslation = dictionary.get(englishWord);
        if (latvianTranslation != null){
            System.out.printf("English word: [%s] means [%s] in Latvian. ", englishWord,latvianTranslation);
        }
        else {
            System.out.printf("Don`t know hot to translate [%s] into Latvian. ", englishWord);
        }

    }
}
