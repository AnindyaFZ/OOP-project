package com.anindya.library_management;

public class Adult extends Member {
    int id;
    public Adult(String member_name, String type, int borrow_number) {
        super(member_name, type, borrow_number);
        this.id=this.generateID();
    }
}
