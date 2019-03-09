package com.thoughtvault.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ThoughtvaultController {

    @GetMapping("/getThoughtvaultInfo")
    public String getThoughvaultInfo(){
        return "Hello there !";
    }

}
