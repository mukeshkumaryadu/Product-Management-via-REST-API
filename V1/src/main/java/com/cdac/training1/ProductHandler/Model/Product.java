package com.cdac.training1.ProductHandler.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Name should be noun real time object 
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class Product {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY,generator = "prod_seq")
@SequenceGenerator(name = "prod_seq",initialValue = 1000,allocationSize = 1)
private Long pid;

@Column(nullable = false)
private String name;

@Column(nullable = false)
private String brand;

@Column(nullable = false)
private String madein;

@Column(nullable = false)
private float price;
}
