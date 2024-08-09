package com.example.be_electronicmenu.service;

import com.example.be_electronicmenu.model.Customer;
import com.example.be_electronicmenu.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public List<Customer> findAll() {return customerRepository.findAll();}
    public Optional<Customer> findById(Long id) {return customerRepository.findById(id);}
    public Customer save(Customer appOrder) {return customerRepository.save(appOrder);}
    public void deleteById(Long id) {customerRepository.deleteById(id);}
}
