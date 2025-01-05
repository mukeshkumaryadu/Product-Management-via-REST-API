package com.cdac.training1.ProductHandler.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.training1.ProductHandler.Model.Product;
import com.cdac.training1.ProductHandler.Service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	//Field DI		should not do in real project
	@Autowired
	private ProductService productService;
	
@PostMapping("/products")
public Product saveProject(@RequestBody Product p) 
{
	return productService.saveProduct(p);
}
}
