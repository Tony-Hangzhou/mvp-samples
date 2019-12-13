package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BarApplication {

    @GetMapping("/bar/{name}")
    public String name(@PathVariable String name) {
        return "bar param is " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(BarApplication.class, args);
    }

}
