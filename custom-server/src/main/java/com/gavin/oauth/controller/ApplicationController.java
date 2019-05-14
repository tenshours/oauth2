package com.gavin.oauth.controller;

import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class ApplicationController {

    @GetMapping("/user")
    public Object email() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    @GetMapping("/no")
    public String noAuth() {
        return "Access successfully!";
    }

    @GetMapping("/acc")
    public String access() {
        return "Can access!!!";
    }
}