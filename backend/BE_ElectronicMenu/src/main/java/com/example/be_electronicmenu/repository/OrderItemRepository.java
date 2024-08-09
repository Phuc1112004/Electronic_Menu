package com.example.be_electronicmenu.repository;

import com.example.be_electronicmenu.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
