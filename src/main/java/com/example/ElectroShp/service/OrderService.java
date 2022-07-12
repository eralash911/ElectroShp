package com.example.ElectroShp.service;

import com.example.ElectroShp.chainOfRaesponsability.Order;
import com.example.ElectroShp.options.AdditionalOptional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderDao orderDao;
    private final List<AdditionalOptional>additionalOptionals;

    public OrderService(OrderDao orderDao, List<AdditionalOptional> additionalOptionals) {
        this.orderDao = orderDao;
        this.additionalOptionals = additionalOptionals;
    }


    public boolean createOrder(Order order){
        orderDao.saveOrder(order);
        additionalOptionals.forEach(additionalOptional -> additionalOptional.apply(order));
        return true;
    }
}
