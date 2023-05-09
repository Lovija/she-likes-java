package com.sda.she_likes_java.homework.exercise17;

public class Book {
    private String author;
    private String title;
    private String yearOfPublication;

    public Book(String author, String title, String yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication='" + yearOfPublication + '\'' +
                '}';
    }
}
