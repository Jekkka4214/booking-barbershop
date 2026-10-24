package com.example.booking.controller;

import com.example.booking.model.ServiceItem;
import com.example.booking.service.ServiceCatalogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {

    private final ServiceCatalogService serviceCatalogService;

    public ServiceController(ServiceCatalogService serviceCatalogService){
        this.serviceCatalogService = serviceCatalogService;
    }

    @GetMapping("/api/services")
    public List<ServiceItem> getServices() {
        return serviceCatalogService.getServices();
    }


}
