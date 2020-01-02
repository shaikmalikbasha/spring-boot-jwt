package com.costrategix.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.HTML;

@RestController
public class UserController {

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping(value = "/start")
    public String start() {
        return ("Java Application Started");
    }

}
