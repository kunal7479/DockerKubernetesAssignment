package com.example.DockerAssignment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "Kunal") String name) {
        return "Hello, " + name + ":)";
    }

}
