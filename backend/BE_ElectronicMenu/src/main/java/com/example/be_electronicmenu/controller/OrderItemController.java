package com.example.be_electronicmenu.controller;

import com.example.be_electronicmenu.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/order_items")
public class OrderItemController {
    @Autowired
    private OrderItemService orderItemService;
}
