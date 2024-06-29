package com.example.demo.model;

import java.io.Serializable;

public class ProductDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String productId;
	private String productName;
	private Double productQty;
	private Double productPrice;
	
	
	
	public ProductDto(String productId, String productName, Double productQty, Double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQty = productQty;
		this.productPrice = productPrice;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductQty() {
		return productQty;
	}
	public void setProductQty(Double productQty) {
		this.productQty = productQty;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "ProductDto [productId=" + productId + ", productName=" + productName + ", productQty=" + productQty
				+ ", productPrice=" + productPrice + "]";
	} 
	
	
}
