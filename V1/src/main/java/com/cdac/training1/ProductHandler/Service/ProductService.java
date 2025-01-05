package com.cdac.training1.ProductHandler.Service;

import org.springframework.stereotype.Service;

import com.cdac.training1.ProductHandler.Model.Product;
import com.cdac.training1.ProductHandler.Repository.ProductRepository;

@Service
public class ProductService {
	//field Injections
	// constructor injection =>final
	private final ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		 //constructor dependency injection
		this.productRepository = productRepository;
	}
	public Product saveProduct(Product p) {
		System.out.println("mk");
		
		return productRepository.save(p);//invokes predefined method save() of JPA Repo
	} 
}
