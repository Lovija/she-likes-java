package com.sda.she_likes_java.homework.e24_dictionary_with_scanner;

import java.util.HashMap;
import java.util.Map;

public class EnglishLatvianDictionary2 {
    private final Map<String,String> dictionary;
    public EnglishLatvianDictionary2(){
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
    public String translate (String englishWord){
        String latvianWord = dictionary.get(englishWord);
        if (latvianWord == null){
            return "Sorry, the dictionary does not support this word";
        }
        return latvianWord;
    }
}
