package com.PauloVictor.dscommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PauloVictor.dscommerce.DTO.ProductDTO;
import com.PauloVictor.dscommerce.services.ProductService;

@RestController
@RequestMapping (value = "/product")
public class ProductController {

	@Autowired
	private ProductService service;
	
    
    @GetMapping (value = "/{id}")
	public ProductDTO findById(@PathVariable Long id) {
	 return service.findById(id);
    	
	
}
	
	
	
}
