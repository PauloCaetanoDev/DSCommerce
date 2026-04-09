package com.PauloDev.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PauloDev.dscommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
