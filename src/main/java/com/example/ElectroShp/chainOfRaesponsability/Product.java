package com.example.ElectroShp.chainOfRaesponsability;

import lombok.Getter;
@Getter
public class Product {
    private final String id;
    private final String name;
    private final boolean insurance;
    private final boolean testing;
    private final boolean festivePackaging;
    private final boolean installation;
    private final boolean smsNotification;

    public Product(String id, String name, boolean insurance, boolean testing, boolean festivePackaging, boolean installation, boolean smsNotification) {
        this.id = id;
        this.name = name;
        this.insurance = insurance;
        this.testing = testing;
        this.festivePackaging = festivePackaging;
        this.installation = installation;
        this.smsNotification = smsNotification;
    }
}