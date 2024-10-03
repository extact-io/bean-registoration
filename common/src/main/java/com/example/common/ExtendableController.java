package com.example.common;

import org.springframework.web.bind.annotation.GetMapping;

public abstract class ExtendableController {

    @GetMapping
    public String hello() {
        return "called extend";
    }
}
