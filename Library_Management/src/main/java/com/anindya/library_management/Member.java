package com.anindya.library_management;

import java.util.ArrayList;
import java.util.Random;

public class Member {
    String member_name,type;
    int borrow_number,member_id;
    ArrayList<Book>bookArrayList;


    public Member(String member_name, String type, int borrow_number) {
        this.member_name = member_name;
        this.type = type;
        this.borrow_number = borrow_number;
        this.bookArrayList = new ArrayList<>();
        this.member_id=this.generateID();



    }

    public String getMember_name() {
        return member_name;
    }

    public void setMember_name(String member_name) {
        this.member_name = member_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBorrow_number() {
        return borrow_number;
    }

    public void setBorrow_number(int borrow_number) {
        this.borrow_number = borrow_number;
    }

    public int getMember_id() {


        return this.member_id;
    }


    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }

    public void setBookArrayList(Book book) {
        this.bookArrayList.add(book);
    }






    public int generateID(){
        int id;
        Random r=new Random();
        id=22200+r.nextInt(200);

        return id;
    }

}
