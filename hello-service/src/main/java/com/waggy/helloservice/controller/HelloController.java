package com.waggy.helloservice.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RefreshScope
@RestController
public class HelloController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getHelloWorld() {
        return "Hello World";
    }

    @RequestMapping(path = "/current", method = RequestMethod.GET)
    public String getHelloUser(@PathVariable Principal principal) {
        return "Hello, " + principal.getName();
    }
}
