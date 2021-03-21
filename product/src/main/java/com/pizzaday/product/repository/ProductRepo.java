package com.pizzaday.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pizzaday.product.model.ProductsModel;

public interface ProductRepo extends JpaRepository<ProductsModel , Integer> {

}
