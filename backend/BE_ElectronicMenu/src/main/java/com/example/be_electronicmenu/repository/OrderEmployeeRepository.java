package com.example.be_electronicmenu.repository;

import com.example.be_electronicmenu.model.OrderEmployee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderEmployeeRepository extends JpaRepository<OrderEmployee, Long> {
}
