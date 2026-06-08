package com.example.lesson5;

import java.util.List;
import java.util.UUID;

public class OrderPresenter {

//    private final View view;
    private final CustomerModel customerModel;
    private final OrderModel orderModel;

    public OrderPresenter(CustomerModel model, OrderModel orderModel) {
        this.customerModel = model;
        this.orderModel = orderModel;
    }

    public void create(String customerId) {
        //нужно вычислить кастомера
        Customer customer = customerModel.getById(UUID.fromString(customerId));
        if (customer != null) {
            orderModel.create(customer);
        }
    }

    public List<Order> getAll() {
        return orderModel.getAll();
    }

    public List<Order> getByCustomer(String customerId) {
        //нужно вычислить кастомера
        Customer customer = customerModel.getById(UUID.fromString(customerId));
        if(customer != null) {
            return orderModel.getByCustomer(customer);
        }
        return List.of();
    }



}
