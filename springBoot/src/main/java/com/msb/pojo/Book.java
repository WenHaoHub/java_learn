package com.msb.pojo;

public class Book {
    public String name;
    public String author;
    public double price;
    public int id;

    public Book() {
    }

    public Book(String name, String author, double price, int id) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
