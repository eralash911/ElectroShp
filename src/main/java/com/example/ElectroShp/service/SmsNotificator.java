package com.example.ElectroShp.service;

import org.springframework.stereotype.Component;

@Component
public class SmsNotificator {
    public void enableNotifications(String orderId, String phoneNumber){
        System.out.println("SMS turn on " + orderId + " with num " + phoneNumber );
    }
}
