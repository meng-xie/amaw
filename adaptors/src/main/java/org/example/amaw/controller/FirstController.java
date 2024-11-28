package org.example.amaw.controller;


import org.example.amaw.model.User;
import org.example.amaw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/amawservice")
public class FirstController {

    @Autowired
    private UserService userService;

    @GetMapping( value = "/hello",produces = MediaType.APPLICATION_JSON_VALUE)
    String hello() {
        return "Hello World, Spring Boot!";
    }

    @GetMapping(value = "/user/{userId}",produces = MediaType.APPLICATION_JSON_VALUE)
    User getUser(@PathVariable Integer  userId) {
      return   userService.findByUserId(userId);

    }
}