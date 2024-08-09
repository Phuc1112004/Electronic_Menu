package com.example.be_electronicmenu.controller;

import com.example.be_electronicmenu.repository.OrderEmployeeRepository;
import com.example.be_electronicmenu.service.OrderEmployeeSrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/order_employees")
public class OrderEmployeeController {
    @Autowired
    private OrderEmployeeSrvice orderEmployeeSrvice;
}
