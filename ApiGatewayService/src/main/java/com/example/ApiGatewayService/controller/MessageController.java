package com.example.ApiGatewayService.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MessageController {
    @GetMapping("/users")
    @PreAuthorize("hasRole('user')")
    public String getMessage(){
        return "Get message successfully";
    }
    @GetMapping("/")
    public String getPublicMessage(){
        return "public Message";
    }


}
