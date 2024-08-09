package com.example.be_electronicmenu.repository;

import com.example.be_electronicmenu.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
