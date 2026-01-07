package com.msb.test;

public class TestInterface {
    public static void main(String[] args) {
        MathBook mathBook = new MathBook();
        mathBook.test();
        RedBook redBook = new RedBook();
        redBook.test();
        System.out.println(redBook.NAME);
        /*接口实现多态*/
        Book b=new RedBook();
        b.test();
    }
}
