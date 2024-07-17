package com.anindya.library_management;

public class Child extends Member {
    int id;

    public Child(String member_name, String type, int borrow_number) {
        super(member_name, type, borrow_number);
        this.id=this.generateID();
    }
}
