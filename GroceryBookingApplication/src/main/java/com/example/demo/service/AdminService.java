package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.ProductDto;

@Service
public class AdminService {

	static List<ProductDto> prodList = new ArrayList<>();
	static {
		ProductDto p1 = new ProductDto("P001","SUGAR",100.0d,40.0d);
		ProductDto p2 = new ProductDto("P002","MILK",50.0d,72.0d);
		ProductDto p3 = new ProductDto("P003","BREAD",90.0d,37.0d);
		ProductDto p4 = new ProductDto("P004","SALT",60.0d,40.0d);
		prodList.add(p1);
		prodList.add(p2);
		prodList.add(p3);
		prodList.add(p4);	
	}

	public List<ProductDto> loadAvailableProducts() {
		return prodList;
	} 
	
	public ProductDto loadProduct(String id) {
		return prodList.parallelStream().filter(p-> p.getProductId().equalsIgnoreCase(id)).findAny().orElse(null);
	} 
}
