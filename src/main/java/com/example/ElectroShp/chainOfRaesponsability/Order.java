package com.example.ElectroShp.chainOfRaesponsability;

import lombok.Getter;
import lombok.ToString;

import java.util.List;
@Getter
@ToString(exclude = "products")
public class Order {
    private final String id;
    private final String fio;
    private final String address;
    private final String phoneNumber;
    private final List<Product> products;
    private final boolean smsNotifications;

    public Order(String id, String fio, String address, String phoneNumber, List<Product> products, boolean smsNotifications) {
        this.id = id;
        this.fio = fio;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.products = products;
        this.smsNotifications = smsNotifications;
    }


}
