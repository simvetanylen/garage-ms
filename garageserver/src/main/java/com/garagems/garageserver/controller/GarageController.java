package com.garagems.garageserver.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GarageController {

    @GetMapping("garage")
    @PreAuthorize("hasRole('FOO_READ')")
    public @ResponseBody String get() {
        return "OK GET";
    }

    @PostMapping("garage")
    @PreAuthorize("hasRole('FOO_WRITE')")
    public @ResponseBody String post() {
        return "OK POST";
    }
}
