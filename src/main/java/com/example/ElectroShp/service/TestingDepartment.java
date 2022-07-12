package com.example.ElectroShp.service;

import org.springframework.stereotype.Component;

@Component
public class TestingDepartment {
    public  void testProduct(String productId, String orderId){
        System.out.println("Testing product with id" + productId + "from order" + orderId);
    }
}
