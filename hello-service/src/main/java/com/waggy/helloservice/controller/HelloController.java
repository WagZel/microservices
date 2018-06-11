package com.waggy.helloservice.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getHelloWorld() {
        return "Hello World";
    }

    @PreAuthorize("#oauth2.hasScope('server')")
    @RequestMapping(path = "/{name}", method = RequestMethod.GET)
    public String getHelloUser(@PathVariable Principal principal) {
        return "Hello, " + principal.getName();
    }
}
