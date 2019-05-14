package com.gavin.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class ApplicationController {

    @GetMapping("/user")
    public String email(Principal pPrincipal) {
        return "Hello " + pPrincipal.getName();
    }

    @GetMapping("/no")
    public String noAuth() {
        return "Access successfully!";
    }
}