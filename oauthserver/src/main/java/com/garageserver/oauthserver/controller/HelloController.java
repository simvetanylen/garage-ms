package com.garageserver.oauthserver.controller;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {

    public @ResponseBody String hello() {
        return "hello";
    }
}
