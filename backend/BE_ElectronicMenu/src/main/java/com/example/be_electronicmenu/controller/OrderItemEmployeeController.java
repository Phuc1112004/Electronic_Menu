package com.example.be_electronicmenu.controller;

import com.example.be_electronicmenu.service.OrderItemEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/order_i_employees")
public class OrderItemEmployeeController {
    @Autowired
    private OrderItemEmployeeService orderItemEmployeeService;
}
