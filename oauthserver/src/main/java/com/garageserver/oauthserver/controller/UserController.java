package com.garageserver.oauthserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Principal getPrincipal(Principal principal) {
        System.out.println("Principal : " + principal.toString());
        return principal;
    }
}
