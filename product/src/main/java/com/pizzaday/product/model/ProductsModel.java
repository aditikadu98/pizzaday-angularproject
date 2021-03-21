package com.pizzaday.product.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductsModel {
	
	@Id	
	private int productId;
	private String productName;
	private int productQuantity;
	private int productprice;
	public ProductsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductsModel(int productId, String productName, int productQuantity, 
			int productprice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productprice = productprice;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	
}
