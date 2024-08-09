package com.example.be_electronicmenu.controller;


import com.example.be_electronicmenu.service.AppOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/orders")
public class AppOrderController {
    @Autowired
    private AppOrderService appOrderService;
}
