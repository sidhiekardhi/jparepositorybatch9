package com.example.latihanjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.latihanjpa.entity.Product;
import com.example.latihanjpa.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	
}
