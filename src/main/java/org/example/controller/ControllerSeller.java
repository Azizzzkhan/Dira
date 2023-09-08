package org.example.controller;

import org.example.model.Customer;
import org.example.model.Product;
import org.example.model.Seller;

public class ControllerSeller {
    private Seller seller;
    private Customer customer;


    public ControllerSeller(Seller seller, Customer customer) {
        this.seller = seller;
        this.customer = customer;
    }


    //Выставление счета
    public void invoicing() {
        double finalPrice = 0.0;
        for (Product product : customer.getBasket()) {
            finalPrice = finalPrice + product.getQuantity() * product.getPrice();
        }
        System.out.println(finalPrice);
        customer.setBasketPrice(finalPrice);
    }
}
