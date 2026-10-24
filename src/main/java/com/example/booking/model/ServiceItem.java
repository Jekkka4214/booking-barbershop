package com.example.booking.model;

public class ServiceItem {

    private final long id;
    private final String name;
    private final int priceUsd;
    private final int durationMinutes;

    public ServiceItem(long id, String name, int priceUsd, int durationMinutes){
        this.id = id;
        this.name = name;
        this.priceUsd = priceUsd;
        this.durationMinutes = durationMinutes;
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getPriceUsd(){
        return this.priceUsd;
    }

    public int getDurationMinutes(){
        return this.durationMinutes;
    }
}