package org.example.amaw.controller;


import org.example.amaw.dto.SignupuserRequestbody;
import org.example.amaw.model.User;
import org.example.amaw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/amawservice/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/login/{userName}/{password}",produces = MediaType.APPLICATION_JSON_VALUE)
    String login(@PathVariable String  userName,@PathVariable String  password) {
       User user = userService.findByUserNameAndPassword(userName,password);
       if (user != null){
           return user.getUserId().toString();
       }else {
           return "not find user";
       }

    }

    @PostMapping(value = "/signup", produces = MediaType.APPLICATION_JSON_VALUE,consumes =   MediaType.APPLICATION_JSON_VALUE)
    String signup(@RequestBody SignupuserRequestbody signupuserRequestbody) {
        User user = userService.findByUserNameAndPassword(signupuserRequestbody.getUserName(),signupuserRequestbody.getPassword());
        if (user != null){
            return "user exist";
        }else {
            user = new User();
            user.setUserId(UUID.randomUUID().toString());
            user.setUserName(signupuserRequestbody.getUserName());
            user.setPasswords(signupuserRequestbody.getPassword());
            user.setCellphone(signupuserRequestbody.getCellphone());
            user.setEmail(signupuserRequestbody.getEmail());



            userService.save(user);
            return user.getUserId();
        }

    }
}