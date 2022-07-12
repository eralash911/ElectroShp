package com.example.ElectroShp.options;

import com.example.ElectroShp.chainOfRaesponsability.Order;
import com.example.ElectroShp.chainOfRaesponsability.Product;
import com.example.ElectroShp.service.TestingDepartment;
import org.springframework.stereotype.Component;

@Component
public class TestingOpt implements AdditionalOptional{
    private final TestingDepartment testingDepartment;

    public TestingOpt(TestingDepartment testingDepartment) {
        this.testingDepartment = testingDepartment;
    }

    @Override
    public void apply(Order order) {
        order.getProducts()
                .stream()
                .filter(Product::isTesting)
                .forEach(product -> testingDepartment.testProduct(product.getId(), order.getId()));
    }
}
