package com.springtest.models;

import java.util.Objects;

public class Customer {
    private String name;
    private String email;
    private Cart cart;

    public Customer(String name, String email, Cart cart) {
        this.name = name;
        this.email = email;
        this.cart = cart;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(cart, customer.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, cart);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cart=" + cart +
                '}';
    }
}
