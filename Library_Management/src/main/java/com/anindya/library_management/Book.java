package com.anindya.library_management;

import java.util.Random;

public class Book {
    String book_name,author_name,publication;
    int id,total_copy,total_borrowed;

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal_copy() {
        return total_copy;
    }

    public void setTotal_copy(int total_copy) {
        this.total_copy = total_copy;
    }

    public int getTotal_borrowed() {
        return total_borrowed;
    }

    public void setTotal_borrowed() {
        this.total_borrowed+=1;
    }

    public int generateID(){
        int id;
        Random r=new Random();
        id=22200+r.nextInt(200);

        return id;
    }






    public Book(String book_name, String author_name, String publication, int total_copy) {
        this.book_name = book_name;
        this.author_name = author_name;
        this.publication = publication;
        this.total_copy = total_copy;




    }
}



