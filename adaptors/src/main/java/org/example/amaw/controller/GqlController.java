package org.example.amaw.controller;


import org.example.amaw.model.User;

import org.example.amaw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;


@Controller
public class GqlController {

    @Autowired
    UserService userService;

    @QueryMapping
    public List<User> findByUserId(@Argument int userId) {
        return Arrays.asList(userService.findByUserId(userId));
    }

    @MutationMapping
    public User createUser(@Argument String userId, @Argument String userName, @Argument String address,  @Argument String city ) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName(userName);
//        user.setAddress(address);
//        user.setCity(city);

        userService.save(user);

        return user;
    }

}