package com.example.SpringMySql.service;

import com.example.SpringMySql.model.Order;
import com.example.SpringMySql.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository repository;

    @Override
    public List<Order> findAll() {
        return (List<Order>) repository.findAll();
    }
}
