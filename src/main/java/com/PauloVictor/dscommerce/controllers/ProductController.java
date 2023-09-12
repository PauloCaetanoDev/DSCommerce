package com.PauloVictor.dscommerce.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PauloVictor.dscommerce.entities.Product;
import com.PauloVictor.dscommerce.repositories.ProductRepository;

@RestController
@RequestMapping (value = "/product")
public class ProductController {

    @Autowired
	private ProductRepository repository;
	
    
    @GetMapping
	public String teste() {
		Optional<Product> result = repository.findById(1L);
		Product product = result.get();
		return product.getName();
	}
	
	
}
