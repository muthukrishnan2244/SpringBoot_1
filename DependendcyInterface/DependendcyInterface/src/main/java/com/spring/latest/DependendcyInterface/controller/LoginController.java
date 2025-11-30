package com.spring.latest.DependendcyInterface.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.latest.DependendcyInterface.service.AuthService;

@RestController
public class LoginController {

    private final AuthService authService;

    public LoginController(@Qualifier("DBAuth") AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public boolean login() {
        return authService.authenticate("username","password");
    }
    
}
