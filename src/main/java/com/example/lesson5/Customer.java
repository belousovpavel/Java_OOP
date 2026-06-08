package com.example.lesson5;

import java.util.Objects;
import java.util.UUID;

public class Customer {

    private final UUID id;
    private final String name;

    public Customer(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "["  + id + "] " + name;
    }
}
