package com.sda.she_likes_java.homework.exercise17;

import java.util.Random;


public class BookLendingApplication {
    public static void main(String[] args) {
        System.out.println("Let`s make some books!");
        createThreeBooks();
        System.out.printf("Number of copies of all books: [%d]%n", Book.getNumberOfCreatedBooks());
        Book[] createdArray = createThreeBooksAndStoreInArray();
    }

    public static void createThreeBooks() {
        Random random = new Random();
        int numberOfIterations = random.nextInt();

       // for (int i =0; 1<numberOfIterations; i++) {
          //  new Book("Selma padaleki", "Moonlight","1993");
           // new Book("Jared Hajek", "Sun in the sky", "2003");
          //  new Book("Nicole Renolds", "Sunrise in heart", "2023");
        //}
    }
    public static Book [] createCopyOfBook(Book bookToCopy){
        Book [] books = new Book[2];

        books[0]= new Book(bookToCopy.getTitle(), bookToCopy.getAuthor(), bookToCopy.getYearOfPublication());
        books[0]= new Book(bookToCopy.getTitle(), bookToCopy.getAuthor(), bookToCopy.getYearOfPublication());
        return books;
    }

    public static Book[] createThreeBooksAndStoreInArray() {
        Random random = new Random();
        int numberOfIterations = random.nextInt(1824);
        Book [] books = new Book [numberOfIterations];
        for (int i =0; 1<numberOfIterations; i++) {
            //books[i] = new Book("Kaira Saule", "Maza zive", "1998");
        }
        return books;
    }

    }

