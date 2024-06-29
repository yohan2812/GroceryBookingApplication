package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ProductDto;
import com.example.demo.service.AdminService;

@RestController
@RequestMapping("/api/v1")
public class GroceryController {

	@Autowired
	private AdminService adminService;
	
	@GetMapping("/products")
	public List<ProductDto> loadAvailableProducts() {
		return adminService.loadAvailableProducts();
	}
	
	@GetMapping("/product")
	public ProductDto loadProduct(@RequestParam("id") String id) {
		return adminService.loadProduct(id);
	}
}
