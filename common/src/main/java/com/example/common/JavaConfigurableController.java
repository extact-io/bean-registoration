package com.example.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SkipRegistration
public class JavaConfigurableController {

    @GetMapping("/javaconfig")
    public String hello() {
        return "called javaconfig";
    }
}
