package com.msb.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Boy {
    @Value("jack")
    private String name;
    @Value("25")
    private int age;

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public Boy() {
    }

    public Boy(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
