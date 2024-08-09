package com.example.be_electronicmenu.service;

import com.example.be_electronicmenu.model.OrderEmployee;
import com.example.be_electronicmenu.repository.OrderEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderEmployeeSrvice {
    @Autowired
    private OrderEmployeeRepository orderEmployeeRepository;

    public List<OrderEmployee> findAll() {return orderEmployeeRepository.findAll();}
    public Optional<OrderEmployee> findById(Long id) {return orderEmployeeRepository.findById(id);}
    public OrderEmployee save(OrderEmployee appOrder) {return orderEmployeeRepository.save(appOrder);}
    public void deleteById(Long id) {orderEmployeeRepository.deleteById(id);}
}
