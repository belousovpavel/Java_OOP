package com.example.lesson5;

import java.util.List;

public class CustomerPresenter {

//    private final View view;
    private final CustomerModel model;

    public CustomerPresenter(CustomerModel model) {
//        this.view = view;
        this.model = model;
    }

    public void create(String customerName) {
        model.create(customerName);
    }

    public List<Customer> getAll() {
        return model.getAll();
    }

}
