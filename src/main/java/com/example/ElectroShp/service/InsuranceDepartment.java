package com.example.ElectroShp.service;

import org.springframework.stereotype.Component;

@Component
public class InsuranceDepartment {
    public  void insuranceProd(String productId, String orderId){
        System.out.println("Insuring product with id" + productId + "from order" + orderId);
    }
}
