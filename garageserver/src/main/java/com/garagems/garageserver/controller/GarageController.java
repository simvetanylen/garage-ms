package com.garagems.garageserver.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController("/foo")
public class GarageController {

    @GetMapping
    @PreAuthorize("hasAuthority('FOO_READ')")
    public @ResponseBody String unauth() {
        return "Ok unauth"  + UUID.randomUUID().toString();
    }

    @PostMapping
    @PreAuthorize("hasAuthority('FOO_WRITE')")
    public @ResponseBody String auth() {
        return "Ok auth" + UUID.randomUUID().toString();
    }
}
