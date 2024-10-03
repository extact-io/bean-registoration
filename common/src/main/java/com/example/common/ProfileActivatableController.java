package com.example.common;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("add-on")
public class ProfileActivatableController {

    @GetMapping("/profile")
    public String hello() {
        return "called profile";
    }
}
