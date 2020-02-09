package de.test.mstest.controller.get;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerGet {

    @GetMapping("/users/{id}")
    public void getUser(@PathVariable Integer id) {
        System.out.println("ID: " + id);
    }

}
