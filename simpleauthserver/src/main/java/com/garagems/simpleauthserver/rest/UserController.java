package com.garagems.simpleauthserver.rest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @PreAuthorize("permitAll")
    @GetMapping("/user")
    public Principal getPrincipal(Principal principal) {
        System.out.println("access user");
        return principal;
    }
}
