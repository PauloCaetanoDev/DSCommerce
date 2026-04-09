package com.PauloDev.dscommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PauloDev.dscommerce.entities.OrderItem;
import com.PauloDev.dscommerce.entities.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
