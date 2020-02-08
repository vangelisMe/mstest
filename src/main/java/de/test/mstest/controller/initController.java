package de.test.mstest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class initController {

    @RequestMapping("/")
    public String initString() {
        String hello = "Service funktioniert!";
        return hello;
    }
}
