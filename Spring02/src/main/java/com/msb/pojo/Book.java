package com.msb.pojo;

public class Book {
    private int id=10;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book() {
        System.out.println("Book类空构造器");
    }

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
