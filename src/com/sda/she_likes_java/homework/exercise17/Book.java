package com.sda.she_likes_java.homework.exercise17;

import java.time.Year;

public class Book {
    private static int numberOfCreatedBooks;
    private final String author;
    private final String title;
    private final Year yearOfPublication;

    public Book(String author, String title, Year yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        numberOfCreatedBooks++;
    }

    public static int getNumberOfCreatedBooks(){
        return numberOfCreatedBooks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public Year getYearOfPublication(){
        return yearOfPublication;
    }

}
