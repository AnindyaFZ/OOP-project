package com.anindya.bazarlist;

import java.time.LocalDate;

public class Product{
    String pname,material;
    int id,quantity;
    LocalDate date;

    public Product(String pname, String material, int id, int quantity, LocalDate date) {
        this.pname = pname;
        this.material = material;
        this.id = id;
        this.quantity = quantity;
        this.date = date;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}