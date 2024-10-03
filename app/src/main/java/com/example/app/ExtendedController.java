package com.example.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.common.ExtendableController;

@RestController
@RequestMapping("/extend")
public class ExtendedController extends ExtendableController {

}
