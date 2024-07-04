package com.example.annotation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api")
public class DataController {

    @CrossOrigin(origins = "http://localhost:8088")
    @GetMapping("/data")
    public String getJsonData() {
        // Replace with your JSON data
        String jsonData = "{\"message\": \"Hello from Spring Boot!\"}";
        return jsonData;
    }
}

