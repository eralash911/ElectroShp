package com.example.ElectroShp.service;

import org.springframework.stereotype.Component;

@Component
public class PackagingDepartment {
    public  void festivelyPack(String productId, String orderId){
        System.out.println("Packaging product with id" + productId + "from order" + orderId);
    }
}
