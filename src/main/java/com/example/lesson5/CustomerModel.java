package com.example.lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class CustomerModel {

    private List<Customer> storage = new ArrayList<>();

    public void create(String name){
        storage.add(new Customer(name));
    }

    public List<Customer> getAll(){
        return List.copyOf(storage);
        //return new ArrayList<>(storage);
    }

    public Customer getById(UUID id){
        return  storage.stream()
                .filter(it -> Objects.equals(it.getId(), id))
                .findFirst()
                .orElse(null);
    }

}
