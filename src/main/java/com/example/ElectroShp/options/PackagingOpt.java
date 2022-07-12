package com.example.ElectroShp.options;

import com.example.ElectroShp.chainOfRaesponsability.Order;
import com.example.ElectroShp.chainOfRaesponsability.Product;
import com.example.ElectroShp.service.PackagingDepartment;
import org.springframework.stereotype.Component;

@Component
public class PackagingOpt implements AdditionalOptional{
    private final PackagingDepartment packagingDepartment;

    public PackagingOpt(PackagingDepartment packagingDepartment) {
        this.packagingDepartment = packagingDepartment;
    }

    @Override
    public void apply(Order order) {
        order.getProducts()
                .stream()
                .filter(Product::isFestivePackaging)
                .forEach(product -> packagingDepartment.festivelyPack(product.getId(), order.getId()));


    }
}
