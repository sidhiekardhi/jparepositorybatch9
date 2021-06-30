package com.example.latihanjpa.service;

import java.util.List;

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
	
	public List<Product> getProducts() {
		return productRepository.findAll();
	}
	
	public Product getById(int id) {
		return productRepository.findById(id).orElse(null);
	}
	
	public String deleteProduct(int id) {
		productRepository.deleteById(id);
		return "product deleted";
	}
	
	public Product updateProduct(Product product) {
		Product existingProduct= productRepository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return productRepository.save(existingProduct);
	}
	
}
