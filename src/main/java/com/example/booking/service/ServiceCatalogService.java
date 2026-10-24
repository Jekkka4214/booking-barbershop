package com.example.booking.service;

import com.example.booking.model.ServiceItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceCatalogService {

    private final List<ServiceItem> services = List.of(
                new ServiceItem(1, "Haircut (short hair)", 20,50),
                new ServiceItem(2,"Beard trim", 15, 30),
                new ServiceItem(3, "Haircut (long hair)", 25,60)
    );

    public List<ServiceItem> getServices() {
        return services;
    }

    public Optional<ServiceItem> findById(long id){
        for (ServiceItem service : services){
            if (id == service.getId()){
                return Optional.of(service);
            }
        }
        return Optional.empty();
    }

    public List<ServiceItem> findByMaxPrice(int MaxPrice){
        List<ServiceItem> result = new ArrayList<>();

        for (ServiceItem service : services){
            if (service.getPriceUsd() <= MaxPrice){
                result.add(service);
            }
        }

        return result;
    }



}
