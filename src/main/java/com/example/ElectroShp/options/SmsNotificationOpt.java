package com.example.ElectroShp.options;

import com.example.ElectroShp.chainOfRaesponsability.Order;
import com.example.ElectroShp.service.SmsNotificator;
import org.springframework.stereotype.Component;

@Component
public class SmsNotificationOpt implements AdditionalOptional{
    private final SmsNotificator smsNotificator;

    public SmsNotificationOpt(SmsNotificator smsNotificator) {
        this.smsNotificator = smsNotificator;
    }

    @Override
    public void apply(Order order) {
    if (order.isSmsNotifications()){
        smsNotificator.enableNotifications(order.getId(), order.getPhoneNumber());
    }
    }
}
