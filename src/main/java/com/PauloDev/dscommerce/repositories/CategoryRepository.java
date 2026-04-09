package com.PauloDev.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PauloDev.dscommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
