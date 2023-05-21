package com.sda.she_likes_java.homework.exercise23;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("This is lesson Journal");
        System.out.println("");

        Map<Pupils,Subject> lessonJournal = new HashMap<>();
        lessonJournal.put(new Pupils("Amanda", "Wok"), new Subject("Algebra", 8));
        lessonJournal.put(new Pupils("Ray", "Donovan"), new Subject("Algebra", 6));
        lessonJournal.put(new Pupils("George", "Baker"), new Subject("Alegbra", 10));
        lessonJournal.put(new Pupils("Sandy", "Sunshine"), new Subject("Algebra", 9));
        lessonJournal.put(new Pupils("Amanda", "Wok"), new Subject("Sports", 7));
        lessonJournal.put(new Pupils("Ray", "Donovan"), new Subject("Sports", 9));
        lessonJournal.put(new Pupils("George", "Baker"), new Subject("Sports", 5));
        lessonJournal.put(new Pupils("Sandy", "Sunshine"), new Subject("Sports", 6));

        displayLessonJournal(lessonJournal);

    }
    public static void displayLessonJournal(Map<Pupils,Subject> journalMap){
        for (Map.Entry<Pupils,Subject> item: journalMap.entrySet()){
            System.out.println(item.getKey() + "" + item.getValue());
        }
    }
}
