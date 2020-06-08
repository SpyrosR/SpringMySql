package com.example.SpringMySql.service;

import com.example.SpringMySql.model.Order;
import java.util.List;

public interface OrderService {
    List<Order> findAll();
}
