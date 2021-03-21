package com.pizzaday.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pizzaday.product.model.ProductsModel;
import com.pizzaday.product.repository.ProductRepo;
@Service
public class ProductService {
	
@Autowired
private ProductRepo repo;
	public ProductsModel addproduct(ProductsModel product) {
	  return repo.save(product);
	}
	public List<ProductsModel> getproduct() {
		return repo.findAll();
	}
	
}
