package com.garagems.garageserver.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @GetMapping("user")
    @PreAuthorize("#oauth2.hasScope('FOO')")
    public @ResponseBody Principal get(Principal user) {
        return user;
    }
}
