package com.msb.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/message")
    public String getMessage() {
        return "Pipeline Ex - Hello ";
    }

    @GetMapping("/message/{message}")
    public String getMessage(@PathVariable String message) {
        return " Pipeline Ex - Hello " + message;
    }
}
