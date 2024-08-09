package com.example.be_electronicmenu.service;

import com.example.be_electronicmenu.model.OrderItem;
import com.example.be_electronicmenu.repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;

    public List<OrderItem> findAll() {return orderItemRepository.findAll();}
    public Optional<OrderItem> findById(Long id) {return orderItemRepository.findById(id);}
    public OrderItem save(OrderItem orderItem) {return orderItemRepository.save(orderItem);}
    public void deleteById(Long id) {orderItemRepository.deleteById(id);}
}
