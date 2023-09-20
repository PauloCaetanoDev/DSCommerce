package com.PauloVictor.dscommerce.DTO;

import com.PauloVictor.dscommerce.entities.Product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductDTO {

	private Long id;
	
	@Size (min = 3,max = 80,message = "nome precisa ter entre 3 e 80 caracteres")
	@NotBlank (message = "campo requerido")
	private String name;
	
	@Size (min = 10,message = "descricao precisa no minimo ter 10 caracteres")
	@NotBlank (message = "campo requerido")
	private String description;
	
	@Positive (message = "valor deve ser positivo")
	private Double price;
	
	private String imgUrl;
	

	public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgUrl = imgUrl;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Double getPrice() {
		return price;
	}

	public String getImgUrl() {
		return imgUrl;
	}
     
		
	public ProductDTO(Product entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.description = entity.getDescription();
		this.price = entity.getPrice();
		this.imgUrl = entity.getImgUrl();
	}
	
	
}
