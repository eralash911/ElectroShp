package com.example.ElectroShp.options;

import com.example.ElectroShp.chainOfRaesponsability.Order;
import com.example.ElectroShp.chainOfRaesponsability.Product;
import com.example.ElectroShp.service.InsuranceDepartment;
import org.springframework.stereotype.Component;

@Component
public class InsuranceOpt implements AdditionalOptional{
    private final InsuranceDepartment insuranceDepartment;

    public InsuranceOpt(InsuranceDepartment insuranceDepartment) {
        this.insuranceDepartment = insuranceDepartment;
    }

    @Override
    public void apply(Order order) {
        order.getProducts()
                .stream()
                .filter(Product::isInsurance)
                .forEach(product -> insuranceDepartment.insuranceProd(product.getId(), order.getId()));

    }
}
