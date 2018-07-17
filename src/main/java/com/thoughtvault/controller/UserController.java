package com.thoughtvault.controller;

import com.thoughtvault.model.request.UserRequest;
import com.thoughtvault.model.response.UserResponse;
import com.thoughtvault.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;
    @PostMapping("/addUser")
    private String addUser(@RequestBody UserRequest userRequest){
      userServiceImpl.createUser(userRequest);
       return "Success";
    }
    @GetMapping("/getUserInfo/{emailId}")
    private UserResponse getUserInfo(@PathVariable("emailId") String emailId){

        return userServiceImpl.getUserInfo(emailId);

    }
    @PostMapping("/resetPassword")
    private String resetPassword(@RequestBody UserRequest userRequest){
       return userServiceImpl.resetPassword(userRequest);

    }
}

