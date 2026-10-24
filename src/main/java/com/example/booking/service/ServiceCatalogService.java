package com.example.booking.service;

import com.example.booking.model.ServiceItem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCatalogService {


    public List<ServiceItem> getServices() {
        return List.of(
                new ServiceItem(1, "Haircut (short hair)", 20,50),
                new ServiceItem(2,"Beard trim", 15, 30),
                new ServiceItem(3, "Haircut (long hair)", 25,60)
        );
    }

}
