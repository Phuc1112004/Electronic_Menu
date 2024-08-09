package com.example.be_electronicmenu.controller;

import com.example.be_electronicmenu.service.RestaurantTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/employees")
public class RestaurantTableController {
    @Autowired
    private RestaurantTableService restaurantTableService;

}
