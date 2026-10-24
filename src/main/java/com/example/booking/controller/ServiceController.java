package com.example.booking.controller;

import com.example.booking.model.ServiceItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {

    @GetMapping("/api/services")
    public List<ServiceItem> getServices() {
        return List.of(
                new ServiceItem(1, "Haircut (short hair)", 20,50),
                new ServiceItem(2,"Beard trim", 15, 30),
                new ServiceItem(3, "Haircut (long hair)", 25,60)
        );
    }


}
