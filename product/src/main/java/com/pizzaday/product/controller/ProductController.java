package com.pizzaday.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pizzaday.product.model.ProductsModel;
import com.pizzaday.product.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	
	@RequestMapping(path="/products" , method=RequestMethod.POST )
	public String addproduct(@RequestBody ProductsModel product) {
		productService.addproduct(product);
		return "success";
	}
//	@GetMapping("/products")
	@RequestMapping(path="/products" , method=RequestMethod.GET )
	@CrossOrigin(origins="http://localhost:4200")
	public List<ProductsModel> getproduct() {
	  return productService.getproduct();
	}
	
	
}
