package com.example.lesson5;

import java.util.Objects;
import java.util.UUID;

public class Order {

    private static int counter = 1;

    private final UUID id;
    private final String number;
    private final Customer customer;

    public Order(Customer customer) {
        this.id = UUID.randomUUID();
        this.number = "#" + counter++;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "["  + id + "] (" + number + ") Owner = (" + customer + ")";
    }
}
