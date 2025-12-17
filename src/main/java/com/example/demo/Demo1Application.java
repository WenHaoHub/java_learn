package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/index")
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }
//   @GetMapping
//    public String index() {
//        return "Hello, World!";
//    }
    @GetMapping("/{id}")
    public String index(@PathVariable String id) {
        System.out.print(id);
        return "Requested ID: " + id;
    }
    @GetMapping
    public String index2(@RequestParam String id, @RequestParam String name) {
        System.out.printf("ID: %s, Name: %s%n", id, name);
        return "ID: " + id + ", Name: " + name;
    }
    @PostMapping
}
