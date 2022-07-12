package com.example.ElectroShp.service;

import com.example.ElectroShp.chainOfRaesponsability.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderDao {
    void saveOrder(Order order){

            System.out.println("order saved" + order);

    }
}
