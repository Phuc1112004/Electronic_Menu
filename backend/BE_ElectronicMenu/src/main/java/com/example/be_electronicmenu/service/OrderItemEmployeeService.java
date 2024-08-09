package com.example.be_electronicmenu.service;

import com.example.be_electronicmenu.model.OrderItemEmployee;
import com.example.be_electronicmenu.repository.OrderItemEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemEmployeeService {
    @Autowired
    private OrderItemEmployeeRepository orderItemEmployeeRepository;

    public List<OrderItemEmployee> findAll() {return orderItemEmployeeRepository.findAll();}
    public Optional<OrderItemEmployee> findById(Long id) {return orderItemEmployeeRepository.findById(id);}
    public OrderItemEmployee save(OrderItemEmployee appOrder) {return orderItemEmployeeRepository.save(appOrder);}
    public void deleteById(Long id) {orderItemEmployeeRepository.deleteById(id);}
}
