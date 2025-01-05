package com.cdac.training1.ProductHandler.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.training1.ProductHandler.Model.Product;
//This Layer interact with Database
//JPA Repository is mainly used for managing the data in a spring Boot  Application
public interface ProductRepository extends JpaRepository<Product,Long>{

}
