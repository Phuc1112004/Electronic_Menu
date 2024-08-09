package com.example.be_electronicmenu.repository;

import com.example.be_electronicmenu.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
