package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FooApplication {

    @GetMapping("/foo/{number}")
    public String name(@PathVariable int number) {
        return "foo param is " + number;
    }

    public static void main(String[] args) {
        SpringApplication.run(FooApplication.class, args);
    }

}
