package com.example.SpringMySql.controller;

import com.example.SpringMySql.model.Order;
import com.example.SpringMySql.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private OrderServiceImpl orderService;

    @GetMapping("/showOrders")
    public String findOrders(Model model) {

        List orders = (List<Order>) orderService.findAll();

        model.addAttribute("orders", orders);

        return "showOrders";
    }
}
