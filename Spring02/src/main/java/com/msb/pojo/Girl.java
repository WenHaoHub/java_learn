package com.msb.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    @Value("丽丽")
    private String name;
    @Value("18")
    private int age;
    @Autowired()
    private Boy boyfriend;
    public String getName() {
        return name;
    }

    public Boy getBoyfriend() {
        return boyfriend;
    }

    public void setBoyfriend(Boy boyfriend) {
        this.boyfriend = boyfriend;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Girl() {
    }

    public Girl(String name, int age, Boy boyfriend) {
        this.name = name;
        this.age = age;
        this.boyfriend = boyfriend;
    }
}
