package com.example.booking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {

    @GetMapping("/api/services")
    public List<String> getServices() {
        return List.of("Haircut", "Beard trim");
    }


}
