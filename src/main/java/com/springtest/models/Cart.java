package com.springtest.models;

import java.util.List;
import java.util.Objects;

public class Cart {
    private List<Double> ItemIDs;
    public Cart(List<Double> ItemIDs){
        this.ItemIDs = ItemIDs;
    }

    public Cart() {

    }

    public List<Double> getItemIDs() {
        return ItemIDs;
    }

    public void setItemIDs(List<Double> itemIDs) {
        ItemIDs = itemIDs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Objects.equals(ItemIDs, cart.ItemIDs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ItemIDs);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "ItemIDs=" + ItemIDs +
                '}';
    }
}
