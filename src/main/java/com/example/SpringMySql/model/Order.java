package com.example.SpringMySql.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Getter @Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int orderId;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("order id=").append(orderId);
        sb.append(", first name='").append(firstName).append('\'');
        sb.append(", last name=").append(lastName);
        sb.append('}');
        return sb.toString();
    }
}