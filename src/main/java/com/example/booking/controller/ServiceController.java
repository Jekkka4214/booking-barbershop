package com.example.booking.controller;

import com.example.booking.model.ServiceItem;
import com.example.booking.service.ServiceCatalogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/api/services/{id}")
    public ResponseEntity<ServiceItem> getServiceById(@PathVariable("id") long id){
        Optional<ServiceItem> result = serviceCatalogService.getById(id);

        if (result.isPresent()){
            return ResponseEntity.ok(result.get());
        }

        return ResponseEntity.notFound().build();
    }


}
