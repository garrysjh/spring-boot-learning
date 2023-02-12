package com.springtest.springbootlearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@springbootapplication sets it as a spring boot application, use the springapplication.run in the main class to ensure it runs a spring application on a tomcat server
//if you want to modify port or use a jetty server instead of a tomcat server, go to resources/application.yml and modify values
@SpringBootApplication
//part of the spring MVC - model view controller: custom annotations to apply to classes and methods within the MVC architecture to create restful services.
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    // get path endpoint for http get request
    @GetMapping("/")
    public greetResponse greet() {
        greetResponse response = new greetResponse(
                "Hello",
                List.of("Javascript", "Python"),
                new Person("Alex")
        );
        return response;
    }
    record Person(String name){}
    record greetResponse(
            String greet,
            List<String> favProgrammingLanguages,
            Person person
    ){}
}
